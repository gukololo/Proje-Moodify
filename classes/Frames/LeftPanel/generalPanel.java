package classes.Frames.LeftPanel;

import javax.swing.*;
import java.awt.*;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class generalPanel extends JPanel{

    private JLabel menu;
    private JButton home;
    private JButton trends;

    generalPanel(){

        setSize(366,106);
        setLayout(new GridLayout(3,1));
        
    }
    
}
