import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MoodListApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MoodListApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        
        JFrame frame = new JFrame("Moodlist");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new GridLayout(4,1));
        frame.getContentPane().setBackground(new Color(40, 0, 0)); 

        
        JPanel searchPanel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
        searchPanel.setBackground(new Color(40, 0, 0));
        JTextField searchField = new JTextField(20);
        JButton searchButton = new JButton("Search");
        searchPanel.add(searchField);
        searchPanel.add(searchButton);

        // Moodlist Başlığı
        JLabel titleLabel = new JLabel("Moodlist", SwingConstants.CENTER);
        titleLabel.setFont(new Font("Arial", Font.BOLD, 24));
        titleLabel.setForeground(Color.WHITE);

        // İçerik Paneli
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(6, 2));
        contentPanel.setBorder(new EmptyBorder(20, 20, 20, 20));
        contentPanel.setBackground(new Color(40, 0, 0));

        // Tempo
        JLabel tempoLabel = new JLabel("Tempo:");
        tempoLabel.setForeground(Color.WHITE);
        JSlider tempoSlider = new JSlider(0, 100, 50);
        tempoSlider.setBackground(new Color(40, 0, 0));
        contentPanel.add(tempoLabel);
        contentPanel.add(tempoSlider);

        // Energy
        JLabel energyLabel = new JLabel("Energy:");
        energyLabel.setForeground(Color.WHITE);
        JSlider energySlider = new JSlider(0, 100, 50);
        energySlider.setBackground(new Color(40, 0, 0));
        contentPanel.add(energyLabel);
        contentPanel.add(energySlider);

        // Danceability
        JLabel danceLabel = new JLabel("Danceability:");
        danceLabel.setForeground(Color.WHITE);
        JSlider danceSlider = new JSlider(0, 100, 50);
        danceSlider.setBackground(new Color(40, 0, 0));
        contentPanel.add(danceLabel);
        contentPanel.add(danceSlider);

        JPanel contentPanel2 = new JPanel();
        contentPanel2.setLayout(new GridLayout(1, 5));
        contentPanel2.setBorder(new EmptyBorder(20, 20, 20, 20));
        contentPanel2.setBackground(new Color(40, 0, 0));

        // Playlist Name
        JLabel playlistNameLabel = new JLabel("Playlist Name:");
        playlistNameLabel.setForeground(Color.WHITE);
        JTextField playlistNameField = new JTextField();
        contentPanel2.add(playlistNameLabel);
        contentPanel2.add(playlistNameField);

        // Number of Songs
        JLabel numberOfSongsLabel = new JLabel("Number Of Songs:");
        numberOfSongsLabel.setForeground(Color.WHITE);
        JTextField numberOfSongsField = new JTextField();
        contentPanel2.add(numberOfSongsLabel);
        contentPanel2.add(numberOfSongsField);

        JPanel contentPanel3 = new JPanel();
        contentPanel3.setLayout(new GridLayout(3, 1));
        contentPanel3.setBorder(new EmptyBorder(20, 20, 20, 20));
        contentPanel3.setBackground(new Color(40, 0, 0));

        // Versatile & Public Toggle
        JPanel togglePanel = new JPanel(new GridLayout(1, 2, 10, 0));
        togglePanel.setBackground(new Color(40, 0, 0));
        JCheckBox versatileCheck = new JCheckBox("Versatile");
        JCheckBox publicCheck = new JCheckBox("Public");
        versatileCheck.setBackground(new Color(40, 0, 0));
        versatileCheck.setForeground(Color.WHITE);
        publicCheck.setBackground(new Color(40, 0, 0));
        publicCheck.setForeground(Color.WHITE);
        togglePanel.add(versatileCheck);
        togglePanel.add(publicCheck);

        contentPanel3.add(new JLabel()); // Boşluk
        contentPanel3.add(togglePanel);

        // Upload Photo
        JButton uploadPhotoButton = new JButton("Upload Photo");
        uploadPhotoButton.setForeground(Color.WHITE);
        uploadPhotoButton.setBackground(new Color(60, 20, 20));
        //contentPanel3.add(new JLabel()); // Boşluk
        contentPanel3.add(uploadPhotoButton);
        contentPanel2.add(contentPanel3);

        // Create Playlist Butonu
        JButton createPlaylistButton = new JButton("Create Playlist");
        createPlaylistButton.setForeground(Color.WHITE);
        createPlaylistButton.setBackground(new Color(100, 0, 0));
        createPlaylistButton.setFocusPainted(false);
        createPlaylistButton.setFont(new Font("Arial", Font.BOLD, 16));
        createPlaylistButton.setPreferredSize(new Dimension(200, 40));

        // Frame Düzeni
        frame.add(searchPanel);
        //frame.add(titleLabel, BorderLayout);
        frame.add(contentPanel);
        frame.add(contentPanel2);
        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(40, 0, 0));
        bottomPanel.add(createPlaylistButton);
        frame.add(bottomPanel);

        frame.setVisible(true);
    }
}
