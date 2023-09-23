package EXERCISE_1;

import java.awt.Color;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Panel {
    public static void main(String[] args){
        JFrame f = new JFrame();
        JPanel p = new JPanel();
        p.setBounds(100,20,100,100);
        p.setBackground(Color.cyan);
        f.add(p);

        JButton b1 = new JButton("YES");
        b1.setBounds(110,30,50,50);
        b1.setBackground(Color.green);
        p.add(b1);
        
        JButton b2 = new JButton("NO");
        b2.setBounds(110,140,50,50);
        b2.setBackground(Color.red);
        p.add(b2);

        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);

    }
        
}
