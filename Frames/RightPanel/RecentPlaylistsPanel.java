package Frames.RightPanel;
import classes.profile;
import classes.Playlist;

import java.util.ArrayList;

import javax.swing.JPanel;

public class RecentPlaylistsPanel extends JPanel {

    private profile user;
    private ArrayList<Playlist> playlists;

    public RecentPlaylistsPanel(profile user) {
        this.setSize(284, 293);
        
        
        this.user = user;
        playlists = this.user.getPlaylists();

        
    }
    
}
