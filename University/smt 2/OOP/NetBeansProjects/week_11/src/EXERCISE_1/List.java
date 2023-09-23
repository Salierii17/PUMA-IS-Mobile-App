package EXERCISE_1;

import javax.swing.DefaultListModel;
import javax.swing.JFrame;
import javax.swing.JList;

public class List {
    public static void main(String[] args){
        JFrame f = new JFrame();

        DefaultListModel<String> lm = new DefaultListModel<>();
        lm.addElement("Rice");
        lm.addElement("Chicken");
        lm.addElement("Ribs");
        lm.addElement("Fish");
        JList<String> list = new JList<>(lm);
        list.setBounds(20,30,100,100);
        f.add(list);

        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
