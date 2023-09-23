package MDI;

import javax.swing.*;
import javax.swing.tree.DefaultMutableTreeNode;

public class TreeMenuGUI extends JFrame {

    private JTree tree;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenu editMenu;

    public TreeMenuGUI() {
        // Create a root node for the tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create some child nodes for the root node
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add the child nodes to the root node
        root.add(child1);
        root.add(child2);

        // Create the tree with the root node as the top node
        tree = new JTree(root);

        // Create the menu bar and menus
        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        editMenu = new JMenu("Edit");

        // Add the menus to the menu bar
        menuBar.add(fileMenu);
        menuBar.add(editMenu);

        // Set the menu bar as the frame's menu bar
        setJMenuBar(menuBar);

        // Add the tree to the frame's content pane
        getContentPane().add(new JScrollPane(tree));
    }

    public static void main(String[] args) {
        // Create a new instance of the TreeMenuGUI class and show it
        TreeMenuGUI treeMenuGUI = new TreeMenuGUI();
        treeMenuGUI.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        treeMenuGUI.setSize(400, 300);
        treeMenuGUI.setVisible(true);
    }
}