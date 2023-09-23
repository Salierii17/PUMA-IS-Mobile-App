package MDI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
import javax.swing.event.InternalFrameAdapter;
import javax.swing.event.InternalFrameEvent;
import javax.swing.event.TreeModelEvent;
import javax.swing.event.TreeModelListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.tree.DefaultMutableTreeNode;
import javax.swing.tree.TreePath;

public class MDIApp extends JFrame implements ActionListener {

    private static final long serialVersionUID = 1L;

    private JDesktopPane desktopPane;

    public MDIApp() {
        super("MDI Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create the desktop pane and set it as the content pane of the frame
        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        // Create the menu bar and menus
        JMenuBar menuBar = new JMenuBar();
        JMenu fileMenu = new JMenu("File");
        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(this);
        fileMenu.add(newMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        // Set the size and location of the frame
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public static void main(String[] args) {
        MDIApp app = new MDIApp();
        app.setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        String actionCommand = e.getActionCommand();

        if ("New".equals(actionCommand)) {
            // Create a new child frame
            JInternalFrame childFrame = new JInternalFrame("Child Frame", true, true, true, true);
            childFrame.setSize(400, 300);
            childFrame.setVisible(true);

            // Add the child frame to the desktop pane
            desktopPane.add(childFrame);

            // Create the tree table and add it to the child frame
            JTreeTable treeTable = new JTreeTable(createTreeTableModel());
            JScrollPane scrollPane = new JScrollPane(treeTable);
            childFrame.getContentPane().add(scrollPane, BorderLayout.CENTER);

            // Add a listener to the child frame to update the history when it is closed
            childFrame.addInternalFrameListener(new InternalFrameAdapter() {
                @Override
                public void internalFrameClosed(InternalFrameEvent e) {
                    // Update the history with the name of the closed frame and the time it was closed
                    DefaultTableModel model = (DefaultTableModel) treeTable.getModel();
                    model.addRow(new Object[]{childFrame.getTitle(), new java.util.Date()});
                }
            });
        }
    }

    private JTree createTree() {
        // Create a root node for the tree
        DefaultMutableTreeNode root = new DefaultMutableTreeNode("Root");

        // Create some child nodes for the root node
        DefaultMutableTreeNode child1 = new DefaultMutableTreeNode("Child 1");
        DefaultMutableTreeNode child2 = new DefaultMutableTreeNode("Child 2");

        // Add the child nodes to the root node
        root.add(child1);
        root.add(child2);

        // Create the tree with the root node as the top node
        JTree tree = new JTree(root);

        return tree;
    }

    private DefaultTreeTableModel createTreeTableModel() {
        // Create the tree
        JTree tree = createTree();

        // Create the table model
        DefaultTreeTableModel model = new DefaultTreeTableModel(tree);

        // Add a column for the modification time
        model.addColumn("Modification Time");

        // Add a listener to the tree model to update the modification time when a node is changed
        model.addTreeModelListener(new TreeModelListener() {
            @Override
            public void treeStructureChanged(TreeModelEvent e) {
                updateModificationTime(e);
            }

            @Override
            public void treeNodesRemoved(TreeModelEvent e) {
                updateModificationTime(e);
            }

            @Override
            public void treeNodesChanged(TreeModelEvent e) {
                updateModificationTime(e);
            }

            @Override
            public void treeNodesInserted(TreeModelEvent e) {
                updateModificationTime(e);
            }

            private void updateModificationTime(TreeModelEvent e) {
                // Get the path to the changed node
                TreePath path = e.getTreePath();

                // Get the row index of the changed node
                int row = tree.getRowForPath(path);

                // Update the modification time of the row
                DefaultTableModel tableModel = (DefaultTableModel) model.getTableModel();
                tableModel.setValueAt(new java.util.Date(), row, 1);
            }
        });

        return model;
    }
