import javax.swing.*;import java.awt.*;import java.sql.*;
public class LoginFrame extends JFrame{
 JTextField u=new JTextField();JPasswordField p=new JPasswordField();
 public LoginFrame(){setTitle("Banking Management System - Login");setSize(500,350);setLocationRelativeTo(null);setDefaultCloseOperation(EXIT_ON_CLOSE);setResizable(false);JPanel x=new JPanel(null);x.setBackground(new Color(230,240,255));
 JLabel t=new JLabel("BANKING MANAGEMENT SYSTEM",SwingConstants.CENTER);t.setFont(new Font("Arial",1,22));t.setBounds(50,30,400,40);x.add(t);label(x,"Username:",80,100);u.setBounds(200,100,220,30);x.add(u);label(x,"Password:",80,150);p.setBounds(200,150,220,30);x.add(p);JButton b=new JButton("LOGIN");b.setBounds(150,220,90,40);x.add(b);JButton c=new JButton("CLEAR");c.setBounds(260,220,90,40);x.add(c);b.addActionListener(e->login());c.addActionListener(e->{u.setText("");p.setText("");});add(x);}
 void label(JPanel x,String s,int a,int b){JLabel l=new JLabel(s);l.setBounds(a,b,120,30);x.add(l);}
 void login(){String us=u.getText().trim(),pw=new String(p.getPassword());if(us.isEmpty()||pw.isEmpty()){JOptionPane.showMessageDialog(this,"Enter username and password!");return;}try(Connection c=DBConnection.getConnection();PreparedStatement q=c.prepareStatement("SELECT USER_ID FROM BANK_USERS WHERE USERNAME=? AND USER_PASSWORD=? AND STATUS='ACTIVE'")){q.setString(1,us);q.setString(2,pw);try(ResultSet r=q.executeQuery()){if(r.next()){dispose();new MainFrame().setVisible(true);}else JOptionPane.showMessageDialog(this,"Invalid username or password!");}}catch(SQLException e){JOptionPane.showMessageDialog(this,"Database Error: "+e.getMessage());}}
 public static void main(String[]a){SwingUtilities.invokeLater(()->new LoginFrame().setVisible(true));}
}
