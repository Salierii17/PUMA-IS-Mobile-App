package EXERCISE_1;

import javax.swing.JFrame;

public class Frame {
    public Frame(){
        JFrame f = new JFrame();
        f.setSize(400,400);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
    public static void main(String[]args){
        new Frame();
    }
}
