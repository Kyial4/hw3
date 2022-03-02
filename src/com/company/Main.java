package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.URI;
import java.net.URISyntaxException;

public class Main {

    public static void main(String[] args) {
	// write your code here
        JFrame window = new JFrame();
        window.setSize(300,400);
        JPanel panel = new JPanel( new GridBagLayout());
                window.add(panel);
                        panel.setBackground(Color.yellow);
                        JTextField textField= new JTextField(16);
                        panel.add(textField);
                        JButton jButton = new JButton("go");
                        panel.add(jButton);
                        jButton.addActionListener(new ActionListener() {
                            @Override
                            public void actionPerformed(ActionEvent e) {
                                try {
                                    Desktop.getDesktop().browse(new URI("https://www.google.com/search?q=" +textField.getText()));
                                } catch (IOException ioException) {
                                    ioException.printStackTrace();
                                } catch (URISyntaxException uriSyntaxException) {
                                    uriSyntaxException.printStackTrace();
                                }

                            }
                        });

                        window.setVisible(true);
    }

}
