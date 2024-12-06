package Frames.RightPanel;
import classes.profile;
import javax.swing.JPanel;

import java.awt.*;

public class RightPanel extends JPanel {

    private PlayingSongPanel playingSongPanel;
    private StatsPanel statsPanel;
    private RecentPlaylistsPanel recentPlaylistsPanel;
    //private profile user;


    public RightPanel() {

        setBackground(Color.RED);
        // this.user = user;

        playingSongPanel = new PlayingSongPanel();
        statsPanel = new StatsPanel();
        recentPlaylistsPanel = new RecentPlaylistsPanel();

        this.setSize(400, 1080);
        this.setLayout(new GridLayout(3, 1));

       
        this.add(statsPanel);
        this.add(recentPlaylistsPanel);
        this.add(playingSongPanel);

    }





    
}
