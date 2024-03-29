package pnm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class passmain extends JFrame implements ActionListener {
    JButton view ,add,generate, delete;
    Font f1 = new Font("Tahoma",Font.BOLD,20);
    passmain(){
        setSize(400,600);

        view = new JButton("VIEW PASSWORD");
        view.setBounds(75,75,250,75);
        view.setFont(f1);
        add(view);

        add = new JButton("ADD PASSWORD");
        add.setBounds(75,175,250,75);
        add.setFont(f1);
        add(add);

        generate = new JButton("GENERATE PASSWORD");
        generate.setBounds(65,275,270,75);
        generate.addActionListener(this);
        generate.setFont(f1);
        add(generate);

        delete = new JButton("DELETE PASSWORD");
        delete.setBounds(75,375,250,75);
        delete.setFont(f1);
        add(delete);

        ImageIcon i1 = (new ImageIcon(ClassLoader.getSystemResource("images/loginjpg.png")));
        Image editedimg1 = i1.getImage().getScaledInstance(400,600,Image.SCALE_DEFAULT);
        i1 = new ImageIcon(editedimg1);
        JLabel i3 = new JLabel(i1);
        i3.setBounds(0,0,400,600);
        add(i3);

//        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new passmain();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==generate)
        {
            new pwdgenerator();
        }
    }
}
