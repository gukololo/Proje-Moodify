package classes;

import java.util.ArrayList;
import javax.swing.ImageIcon;

public class profile {

    // variables - features of profiles
    protected ArrayList <profile> followers;
    protected ArrayList <profile> followings;
    protected ArrayList <Playlist> playlists;
    protected ImageIcon profilePicture;
    protected int currentMood;
    protected String favoriteGenre;
    protected String password;
    protected String userName;
    protected String mail;
    protected song recentSong;

    //getters and setters

    public ArrayList<profile> getFollowers() {
        return followers;
    }
    public void setFollowers(ArrayList<profile> followers) {
        this.followers = followers;
    }
    public ArrayList<profile> getFollowings() {
        return followings;
    }
    public void setFollowings(ArrayList<profile> followings) {
        this.followings = followings;
    }
    public ArrayList<Playlist> getPlaylists() {
        return playlists;
    }
    public void setPlaylists(ArrayList<Playlist> playlists) {
        this.playlists = playlists;
    }
    public ImageIcon getProfilePicture() {
        return profilePicture;
    }
    public void setProfilePicture(ImageIcon profilePicture) {
        this.profilePicture = profilePicture;
    }
    public int getCurrentMood() {
        return currentMood;
    }
    public void setCurrentMood(int currentMood) {
        this.currentMood = currentMood;
    }
    public String getFavoriteGenre() {
        return favoriteGenre;
    }
    public void setFavoriteGenre(String favoriteGenre) {
        this.favoriteGenre = favoriteGenre;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getMail() {
        return mail;
    }
    public void setMail(String mail) {
        this.mail = mail;
    }
    public song getRecentSong() {
        return recentSong;
    }
    public void setRecentSong(song recentSong) {
        this.recentSong = recentSong;
    }

}
