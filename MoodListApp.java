import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class MoodListApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MoodListApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        // Ana Frame
        JFrame frame = new JFrame("Moodlist");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(500, 600);
        frame.setLayout(new BorderLayout());
        frame.getContentPane().setBackground(new Color(40, 0, 0)); // Koyu kırmızı arka plan

        // Üst Arama Çubuğu Paneli
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
        contentPanel.setLayout(new GridLayout(6, 2, 10, 10));
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

        // Playlist Name
        JLabel playlistNameLabel = new JLabel("Playlist Name:");
        playlistNameLabel.setForeground(Color.WHITE);
        JTextField playlistNameField = new JTextField();
        contentPanel.add(playlistNameLabel);
        contentPanel.add(playlistNameField);

        // Number of Songs
        JLabel numberOfSongsLabel = new JLabel("Number Of Songs:");
        numberOfSongsLabel.setForeground(Color.WHITE);
        JTextField numberOfSongsField = new JTextField();
        contentPanel.add(numberOfSongsLabel);
        contentPanel.add(numberOfSongsField);

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

        contentPanel.add(new JLabel()); // Boşluk
        contentPanel.add(togglePanel);

        // Upload Photo
        JButton uploadPhotoButton = new JButton("Upload Photo");
        uploadPhotoButton.setForeground(Color.WHITE);
        uploadPhotoButton.setBackground(new Color(60, 20, 20));
        contentPanel.add(new JLabel()); // Boşluk
        contentPanel.add(uploadPhotoButton);

        // Create Playlist Butonu
        JButton createPlaylistButton = new JButton("Create Playlist");
        createPlaylistButton.setForeground(Color.WHITE);
        createPlaylistButton.setBackground(new Color(100, 0, 0));
        createPlaylistButton.setFocusPainted(false);
        createPlaylistButton.setFont(new Font("Arial", Font.BOLD, 16));
        createPlaylistButton.setPreferredSize(new Dimension(200, 40));

        // Frame Düzeni
        frame.add(searchPanel, BorderLayout.NORTH);
        frame.add(titleLabel, BorderLayout.CENTER);
        frame.add(contentPanel, BorderLayout.CENTER);

        JPanel bottomPanel = new JPanel();
        bottomPanel.setBackground(new Color(40, 0, 0));
        bottomPanel.add(createPlaylistButton);
        frame.add(bottomPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}
