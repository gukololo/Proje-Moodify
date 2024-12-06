package Frames.RightPanel;
import classes.profile;
import classes.Playlist;
import java.awt.*;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class RecentPlaylistsPanel extends JPanel {

    private profile user;
    private ArrayList<Playlist> playlists;

    public RecentPlaylistsPanel() {
        setBackground(Color.red);
        this.setSize(284, 293);    
        setLayout(new GridLayout(4,3));
        //this.user = user;
        //playlists = this.user.getPlaylists();

        
        JButton b1 = new JButton(); 
        //JLabel recentPlaylistName1 = new JLabel(playlists.get(0).getPlaylistName());
        JLabel recentPlaylistName1 = new JLabel("first");
        JButton b2 = new JButton();
        //JLabel recentPlaylistName2 = new JLabel(playlists.get(1).getPlaylistName());
        JLabel recentPlaylistName2 = new JLabel("second");
        JButton b3 = new JButton();
        //JLabel recentPlaylistName3 = new JLabel(playlists.get(2).getPlaylistName());
        JLabel recentPlaylistName3 = new JLabel("third");
        JButton b4 = new JButton();
        // JLabel recentPlaylistName4 = new JLabel(playlists.get(3).getPlaylistName());
        JLabel recentPlaylistName4 = new JLabel("fourth");
        JButton b5 = new JButton();
        // JLabel recentPlaylistName5 = new JLabel(playlists.get(4).getPlaylistName());
        JLabel recentPlaylistName5 = new JLabel("five");
        JButton b6 = new JButton();
         // JLabel recentPlaylistName6 = new JLabel(playlists.get(5).getPlaylistName());
        JLabel recentPlaylistName6 = new JLabel("sixth");

        add(b1);
        add(b2);
        add(b3);
        add(recentPlaylistName1);
        add(recentPlaylistName2);
        add(recentPlaylistName3);
        add(b4);
        add(b5);
        add(b6);
        add(recentPlaylistName4);
        add(recentPlaylistName5);
        add(recentPlaylistName6);



    }
    
}
