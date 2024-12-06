package Frames.LeftPanel;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class generalPanel extends JPanel{

    private JLabel general;
    private JButton settings;
    private JButton logOut;
    

    generalPanel(){


        setSize(284,111);
        setLayout(new GridLayout(3,1));
        setBackground(Color.GRAY);

        general = new JLabel("MENU");
        add(general);
        settings = new JButton("SETTINGS");
        logOut = new JButton("LOG OUT");

        settings.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open settings page.
            }
        });

        logOut.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open log in page.
            }
        });

        add(settings);
        add(logOut);

    }
    
}
