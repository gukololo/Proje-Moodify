import javax.swing.JFrame;

public class RegisterPage extends JFrame {

    private final int WIDTH;
    private final int HEIGHT;

    public RegisterPage() {

        WIDTH = 1920;
        HEIGHT =  1080;
        this.setSize(WIDTH, HEIGHT);
        this.setVisible(true);
    }

    public static void main(String[] args) {
        RegisterPage a = new RegisterPage();
        a.setVisible(true);
        
    }


    
}
