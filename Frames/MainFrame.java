package Frames;
import javax.swing.*;

import Frames.LeftPanel.leftPanel;
import Frames.RightPanel.RightPanel;

import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        setTitle("Main Page");
        setSize(1920,1080);
        setLayout(new GridLayout(1,3));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel lp = new JPanel();
        lp.setSize(400,1080);
        JPanel rp = new RightPanel();
        JPanel mp = new JPanel();
        

        add(lp);
        add(mp);
        add(rp);

    }

    public static void main(String[] args) {
        MainFrame a = new MainFrame();
        a.setVisible(true);
    }
    
}
