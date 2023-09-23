package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JSlider;

public class Slider {
    public static void main(String[] args){
        JFrame f = new JFrame();

        JSlider slider = new JSlider();
        slider.setBounds(50,50,300,100);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);

        f.add(slider);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
