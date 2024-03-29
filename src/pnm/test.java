package pnm;

import javax.swing.*;
import java.awt.*;

public class test {
    public test() {
        // Create the main frame
        JFrame frame = new JFrame("Add Password");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300, 200);

        // Create a panel to hold components
        JPanel panel = new JPanel(null); // Use null layout
        frame.add(panel);

        // Create labels for passkey and password
        JLabel passkeyLabel = new JLabel("Enter Passkey:");
        passkeyLabel.setBounds(10, 20, 100, 20); // Set bounds (x, y, width, height)

        JLabel passwordLabel = new JLabel("Enter Password:");
        passwordLabel.setBounds(10, 50, 100, 20);

        // Create text fields for passkey and password
        JTextField passkeyField = new JTextField();
        passkeyField.setBounds(120, 20, 150, 20);

        JTextField passwordField = new JTextField();
        passwordField.setBounds(120, 50, 150, 20);

        // Create add button
        JButton addButton = new JButton("Add");
        addButton.setBounds(120, 80, 80, 30);

        // Add components to the panel
        panel.add(passkeyLabel);
        panel.add(passkeyField);
        panel.add(passwordLabel);
        panel.add(passwordField);
        panel.add(addButton);

        // Set the frame visible
        frame.setVisible(true);
    }

    public static void main(String[] args) {
        // Create an instance of the AddPassword class
        new test();
    }
}