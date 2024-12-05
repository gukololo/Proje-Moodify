package classes;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.ImageIcon;

public class Playlist {

    //variables
    protected int totalTime;
    protected boolean isGenre;
    protected String playlistName;
    protected ImageIcon pictureOfPlaylist;
    protected LocalDateTime date;
    protected int like;
    protected int songSize;
    protected int mainMood;
    protected String mainGenre;
    protected profile owner;
    protected ArrayList<song> songs;

    // Finds the most common genre between all songs in the playlist.
    public String findMainGenre(){

        Random random = new Random();
        int max = 0;
        ArrayList<String> mostFrequentGenres = new ArrayList<>();

        for (int i = 0; i < songs.size(); i++) {

            String currentGenre = songs.get(i).getSongGenre();
            int count = 0;
            for(int j = 0; j < songs.size(); j++) {
                
                if (currentGenre.equals(songs.get(j).getSongGenre())) {
                    count++;
                }
            }
            if (count > max) {
                max = count;
                mostFrequentGenres.clear();
                mostFrequentGenres.add(currentGenre);
            }
            else if (count == max && !mostFrequentGenres.contains(currentGenre)) {
                mostFrequentGenres.add(currentGenre);
            }
        }

        if (mostFrequentGenres.size() > 1) {
            int select = random.nextInt(mostFrequentGenres.size());
            return mostFrequentGenres.get(select);
        }
        else{
            return mostFrequentGenres.get(0);
        }
    }

    public void addSong(song newSong){
        songs.add(newSong);
    }

    public void removeSong(song oldSong){
        songs.add(oldSong);
    }

    //getters and setters
    public int getTotalTime() {
        return totalTime;
    }
    public void setTotalTime(int totalTime) {
        this.totalTime = totalTime;
    }
    public boolean isGenre() {
        return isGenre;
    }
    public void setGenre(boolean isGenre) {
        this.isGenre = isGenre;
    }
    public String getPlaylistName() {
        return playlistName;
    }
    public void setPlaylistName(String playlistName) {
        this.playlistName = playlistName;
    }
    public ImageIcon getPictureOfPlaylist() {
        return pictureOfPlaylist;
    }
    public void setPictureOfPlaylist(ImageIcon pictureOfPlaylist) {
        this.pictureOfPlaylist = pictureOfPlaylist;
    }
    public LocalDateTime getDate() {
        return date;
    }
    public void setDate(LocalDateTime date) {
        this.date = date;
    }
    public int getLike() {
        return like;
    }
    public void setLike(int like) {
        this.like = like;
    }
    public int getSongSize() {
        return songSize;
    }
    public void setSongSize(int songSize) {
        this.songSize = songSize;
    }
    public int getMainMood() {
        return mainMood;
    }
    public void setMainMood(int mainMood) {
        this.mainMood = mainMood;
    }
    public String getMainGenre() {
        return mainGenre;
    }
    public void setMainGenre(String mainGenre) {
        this.mainGenre = mainGenre;
    }
    public profile getOwner() {
        return owner;
    }
    public void setOwner(profile owner) {
        this.owner = owner;
    }




}
