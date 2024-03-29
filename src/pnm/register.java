package pnm;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.Statement;

public class register extends JFrame implements ActionListener {
    JLabel l1,  l2;
    JTextField username;
    JPasswordField password;
    JButton register, cancel;
    Font f1 = new Font("Tahoma",Font.PLAIN,18);

    register(){
        setSize(600,400);



        l1 = new JLabel("USERNAME");
        l1.setBounds(80,80,150,50);
        l1.setFont(f1);
        l1.setForeground(Color.WHITE);
        add(l1);

        l2 = new JLabel("PASSWORD");
        l2.setBounds(80,160,150,50);
        l2.setFont(f1);
        l2.setForeground(Color.WHITE);
        add(l2);

        username = new JTextField();
        username.setBounds(250,80,180,50);
        username.setFont(f1);
        add(username);

        password = new JPasswordField();
        password.setBounds(250,160,180,50);
        password.setFont(f1);
        add(password);

        register= new JButton("REGISTER");
        register.setBounds(80,260,120,50);
        register.addActionListener(this);
        register.setFont(f1);
        add(register);

        cancel = new JButton("CANCEL");
        cancel.setBounds(290,260,120,50);
        cancel.addActionListener(this);
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
        new register();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==register)
        {
            String newUsername =this.username.getText();
            String newPassword = String.valueOf(this.password.getPassword());

            sqltest conn = new sqltest();
            String checkUsername;
            checkUsername ="select username from login where username = '"+newUsername+"';";
            String enterDetails = "INSERT INTO login (username,pass) VALUES ('"+newUsername+"','"+newPassword+"');";

            try {
                ResultSet rs = conn.s.executeQuery(checkUsername);
                if (rs.next()) {
                    //String l;
                    //l=rs.getString(1);
                    //System.out.println(l);
                    JOptionPane.showMessageDialog(null, "Username already exists, please enter another username");
                    setVisible(false);
                    new register();
                }
                else
                {
                   try {
                       Statement s1 = conn.c.createStatement();
                       s1.execute("insert into login(username,pass) values ('"+newUsername+"','"+newPassword+"')" );
                       JOptionPane.showMessageDialog(null, "New account Created!!");
                       setVisible(false);
                        new optpage();

                   }
                   catch (Exception ae){
                       System.out.println(e);
                   }


                }
            }
            catch (Exception ae){
                JOptionPane.showMessageDialog(null, "Some error occurred");

            }

        }

     if(e.getSource()==cancel){
         new starter();
         setVisible(false);
     }
    }
}