package MDI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

public class Home extends JFrame {

    private ArrayList<ChildFrame> childFrames;
    private JDesktopPane desktopPane;
    private JMenuBar menuBar;
    private JMenu fileMenu;
    private JMenuItem newMenuItem;

    public Home() {
        super("SMS");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        childFrames = new ArrayList<>();

        desktopPane = new JDesktopPane();
        setContentPane(desktopPane);

        menuBar = new JMenuBar();
        fileMenu = new JMenu("File");
        newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                createNewChildFrame();
            }
        });
        fileMenu.add(newMenuItem);
        menuBar.add(fileMenu);
        setJMenuBar(menuBar);

        setSize(800, 600);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void createNewChildFrame() {
        ChildFrame childFrame = new ChildFrame("Child Frame " + (childFrames.size() + 1));
        childFrames.add(childFrame);
        desktopPane.add(childFrame);

        Timer timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                childFrame.updateTime();
            }
        });
        timer.start();
        childFrame.setSize(200, 200); // set the size of the child frame
        childFrame.setVisible(true);
        try {
            childFrame.setSelected(true);
        } catch (java.beans.PropertyVetoException e) {
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new Home();
            }
        });
    }
}
