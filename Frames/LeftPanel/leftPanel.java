package Frames.LeftPanel;

import javax.swing.JPanel;

import classes.profile;

import javax.swing.JLabel;
import java.awt.*;

public class leftPanel extends JPanel{

    private friendsPanel friends;
    private menuPanel menu;
    private libraryPanel library;
    private generalPanel general;
    private JLabel moodify;
    // private profile user;

    public leftPanel(){

        
        setBackground(Color.red);
        setSize(300,1080);
        setLayout(new GridLayout(5,1));
        setBackground(Color.RED);


        moodify = new JLabel("MOODIFY");
        menu = new menuPanel();
        library = new libraryPanel();
        // user = new profile();   
        friends = new friendsPanel();
        general = new generalPanel();

        add(moodify);
        add(menu);
        add(library);
        add(friends);
        add(general);


    }
    
}
