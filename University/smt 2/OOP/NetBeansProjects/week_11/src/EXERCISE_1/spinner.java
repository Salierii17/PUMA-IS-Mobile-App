package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JSpinner;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;

public class spinner {
    public static void main(String[] args){
        JFrame f = new JFrame();

        SpinnerModel value = new SpinnerNumberModel(

            5,
            0,
            10,
            1
        ) ;
        JSpinner spinner = new JSpinner(value);
        spinner.setBounds(100,40,50,30);
        f.add(spinner);

        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
