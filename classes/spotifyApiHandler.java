package classes;

import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.json.JSONArray;
import org.json.JSONObject;
import java.io.BufferedReader;
import java.io.InputStreamReader;

public class spotifyApiHandler {


public class SpotifyLogin {

    // Spotify'dan alınan bilgiler
    private static final String CLIENT_ID = "YOUR_CLIENT_ID";
    private static final String CLIENT_SECRET = "YOUR_CLIENT_SECRET";
    private static final String REDIRECT_URI = "http://localhost:8888/callback";
    private static final String AUTH_URL = "https://accounts.spotify.com/authorize";
    private static final String TOKEN_URL = "https://accounts.spotify.com/api/token";
    private static final String USER_PROFILE_URL = "https://api.spotify.com/v1/me";
    private static final String LIKED_SONGS_URL = "https://api.spotify.com/v1/me/tracks";
    // Song info
    // tempo, dancability, liveliness, intrumentalness, uri, mood, acousticness, energy, genre

    public static void main(String[] args) throws Exception {
        System.out.println("Please authorize the app by visiting this URL: ");
        String authLink = AUTH_URL + "?client_id=" + CLIENT_ID +
                "&response_type=code&redirect_uri=" + REDIRECT_URI + "&scope=user-read-private%20user-library-read";
        System.out.println(authLink);

        System.out.println("Enter the authorization code: ");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String authCode = reader.readLine();

        String accessToken = getAccessToken(authCode);
        
        getUserProfile(accessToken);
        getLikedSongs(accessToken);  // Yeni metot çağrısı
    }

    private static String getAccessToken(String authCode) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpPost post = new HttpPost(TOKEN_URL);
        
        post.setHeader("Content-Type", "application/x-www-form-urlencoded");
        post.setHeader("Authorization", "Basic " + java.util.Base64.getEncoder().encodeToString((CLIENT_ID + ":" + CLIENT_SECRET).getBytes()));

        String requestBody = "grant_type=authorization_code&code=" + authCode + "&redirect_uri=" + REDIRECT_URI;
        post.setEntity(new org.apache.http.entity.StringEntity(requestBody));
        
        HttpResponse response = client.execute(post);
        String responseBody = EntityUtils.toString(response.getEntity());
        JSONObject json = new JSONObject(responseBody);

        return json.getString("access_token");
    }

    private static void getUserProfile(String accessToken) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(USER_PROFILE_URL);
        get.setHeader("Authorization", "Bearer " + accessToken);
        
        HttpResponse response = client.execute(get);
        String responseBody = EntityUtils.toString(response.getEntity());
        JSONObject json = new JSONObject(responseBody);

        System.out.println("User ID: " + json.getString("id"));
        System.out.println("Display Name: " + json.getString("display_name"));
    }

    // Yeni metot: Beğenilen şarkıları çekme
    private static void getLikedSongs(String accessToken) throws Exception {
        CloseableHttpClient client = HttpClients.createDefault();
        HttpGet get = new HttpGet(LIKED_SONGS_URL);
        get.setHeader("Authorization", "Bearer " + accessToken);

        HttpResponse response = client.execute(get);
        String responseBody = EntityUtils.toString(response.getEntity());
        JSONObject json = new JSONObject(responseBody);
        JSONArray items = json.getJSONArray("items");

        System.out.println("Liked Songs:");
        for (int i = 0; i < items.length(); i++) {
            JSONObject trackObject = items.getJSONObject(i).getJSONObject("track");
            String songName = trackObject.getString("name");
            String artistName = trackObject.getJSONArray("artists").getJSONObject(0).getString("name");
            System.out.println((i + 1) + ". " + songName + " by " + artistName);
        }
    }
}


    
}
