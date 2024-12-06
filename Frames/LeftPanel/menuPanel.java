package Frames.LeftPanel;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.event.*;
import java.awt.*;

public class menuPanel extends JPanel{

    private JLabel menu;
    private JButton home;
    private JButton trends;

    menuPanel(){

        setSize(284,111);
        setLayout(new GridLayout(3,1));
        setBackground(Color.GREEN);


        menu = new JLabel("MENU");
        add(menu);
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

        add(home);
        add(trends);

    }
    
}
