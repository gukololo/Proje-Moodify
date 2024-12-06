package Frames.RightPanel;
import javax.swing.*;
import java.awt.*;
import classes.profile;

public class StatsPanel extends JPanel {
    
    profile user ;

    StatsPanel(){

        setSize(284, 267);
        setLayout(new GridLayout(4,2));
        add(new JLabel("Your Stats"));
        add(new JLabel(""));
        add(new JLabel("F "));
        add(new JLabel("Playlist Added \n\n" + user.getPlaylists().size() +" playlists"));
        add(new JLabel("S "));
        add(new JLabel("Playlists Followers \n\n" + user.getFollowers().size() + " followers"));
        add(new JLabel("T "));
        add(new JLabel("Recent Song \n\n" + user.getRecentSong().getSongName() + " - " + user.getRecentSong().getSongArtist().getARTISTNAME() ));
        
    }
    public static void main(String[] args) {
        JFrame a = new JFrame();
        StatsPanel b = new StatsPanel();
        a.add(b);
        a.setVisible(true); 
    }
    
}
