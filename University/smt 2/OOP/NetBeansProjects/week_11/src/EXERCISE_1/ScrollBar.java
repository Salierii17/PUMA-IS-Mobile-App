package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JScrollBar;

public class ScrollBar {
    public static void main(String[]args){
        JFrame f = new JFrame();

        JScrollBar sb = new JScrollBar();
        sb.setBounds(330,0,50,180);
        f.add(sb);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
