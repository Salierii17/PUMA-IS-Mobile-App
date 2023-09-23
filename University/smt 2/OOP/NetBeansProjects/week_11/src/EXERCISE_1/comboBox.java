package EXERCISE_1;


import javax.swing.JComboBox;
import javax.swing.JFrame;

public class comboBox {
    public static void main(String[]args){
        JFrame f = new JFrame();
        
        String language[]={"English","Japanese","Korean","Mandarin"};
        JComboBox cb = new JComboBox<>(language);
        cb.setBounds(20,30,100,50);
        f.add(cb);

        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
