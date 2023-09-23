package EXERCISE_1;

import javax.swing.JFrame;
import javax.swing.JTree;
import javax.swing.tree.DefaultMutableTreeNode;

public class Tree {
    public static void main(String[] args){
        JFrame f = new JFrame();

        DefaultMutableTreeNode game = new DefaultMutableTreeNode("Game");
        DefaultMutableTreeNode game1 = new DefaultMutableTreeNode("Elden Ring");
        DefaultMutableTreeNode game2 = new DefaultMutableTreeNode("God of War");
        DefaultMutableTreeNode game3 = new DefaultMutableTreeNode("DMC5");
        
        game.add(game1);
        game.add(game2);
        game.add(game3);

        JTree tr = new JTree(game);
        tr.setBounds(20,30,130,100);
        tr.setBackground(null);
        f.add(tr);

        f.setSize(400,200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLayout(null);
        f.setVisible(true);
    }
}
