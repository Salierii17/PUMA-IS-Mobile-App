package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JTextArea;

public class TextArea extends Frame {

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.setSize(400, 400);
        JTextArea area = new JTextArea("HELLO");
        area.setBounds(70, 50, 200, 200);
        f.add(area);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
