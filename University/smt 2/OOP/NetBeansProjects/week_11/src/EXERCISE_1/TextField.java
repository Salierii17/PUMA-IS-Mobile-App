package EXERCISE_1;

import java.awt.event.*;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;


public class TextField implements ActionListener {
    public static void main(String[] args){
        
        JFrame f = new JFrame();
        JLabel L = new JLabel("Name :");
        L.setBounds(10,50,80,25);
        f.add(L);
        JTextField t1 = new JTextField();
        t1.setBounds(60,50,200,30);
        f.add(t1); 
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }    
}
