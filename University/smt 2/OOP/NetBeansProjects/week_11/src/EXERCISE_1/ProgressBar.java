package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JProgressBar;

public class ProgressBar {

    public static void main(String[] args){
        JFrame f = new JFrame();
        JProgressBar pb = new JProgressBar();
        pb.setBounds(20,30,160,30);
        pb.setValue(70);
        pb.setStringPainted(true);

        f.add(pb);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
