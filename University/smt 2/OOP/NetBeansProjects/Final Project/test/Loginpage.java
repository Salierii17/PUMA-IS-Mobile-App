package test;
import  java.awt.*;
import  java.sql.*;
import  java.awt.event.*;
import  javax.swing.*;

public  class  loginpage  extends  Frame  implements ActionListener
{

  TextField t1,t2;
 Label l1,l2;
Button b1,b2;
login()
{  setLayout(new FlowLayout());
  t1=new  TextField(10);
 t2=new TextField(10);
l1=new Label("username");
l2=new Label("password");
add(l1);
add(t1);
add(l2);
 add(t2);
b1=new Button("Login");
add(b1);
b2=new Button("Register");
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
}
public  void  actionPerformed(ActionEvent ae)
{ 
  if(ae.getSource()==b1)
  {

  
  String user=t1.getText();
 String pass=t2.getText();
  System.out.println(user);

String qry="select *  from login  where username='"+user+"' and password='"+pass+"' ";


 try
{
Class.forName("com.mysql.jdbc.Driver");
Connection con = DriverManager.getConnection("jdbc:mysql:///aug27", "root", "");
Statement st=con.createStatement();

ResultSet  rs=st.executeQuery(qry);

if(rs.next())
{
//JOptionPane.showMessageDialog(null,"valid User");

 bank b1=new  bank();
 b1.setSize(300,300);
 b1.setVisible(true);

}
else
{
  JOptionPane.showMessageDialog(null,"Invalid  User");
}

}
catch(Exception e){
  System.out.println(e);
}









}

 if(ae.getSource()==b2)
  {
 register k11=new  register();
 k11.setSize(400,400);
 k11.setVisible(true);

}
  



}
public  static  void  main(String s[])
{
  login k1=new  login();
 k1.setVisible(true);
 }
}

