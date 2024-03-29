package pnm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class optpage extends JFrame implements ActionListener {
    JButton pass , notes;
    Font f1 = new Font("Tahoma",Font.BOLD,20);
    optpage(){
        setSize(400,500);

        pass = new JButton("Password Manager");
        pass.addActionListener(this);
        pass.setBounds(70,75,250,100);
        pass.setFont(f1);
        add(pass);

        notes = new JButton("Notes Manager");
        notes.addActionListener(this);
        notes.setBounds(90,300,200,100);
        notes.setFont(f1);
        add(notes);


        ImageIcon i1 = (new ImageIcon(ClassLoader.getSystemResource("images/loginjpg.png")));
        Image editedimg1 = i1.getImage().getScaledInstance(400,500,Image.SCALE_DEFAULT);
        i1 = new ImageIcon(editedimg1);
        JLabel i3 = new JLabel(i1);
        i3.setBounds(0,0,400,500);
        add(i3);

//        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new optpage();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==pass)
        {
            new passmain();
            setVisible(false);
        }

        if (e.getSource()==notes)
        {
            new notesmain();
            setVisible(false);
        }
    }
}
