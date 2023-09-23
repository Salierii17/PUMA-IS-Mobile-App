package EXERCISE_1;

import javax.swing.JCheckBox;
import javax.swing.JFrame;

public class checkBox {
    public static void main(String[]args){
        JFrame f = new JFrame();

        JCheckBox cb1 = new JCheckBox("C#");
        cb1.setBounds(30,30,50,50);
        f.add(cb1);

        JCheckBox cb2 = new JCheckBox("python");
        cb2.setBounds(30,60,100,50);
        f.add(cb2);


        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
