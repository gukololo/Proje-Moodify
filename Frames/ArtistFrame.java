package Frames;
import javax.swing.*;
import java.awt.*;

public class ArtistFrame extends JFrame{

    private JPanel leftPanel;
    private JPanel rightJPanel;
    private JPanel midPanel;
    private Image artistImage;

    ArtistFrame(){

        artistImage = new ImageIcon("Michael_Jackson.jpg").getImage();

        //adding frame feautures
        this.setTitle("Artist Page");
        this.setLayout(new BorderLayout());
        this.setSize(1920,1080);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        JPanel emptyPanel = new JPanel();
        emptyPanel.setSize(300,400);
         add(emptyPanel, BorderLayout.WEST);
         add(emptyPanel, BorderLayout.EAST);
         add(emptyPanel, BorderLayout.NORTH);
         add(emptyPanel, BorderLayout.SOUTH);
        
        //creating the mid panel
        midPanel = new JPanel();
        midPanel.setLayout(new BorderLayout());
            //creating subpanels of mid panel
                JPanel midTopPanel = new JPanel();
                midTopPanel.setLayout(new GridLayout(2,1));

                    //midtopbottom panel which will show artist image and data 
                    JPanel artist = new JPanel();
                    artist.setLayout(new BorderLayout());
                    JPanel artistLeft = new JPanel();
                    artistLeft.setLayout(new GridLayout(3,1));
                    JPanel artistRight = new JPanel();

                    JLabel verifiedArtist = new JLabel("Verified Artist");
                    verifiedArtist.setSize(10, 10);
                    
                    artistLeft.add(verifiedArtist);
                    
                    JLabel artistName = new JLabel("Michael Jackson");
                    artistName.setSize(20,20);
                    artistLeft.add(artistName);

                    JLabel listeners = new JLabel(1321321 + " monthly listeners" );
                    artistLeft.add(listeners);

                    artist.add(artistLeft,BorderLayout.WEST);
                    artist.add(artistRight,BorderLayout.EAST);

                    midTopPanel.add(new JPanel());
                    midTopPanel.add(artist);

                    midPanel.add(midTopPanel, BorderLayout.NORTH);

                    add(midPanel, BorderLayout.CENTER);                   

    }
    public static void main(String[] args) {
        ArtistFrame a = new ArtistFrame();
        a.setVisible(true);
    }

}