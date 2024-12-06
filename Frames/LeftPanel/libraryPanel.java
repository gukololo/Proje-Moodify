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
    

    libraryPanel(){

        setSize(284,148);
        setLayout(new GridLayout(4,1));
        setBackground(Color.MAGENTA);

        library = new JLabel("LIBRARY");
        add(library);
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

        add(playlists);
        add(likedSongs);
        add(favoriteArtists);


    }

    
}
