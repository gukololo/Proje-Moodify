package classes.Frames.LeftPanel;

import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;

public class generalPanel extends JPanel{

    private JLabel general;
    private JButton settings;
    private JButton logOut;
    private JPanel panel;

    generalPanel(){


        panel.setSize(366,111);
        panel.setLayout(new GridLayout(3,1));

        general = new JLabel("MENU");
        panel.add(general);
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

        panel.add(settings);
        panel.add(logOut);

    }
    
}
