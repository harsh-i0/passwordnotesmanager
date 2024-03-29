package pnm;
import javax.swing.*;
import java.awt.*;
public class deletenotes extends JFrame{

    JLabel title, entert;
    JButton delete;
    JTextField list, enterL;

    Font f1 = new Font("Tahoma",Font.BOLD,20);
    deletenotes(){
        setSize(600,500);

        title = new JLabel("Titles list");
        title.setBounds(80, 25,100,50);
        title.setFont(f1);
        title.setForeground(Color.white);
        add(title);

        entert = new JLabel("Enter title :");
        entert.setBounds(80,200,125,50);
        entert.setFont(f1);
        entert.setForeground(Color.white);
        add(entert);


        list= new JTextField();
        list.setBounds(220,25,220,150);
        list.setFont(f1);
        add(list);

        enterL= new JTextField();
        enterL.setBounds(220,200,220,50);
        enterL.setFont(f1);
        add(enterL);

        delete = new JButton("DELETE");
        delete.setBounds(290,280,120,50);
        delete.setFont(f1);
        add(delete);

        ImageIcon i1 = (new ImageIcon(ClassLoader.getSystemResource("images/loginjpg.png")));
        Image editedimg1 = i1.getImage().getScaledInstance(600,500,Image.SCALE_DEFAULT);
        i1 = new ImageIcon(editedimg1);
        JLabel i3 = new JLabel(i1);
        i3.setBounds(0,0,600,500);
        add(i3);

//        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);

    }

    public static void main(String[] args) {
        new deletenotes();
    }
}