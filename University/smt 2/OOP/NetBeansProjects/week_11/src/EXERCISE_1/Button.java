package EXERCISE_1;

import java.awt.event.*;

import javax.swing.JButton;
import javax.swing.JFrame;
public class Button  implements ActionListener{
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(400,200);
        JButton b = new JButton("Click me");
        b.setBounds(50,50,100,50);
        f.add(b);
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
