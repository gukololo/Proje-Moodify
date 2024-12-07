package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class settingsPage2 extends JFrame{

    public static void main(String[] args) {
        
        settingsPage2 sPage2 = new settingsPage2();
        sPage2.setVisible(true);
    }

    public settingsPage2(){

        setTitle("Settings Page 2");
        setSize(1320,1080);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        add(createSettingsPage2Panel());

    }

    JPanel createSettingsPage2Panel(){

        JPanel panel = new JPanel(new BorderLayout());
        panel.setSize(1320,1080);
        
        JPanel searchPanel = new JPanel(new BorderLayout());
        searchPanel.setPreferredSize(new Dimension(1320,50));

        JTextField searchBar = new JTextField("Search...");
        searchBar.setBackground(Color.LIGHT_GRAY);
        searchPanel.add(searchBar,BorderLayout.CENTER);

        JPanel belowPanel = new JPanel(new BorderLayout());
        belowPanel.setPreferredSize(new Dimension(1320,1030));
        belowPanel.setBackground(new Color(85,0,0));

        belowPanel.add(changePassword(), BorderLayout.WEST);

        JPanel rightSide = new JPanel(new BorderLayout());
        rightSide.add(changeMail(),BorderLayout.NORTH);
        rightSide.add(changeUsername(),BorderLayout.CENTER);

        JPanel fillerPanel = new JPanel();
        fillerPanel.setBackground(new Color(85,0,0));
        fillerPanel.setPreferredSize(new Dimension(660,205));
        rightSide.add(fillerPanel,BorderLayout.SOUTH);

        belowPanel.add(rightSide, BorderLayout.EAST);

        panel.add(searchPanel, BorderLayout.NORTH);
        panel.add(belowPanel, BorderLayout.CENTER);

        return panel;
    }

    JPanel changePassword(){

        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(660,1030));

        JPanel subPanel = new JPanel(new BorderLayout());
        subPanel.setPreferredSize(new Dimension(660,155));
        subPanel.add(setLabel("Changing Password",28), BorderLayout.CENTER);
        subPanel.setBackground(new Color(85,0,0));

        JPanel subPanel2 = new JPanel(new GridLayout(4,2,10,10));
        subPanel2.setPreferredSize(new Dimension(660,412));
        subPanel2.setBackground(new Color(85,0,0));
        subPanel2.add(setLabel("Enter previous password: ",16));
        subPanel2.add(getTextField());
        subPanel2.add(setLabel("Enter new password: ",16));
        subPanel2.add(getTextField());
        subPanel2.add(setLabel("Enter new password again: ",16));
        subPanel2.add(getTextField());
        
        JButton button = new JButton("Change Password!");
        button.setBackground(new Color(144,238,144));
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update password of the user.
            }
        });

        subPanel2.add(button);

        JPanel subpanel3 = new JPanel();
        subpanel3.setBackground(new Color(85,0,0));
        subpanel3.setSize(new Dimension(660,463));

        panel.add(subPanel, BorderLayout.NORTH);
        panel.add(subPanel2, BorderLayout.CENTER);
        panel.add(subpanel3, BorderLayout.SOUTH);

        return panel;
    }
    JPanel changeMail(){

        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(660,464));

        JPanel subPanel = new JPanel(new BorderLayout());
        subPanel.setPreferredSize(new Dimension(660,155));
        subPanel.add(setLabel("Changing Password",28),BorderLayout.CENTER);
        subPanel.setBackground(new Color(85,0,0));

        JPanel subPanel2 = new JPanel(new GridLayout(3,2,10,10));
        subPanel2.setPreferredSize(new Dimension(660,309));
        subPanel2.setBackground(new Color(85,0,0));
        subPanel2.add(setLabel("Enter new e-mail: ", 16));
        subPanel2.add(getTextField());
        subPanel2.add(setLabel("Enter password: ",16));
        subPanel2.add(getTextField());

        JButton button = new JButton("Change E-mail!");
        button.setBackground(new Color(144,238,144));
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update e-mail of the user.
            }
        });

        subPanel2.add(button);

        panel.add(subPanel, BorderLayout.NORTH);
        panel.add(subPanel2, BorderLayout.CENTER);
        
        return panel;
    }
    JPanel changeUsername(){

        JPanel panel = new JPanel(new BorderLayout());
        panel.setPreferredSize(new Dimension(660,361));

        JPanel subPanel = new JPanel(new BorderLayout());
        subPanel.setPreferredSize(new Dimension(660,155));
        subPanel.add(setLabel("Changing Username",28),BorderLayout.CENTER);
        subPanel.setBackground(new Color(85,0,0));

        JPanel subPanel2 = new JPanel(new GridLayout(2,2,10,10));
        subPanel2.setPreferredSize(new Dimension(660,206));
        subPanel2.setBackground(new Color(85,0,0));
        subPanel2.add(setLabel("Enter new username: ", 16));
        subPanel2.add(getTextField());

        JButton button = new JButton("Change Username!");
        button.setBackground(new Color(144,238,144));
        button.setForeground(Color.WHITE);
        button.setBorderPainted(false);
        button.setOpaque(true);
        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Update username of the user.
            }
        });

        subPanel2.add(button);

        panel.add(subPanel, BorderLayout.NORTH);
        panel.add(subPanel2, BorderLayout.CENTER);
        
        return panel;
        
    }
    JTextField getTextField(){
        JTextField field = new JTextField();
        field.setBackground(Color.LIGHT_GRAY);
        field.setForeground(Color.BLACK);
        field.setFont(new Font("Arial", Font.PLAIN, 16));
        return field;
    }

    JLabel setLabel(String text, int size){
        JLabel label = new JLabel(text);
        label.setFont(new Font("Arial", Font.PLAIN, size));
        label.setBackground(new Color(85,0,0));
        label.setForeground(Color.white);
        return label;
        
    }

    
}
