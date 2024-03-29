package pnm;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class starter extends JFrame implements ActionListener {
    JButton login, register;
    Font f1 =new Font("Tahoma",Font.BOLD,20);
    starter(){
        setSize(600,400);

        JLabel title = new JLabel("Password and Notes Manager");
        title.setBounds(85,50,420,50);
        title.setFont(new Font("Tahoma",Font.BOLD,28));
        title.setForeground(Color.white);
        add(title);


        login = new JButton("Login");
        login.addActionListener(this);
        login.setBounds(65,200,150,75);
        login.setFont(f1);
        add(login);

        register= new JButton("Register");
        register.setBounds(375,200,150,75);
        register.addActionListener(this);
        register.setFont(f1);
        add(register);

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
    public static void main(String[] args) {

        new starter();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==login){
            new login();
            setVisible(false);
        }
        else if (e.getSource()==register) {
            new register();
            setVisible(false);

        }
    }
}
