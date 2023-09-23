package FirstGUI;

import javax.swing.JButton;
import javax.swing.JFrame;

public class Simple {
    JFrame f;

    Simple(){
        f = new JFrame();
        JButton b = new JButton("click");
        b.setBounds(10,150,100,50);
        
        f.add(b);
        
        f.setSize(500,500);
        f.setLayout(null);
        f.setVisible(true);

    }

    public static void main (String[] args){
        new Simple();
    }
}