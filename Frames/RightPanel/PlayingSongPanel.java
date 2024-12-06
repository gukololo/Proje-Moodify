package Frames.RightPanel;
import java.awt.*;
import javax.swing.*;

public class PlayingSongPanel extends JPanel {
    
    PlayingSongPanel(){

        setSize(284,376);
        setLayout(new GridLayout(1,6));
        add(new JLabel("Song Playing"));
        add(new JButton("müzik resmi"));
        add(new JLabel("Şarkı Adı"));
        add(new JLabel("Artist Adı "));
        add(new JSlider());
        add(new Button(" Buraya 6 tane button gelecek"));
        

    }


}
