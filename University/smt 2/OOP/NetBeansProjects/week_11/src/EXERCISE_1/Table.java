package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JTable;

public class Table {
    public static void main(String[]args){
        JFrame f = new JFrame();

        String data[][] = { {"01","Flash","10000"},
                            {"02","RFlash","90000"},
                            {"03","Zoom","80000"}};
        String column[] = {"ID","Speedster","Speed"};
        JTable table = new JTable(data,column);
        table.setBounds(100,50,200,50);
        f.add(table);
        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
