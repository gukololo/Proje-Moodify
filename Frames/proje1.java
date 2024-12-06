package Frames;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class proje1 extends JFrame{

    public proje1(){

        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1000, 600);
        setLayout(new BorderLayout());

        JPanel centerPanel = new JPanel(new GridLayout(3,1));
        JPanel firtPanel = new JPanel();
        JPanel secondPanel = new JPanel(new GridLayout(2,1));
        JPanel thirdPanel = new JPanel();

        centerPanel.add(firtPanel);
        
        JLabel createLabel = new JLabel("CREATE YOUR PLAYLİST");
        secondPanel.add(createLabel);
        JPanel buttonPanel = new JPanel(new GridLayout(1,2));
        JButton moodButton = new JButton("MOODLİST");
        JButton genreButton = new JButton("GENREMİX");

        buttonPanel.add(moodButton);
        buttonPanel.add(genreButton);
        secondPanel.add(buttonPanel);
        
        

        centerPanel.add(secondPanel);

        centerPanel.add(thirdPanel);



    }
    public static void main(String[] args) {
        new proje1();
    }

}