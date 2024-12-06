package Frames;
import javax.imageio.plugins.jpeg.JPEGQTable;
import javax.swing.*;
import java.awt.*;

public class settingsPage extends JFrame {

    settingsPage(){
        setLayout(new GridLayout(7,3));
        add(new JButton("SEARCH BAR"));
        add(new JLabel("Profile Picture"));
        }

        private JPanel createJPanelTwoToOne(){
            JPanel jp = new JPanel();
            jp.setLayout(new GridLayout(2,1));
            return jp;
        }

    }

    
