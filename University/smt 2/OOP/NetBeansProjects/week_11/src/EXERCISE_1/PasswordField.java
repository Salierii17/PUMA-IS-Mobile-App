package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;

public class PasswordField {
    public static void main(String[]args){
        JFrame f = new JFrame();
        
        JLabel L = new JLabel("Password");
        L.setBounds(10,50,80,25);
        f.add(L);
        JPasswordField passF = new JPasswordField();
        passF.setBounds(60,50,200,30);
        f.add(passF);
        
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
