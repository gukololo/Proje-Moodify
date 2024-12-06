import javax.swing.*;
import java.awt.*;

public class MusicApp {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(MusicApp::createAndShowGUI);
    }

    private static void createAndShowGUI() {
        JFrame frame = new JFrame("Moodify");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setLayout(new BorderLayout());

        // Sol Menü Paneli
        JPanel menuPanel = new JPanel();
        menuPanel.setLayout(new GridLayout(0, 1));
        menuPanel.setPreferredSize(new Dimension(200, 0));
        menuPanel.setBackground(new Color(30, 30, 30));
        menuPanel.setForeground(Color.WHITE);

        JButton homeButton = new JButton("Home");
        JButton libraryButton = new JButton("Library");
        JButton playlistsButton = new JButton("Playlists");
        JButton trendsButton = new JButton("Trends");
        JButton settingsButton = new JButton("Settings");

        menuPanel.add(homeButton);
        menuPanel.add(libraryButton);
        menuPanel.add(playlistsButton);
        menuPanel.add(trendsButton);
        menuPanel.add(settingsButton);

        // Üst Bilgi Paneli
        JPanel headerPanel = new JPanel();
        headerPanel.setLayout(new BorderLayout());
        headerPanel.setBackground(new Color(50, 50, 50));
        JLabel headerLabel = new JLabel("Moodify", SwingConstants.CENTER);
        headerLabel.setForeground(Color.WHITE);
        headerLabel.setFont(new Font("Arial", Font.BOLD, 24));
        headerPanel.add(headerLabel, BorderLayout.CENTER);

        // Ana İçerik Paneli
        JPanel contentPanel = new JPanel();
        contentPanel.setLayout(new GridLayout(2, 2, 10, 10));
        contentPanel.setBackground(new Color(240, 240, 240));

        contentPanel.add(new JLabel("Now Playing: Beat It - Michael Jackson"));
        contentPanel.add(new JLabel("Liked Songs: 8"));
        contentPanel.add(new JLabel("Followers: 8"));
        contentPanel.add(new JLabel("Recent Song: Billie Jean"));

        // Alt Oynatıcı Paneli
        JPanel playerPanel = new JPanel();
        playerPanel.setLayout(new BorderLayout());
        playerPanel.setBackground(new Color(20, 20, 20));
        JLabel nowPlayingLabel = new JLabel("Now Playing: Beat It - Michael Jackson", SwingConstants.CENTER);
        nowPlayingLabel.setForeground(Color.WHITE);
        playerPanel.add(nowPlayingLabel, BorderLayout.CENTER);

        // Ana Çerçeveye Panellerin Eklenmesi
        frame.add(menuPanel, BorderLayout.WEST);
        frame.add(headerPanel, BorderLayout.NORTH);
        frame.add(contentPanel, BorderLayout.CENTER);
        frame.add(playerPanel, BorderLayout.SOUTH);

        frame.setVisible(true);
    }
}

