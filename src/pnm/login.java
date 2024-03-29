package pnm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class login extends JFrame implements ActionListener {
    JLabel l1,  l2;
    JTextField username;
    JPasswordField password;
    JButton sigin, cancel;
    Font f1 = new Font("Tahoma",Font.PLAIN,18);
    public String masterPassword,masterUsername;
    login(){
        setSize(600,400);



        l1 = new JLabel("USERNAME");
        l1.setBounds(80,80,150,50);
        l1.setFont(f1);
        l1.setForeground(Color.black);
        add(l1);

        l2 = new JLabel("PASSWORD");
        l2.setBounds(80,160,150,50);
        l2.setFont(f1);
        l2.setForeground(Color.black);
        add(l2);

        username = new JTextField();
        username.setBounds(250,80,180,50);
        username.setFont(f1);
        add(username);

        password = new JPasswordField();
        password.setBounds(250,160,180,50);
        password.setFont(f1);
        add(password);

        sigin = new JButton("SIGN  IN");
        sigin.setBounds(80,260,120,50);
        sigin.addActionListener(this);
        sigin.setFont(f1);
        add(sigin);

        cancel = new JButton("CANCEL");
        cancel.addActionListener(this);
        cancel.setBounds(290,260,120,50);
        cancel.setFont(f1);
        add(cancel);

        ImageIcon i1 = (new ImageIcon(ClassLoader.getSystemResource("images/loginjpg.png")));
        Image editedimg1 = i1.getImage().getScaledInstance(600,400,Image.SCALE_DEFAULT);
        i1 = new ImageIcon(editedimg1);
        JLabel i3 = new JLabel(i1);
        i3.setBounds(0,0,600,400);
        add(i3);

//        setUndecorated(true);
        setLayout(null);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new login();


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==sigin)
        {
            String username = this.username.getText();
            String password = String.valueOf(this.password.getPassword());


            sqltest c = new sqltest();
            String query = "select username,pass from login where username = '"+username+"' and pass = '"+password+"'";
            try{
                ResultSet rs =  c.s.executeQuery(query);
                if(rs.next()){
                    JOptionPane.showMessageDialog(null, "Login Successfull!");
                    masterPassword = password;
                    masterUsername = username;
                    setVisible(false);
                    new optpage();

                }
                else{
                    JOptionPane.showMessageDialog(null, "Invalid Credentials!!");
                    setVisible(false);
                    new login();
                }
            }catch (Exception ae){
                System.out.println(ae);
            }
        }
        if(e.getSource()==cancel){
            new starter();
            setVisible(false);
        }
    }

}