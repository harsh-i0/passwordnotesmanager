package pnm;
import javax.swing.*;
import javax.swing.*;
import java.awt.*;
public class notesmain extends JFrame {
    JButton view ,add, delete;
    Font f1 = new Font("Tahoma",Font.BOLD,20);

    notesmain(){
        setSize(400,500);

        view = new JButton("VIEW NOTE");
        view.setBounds(100,75,200,75);
        view.setFont(f1);
        add(view);

        add = new JButton("ADD NOTE");
        add.setBounds(100,175,200,75);
        add.setFont(f1);
        add(add);


        delete = new JButton("DELETE NOTE");
        delete.setBounds(100,275,200,75);
        delete.setFont(f1);
        add(delete);

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
        new notesmain();
    }
}