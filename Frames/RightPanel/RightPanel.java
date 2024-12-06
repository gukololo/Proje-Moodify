package classes.Frames.RightPanel;
import classes.profile;

import javax.swing.JPanel;

import java.awt.*;

public class RightPanel extends JPanel {

    private PlayingSongPanel playingSongPanel;
    private StatsPanel statsPanel;
    private RecentPlaylistsPanel recentPlaylistsPanel;
    private profile user;


    public RightPanel(profile user) {

        this.user = user;

        playingSongPanel = new PlayingSongPanel();
        statsPanel = new StatsPanel();
        recentPlaylistsPanel = new RecentPlaylistsPanel(user);

        this.setSize(400, 1080);
        this.setLayout(new GridLayout(3, 1));

        this.add(playingSongPanel);
        this.add(statsPanel);
        this.add(recentPlaylistsPanel);

    }





    
}
