package Frames;
import javax.swing.*;

import Frames.LeftPanel.leftPanel;
import Frames.RightPanel.RightPanel;

import java.awt.*;

public class MainFrame extends JFrame {

    MainFrame(){
        setTitle("Main Page");
        setSize(1920,1080);
        setLayout(new BorderLayout());
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel lp = new leftPanel();
        lp.setPreferredSize(new Dimension(300,1080));
        JPanel rp = new RightPanel();
        rp.setPreferredSize(new Dimension(300,1080));
        JPanel mp = new JPanel();
        mp.setSize(1520,1080);
        

        add(lp, BorderLayout.WEST);
        add(mp,BorderLayout.CENTER);
        add(rp, BorderLayout.EAST);

    }

    public static void main(String[] args) {
        MainFrame a = new MainFrame();
        a.setVisible(true);
    }
    
}
