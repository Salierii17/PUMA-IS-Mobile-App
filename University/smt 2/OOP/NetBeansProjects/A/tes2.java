package MDI;

import java.awt.LayoutManager;
import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;


public class tes2 {
    public static void main(String[] args){
        createWindow();
    }

    private static void createWindow() {
        JFrame frame = new JFrame("java swing");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        createUI(frame);
        frame.setSize(560,200);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }

    private static void createUI(final JFrame frame) {
        JPanel panel = new JPanel();
        LayoutManager layout = new FlowLayout();
        panel.setLayout(layout);
        JButton button = new JButton("ok");
        button.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                JOptionPane.showMessageDialog(frame,"guten morgan");
            }
        });
        panel.add(button);
        button.setLocation(100,130);
        frame.getContentPane().add(panel,BorderLayout.CENTER);
    }  
}
