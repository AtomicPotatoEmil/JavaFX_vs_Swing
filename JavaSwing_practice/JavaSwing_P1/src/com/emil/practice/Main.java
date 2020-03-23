package com.emil.practice;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {


    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello, I am a window");
        JButton button = new JButton("I am a button, click me!");
        JPanel panel = new JPanel();

        frame.setSize(300, 250);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(EXIT_ON_CLOSE);

        button.setBounds(50, 50, 200, 50);
        panel.setLayout(null);
        panel.add(button);
        frame.add(panel);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
                button.setText("Yay, you clicked me!");
            }
        });


    }
}
