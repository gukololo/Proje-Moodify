package Frames;
import javax.swing.*;
import java.awt.*;


public class LeftPanel extends JPanel {
    
    final int width = 3;
    final int length = 1;

    LeftPanel(){

        this.setSize(width,length);
        this.setBackground(Color.red);

    }
public static void main(String[] args) {
    JFrame f = new JFrame();
    f.setSize(1920,1080);
    f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    f.setLayout(new GridLayout(1,3));
    LeftPanel p = new LeftPanel();
    p.setSize(100,1080);
    LeftPanel p2 = new LeftPanel();
    LeftPanel p3 = new LeftPanel();
    p2.setBackground(Color.blue);
    p3.setBackground(Color.WHITE);
    f.add(p);
    f.add(p2);
    f.add(p3);
    f.setVisible(true);


}
    
}
