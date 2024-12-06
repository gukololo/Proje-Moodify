package Frames.LeftPanel;

import java.util.ArrayList; 
import javax.swing.JPanel;
import javax.swing.JButton;
import javax.swing.JLabel;
import classes.profile;
import java.awt.event.*;
import java.awt.*;


public class friendsPanel extends JPanel{

    private ArrayList<profile> friendList;
    private JPanel cardsPanel; 
    private CardLayout cardLayout;
    private JPanel mainPanel;
    private int friendsPerPage = 3;

    friendsPanel(profile user){

        mainPanel.setSize(366,185);

        friendList = new ArrayList<>();
        cardLayout = new CardLayout();
        cardsPanel = new JPanel(cardLayout);

        for (int i = 0; i < user.getFollowers().size(); i++) {

            friendList.add(user.getFollowers().get(i));
            
        }

        createPages();

        mainPanel = new JPanel(new GridLayout(2,1));

        JPanel navigationPanel = createNavigationPanel();
        mainPanel.add(cardsPanel);
        mainPanel.add(navigationPanel);

    }

    private JPanel createNavigationPanel() {

        JPanel navigationPanel = new JPanel(new FlowLayout());
        JButton prevButton = new JButton("Previous");
        JButton nextButton = new JButton("Next");

        prevButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open previous page.
            }
        });
        nextButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                // Open next page.
            }
        });

        navigationPanel.add(prevButton);
        navigationPanel.add(nextButton);

        return navigationPanel;
    }

    private void createPages() {

        int totalPages = (int) Math.ceil((double) friendList.size() / friendsPerPage);

        for (int i = 0; i < totalPages; i++) {

            JPanel page = new JPanel();
            page.setLayout(new GridLayout(friendsPerPage + 1, 1)); // Grid for friends

            int start = i * friendsPerPage;
            int end = Math.min(start + friendsPerPage, friendList.size());
            JLabel friends = new JLabel("FRIENDS");
            page.add(friends);

            for (int j = start; j < end; j++) {

                JButton friendButton = new JButton(friendList.get(j).getUserName());
                page.add(friendButton);

            }

            cardsPanel.add(page, "Page " + (i + 1));
        }
    }
    
}
