package classes.Frames.LeftPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;

public class menuPanel extends JPanel{

    private JLabel menu;
    private JButton home;
    private JButton trends;
    private JPanel panel;

    menuPanel(){

        panel.setSize(366,111);
        panel.setLayout(new GridLayout(3,1));

        menu = new JLabel("MENU");
        panel.add(menu);
        home = new JButton("HOME");
        trends = new JButton("Trends");

        home.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open home page.
            }
        });

        trends.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open trends page.
            }
        });

        panel.add(home);
        panel.add(trends);

    }
    
}
