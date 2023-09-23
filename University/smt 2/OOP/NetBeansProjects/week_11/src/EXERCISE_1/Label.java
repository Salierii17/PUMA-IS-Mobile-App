package EXERCISE_1;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
public class Label  implements ActionListener{
    public static void main(String[] args){
        JFrame f = new JFrame();
        f.setSize(400,200);
        JLabel L = new JLabel("Guten Morgen");
        L.setBounds(100,50,100,100);
        f.add(L);

        
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

}
