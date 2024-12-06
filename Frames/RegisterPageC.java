package Frames;

import javax.swing.*;
import java.awt.*;

public class RegisterPageC {
    public static void main(String[] args) {
        // Ana pencere
        JFrame frame = new JFrame("Moodify");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 500);
        frame.setLocationRelativeTo(null);
        frame.setLayout(new BorderLayout());

        // Sol panel
        JPanel leftPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Arka plan rengi
                g2d.setColor(new Color(85, 0, 0)); // Koyu kırmızı
                g2d.fillRect(0, 0, getWidth(), getHeight());

                // Geometrik şekiller
                g2d.setColor(new Color(200, 0, 0, 100)); // Şeffaf kırmızı
                g2d.fillOval(50, 100, 100, 100);

                g2d.setColor(new Color(255, 255, 255, 50)); // Şeffaf beyaz
                g2d.fillRect(150, 200, 100, 100);
            }
        };
        leftPanel.setPreferredSize(new Dimension(400, 500));
        leftPanel.setLayout(null);

        // "Welcome Back!" etiketi
        JLabel welcomeLabel = new JLabel("Welcome Back!");
        welcomeLabel.setFont(new Font("Arial", Font.BOLD, 24));
        welcomeLabel.setForeground(Color.WHITE);
        welcomeLabel.setBounds(120, 100, 200, 30);
        leftPanel.add(welcomeLabel);

        JLabel instructionLabel = new JLabel("To keep connected with us please login.");
        instructionLabel.setFont(new Font("Arial", Font.PLAIN, 14));
        instructionLabel.setForeground(Color.WHITE);
        instructionLabel.setBounds(70, 150, 300, 20);
        leftPanel.add(instructionLabel);

        // Sign-in butonu
        JButton signInButton = new JButton("SIGN IN");
        signInButton.setBounds(140, 200, 120, 40);
        signInButton.setBackground(Color.WHITE);
        signInButton.setForeground(new Color(85, 0, 0));
        leftPanel.add(signInButton);

        // Sağ panel
        JPanel rightPanel = new JPanel() {
            @Override
            protected void paintComponent(Graphics g) {
                super.paintComponent(g);
                Graphics2D g2d = (Graphics2D) g;

                // Arka plan rengi
                g2d.setColor(Color.BLACK);
                g2d.fillRect(0, 0, getWidth(), getHeight());

                // Geometrik şekiller
                g2d.setColor(new Color(100, 100, 100, 100)); // Şeffaf gri
                g2d.fillOval(50, 100, 100, 100);
            }
        };
        rightPanel.setLayout(null);

        // Moodify etiketi
        JLabel moodifyLabel = new JLabel("Moodify");
        moodifyLabel.setFont(new Font("Arial", Font.BOLD, 28));
        moodifyLabel.setForeground(new Color(255, 69, 0));
        moodifyLabel.setBounds(150, 50, 200, 30);
        rightPanel.add(moodifyLabel);

        // Kullanıcı kayıt formu
        JTextField nameField = new JTextField("Name");
        nameField.setBounds(100, 120, 200, 30);
        rightPanel.add(nameField);

        JTextField emailField = new JTextField("Email");
        emailField.setBounds(100, 160, 200, 30);
        rightPanel.add(emailField);

        JPasswordField passwordField = new JPasswordField("Password");
        passwordField.setBounds(100, 200, 200, 30);
        rightPanel.add(passwordField);

        // Sign-up butonu
        JButton signUpButton = new JButton("SIGN UP");
        signUpButton.setBounds(150, 260, 120, 40);
        signUpButton.setBackground(new Color(85, 0, 0));
        signUpButton.setForeground(Color.WHITE);
        rightPanel.add(signUpButton);

        // Panelleri ekleme
        frame.add(leftPanel, BorderLayout.WEST);
        frame.add(rightPanel, BorderLayout.CENTER);

        // Pencereyi görünür yap
        frame.setVisible(true);
    }
}