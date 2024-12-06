package Frames.LeftPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;

public class libraryPanel extends JPanel{

    private JLabel library;
    private JButton playlists;
    private JButton likedSongs;
    private JButton favoriteArtists;
    private JPanel panel;

    libraryPanel(){

        panel.setSize(366,148);
        panel.setLayout(new GridLayout(4,1));

        library = new JLabel("LIBRARY");
        panel.add(library);
        playlists = new JButton("PLAYLISTS");
        likedSongs = new JButton("LIKED SONGS");
        favoriteArtists = new JButton("FAVORITE ARTISTS");

        playlists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open playlists page.
            }
        });

        likedSongs.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open liked songs page.
            }
        });
        favoriteArtists.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open favorite artists page.
            }
        });

        panel.add(playlists);
        panel.add(likedSongs);
        panel.add(favoriteArtists);


    }

    
}
