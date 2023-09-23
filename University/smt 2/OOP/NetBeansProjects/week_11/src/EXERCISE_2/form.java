package EXERCISE_2;

import java.awt.BorderLayout;
import java.awt.Color;

import javax.swing.ButtonGroup;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JProgressBar;
import javax.swing.JRadioButton;
import javax.swing.JScrollBar;
import javax.swing.JSlider;
import javax.swing.JSpinner;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.JTree;
import javax.swing.SpinnerModel;
import javax.swing.SpinnerNumberModel;
import javax.swing.tree.DefaultMutableTreeNode;

public class form {
    public JFrame frame;
    public JPanel panel;
    public JLabel label;
    public JButton b1;
    public JButton b2;
    
    public  form(){
        frame = new JFrame();
        frame.setSize(720,1080);
        
        JLabel L1 = new JLabel("Name :");
        L1.setBounds(20,50,80,25);
        frame.add(L1);
        JTextField t1 = new JTextField();
        t1.setBounds(80,50,200,30);
        frame.add(t1);
    
        JLabel L2 = new JLabel("Password :");
        L2.setBounds(10,100,80,25);
        frame.add(L2);
        JPasswordField passF = new JPasswordField();
        passF.setBounds(80,100,200,30);
        frame.add(passF);
        panel = new JPanel();
        panel.setBounds(10,150,300,100);
        panel.setBackground(Color.cyan);
        frame.add(panel);

        b1 = new JButton("YES");
        b1.setBounds(20,20,50,50);
        b1.setBackground(Color.green);
        panel.add(b1);
        
        b2 = new JButton("NO");
        b2.setBounds(40,20,50,50);
        b2.setBackground(Color.red);
        panel.add(b2,BorderLayout.PAGE_END);

        JCheckBox cb1 = new JCheckBox("C#");
        cb1.setBounds(20,250,50,50);
        frame.add(cb1);

        JCheckBox cb2 = new JCheckBox("python");
        cb2.setBounds(20,280,100,50);
        frame.add(cb2);

        String language[]={"English","Japanese","Korean","Mandarin"};
        JComboBox cb = new JComboBox<>(language);
        cb.setBounds(20,330,100,50);
        frame.add(cb);

        DefaultListModel<String> lm = new DefaultListModel<>();
        lm.addElement("Rice");
        lm.addElement("Chicken");
        lm.addElement("Ribs");
        lm.addElement("Fish");
        JList<String> list = new JList<>(lm);
        list.setBounds(20,400,100,100);
        frame.add(list);
        
        
        ButtonGroup bg = new ButtonGroup();
        
        JRadioButton rb1 = new JRadioButton("A.YES");
        rb1.setBounds(20,520,150,50);
        frame.add(rb1);bg.add(rb1);
        
        JRadioButton rb2 = new JRadioButton("B.OH NOOOO");
        rb2.setBounds(20,570,150,50);
        frame.add(rb2);bg.add(rb2);
        
        JScrollBar sb = new JScrollBar();
        sb.setBounds(660,0,50,1080);
        frame.add(sb, BorderLayout.LINE_END);
        
        JSlider slider = new JSlider();
        slider.setBounds(300,50,300,100);
        slider.setMinorTickSpacing(2);
        slider.setMajorTickSpacing(10);
        slider.setPaintTicks(true);
        slider.setPaintLabels(true);
        frame.add(slider);
        
        SpinnerModel value = new SpinnerNumberModel(
            5,
            0,
            10,
            1
            ) ;
            JSpinner spinner = new JSpinner(value);
            spinner.setBounds(430,150,50,50);
        frame.add(spinner);
        
        
        String data[][] = { {"01","Flash","10000"},
        {"02","RFlash","90000"},
        {"03","Zoom","80000"}};
        String column[] = {"ID","Speedster","Speed"};
        JTable table = new JTable(data,column);
        table.setBounds(350,300,200,50);
        frame.add(table);
        
        DefaultMutableTreeNode game = new DefaultMutableTreeNode("Game");
        DefaultMutableTreeNode game1 = new DefaultMutableTreeNode("Elden Ring");
        DefaultMutableTreeNode game2 = new DefaultMutableTreeNode("God of War");
        DefaultMutableTreeNode game3 = new DefaultMutableTreeNode("DMC5");
        
        game.add(game1);
        game.add(game2);
        game.add(game3);
        
        JTree tr = new JTree(game);
        tr.setBounds(350,400,130,100);
        tr.setBackground(null);
        frame.add(tr);
        
        JProgressBar pb = new JProgressBar();
        pb.setBounds(350,550,160,30);
        pb.setValue(70);
        pb.setStringPainted(true);
        frame.add(pb);
        
        frame.setTitle("Form");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(null);
        frame.setVisible(true);
        
        
    }
    public static void main(String[]args){
        new form();
    }
}
