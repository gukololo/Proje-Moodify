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
    private JPanel panel;
    private profile user;

    leftPanel(){

        panel.setSize(400,1080);
        panel.setLayout(new GridLayout(5,1));

        moodify = new JLabel("MOODIFY");
        menu = new menuPanel();
        library = new libraryPanel();
        user = new profile();   
        friends = new friendsPanel(user);
        general = new generalPanel();

        panel.add(moodify);
        panel.add(menu);
        panel.add(library);
        panel.add(friends);
        panel.add(general);


    }
    
}
