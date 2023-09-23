package EXERCISE_1;

import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JRadioButton;

public class RadioButton {
    public static void main (String[] args){
        JFrame f  = new JFrame();

        ButtonGroup bg = new ButtonGroup();

        JRadioButton rb1 = new JRadioButton("A.");
        rb1.setBounds(20,30,50,50);
        f.add(rb1);bg.add(rb1);
        
        JRadioButton rb2 = new JRadioButton("B.");
        rb2.setBounds(20,60,50,50);
        f.add(rb2);bg.add(rb2);

        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
