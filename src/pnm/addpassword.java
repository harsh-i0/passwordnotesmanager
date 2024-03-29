package pnm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class addpassword extends JFrame implements ActionListener {

    JTextField passkeyinput;

    Font f1 = new Font("Tahoma",Font.PLAIN,18);
    addpassword()
    {
        setSize(600,400);

        JLabel passkey = new JLabel("Enter a passkey for your password");
        passkey.setBounds(50,50,500,50);
        passkey.setFont(new Font("Tahoma",Font.BOLD,28));
        passkey.setForeground(Color.white);
        add(passkey);

        passkeyinput = new JTextField();
        passkeyinput.setBounds(75,75,200,50);



        ImageIcon i1 = (new ImageIcon(ClassLoader.getSystemResource("images/loginjpg.png")));
        Image editedimg1 = i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        i1 = new ImageIcon(editedimg1);
        JLabel i3 = new JLabel(i1);
        i3.setBounds(0,0,600,400);
        add(i3);

        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    public static void main(String[] args)
    {
        new addpassword();
    }
    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
