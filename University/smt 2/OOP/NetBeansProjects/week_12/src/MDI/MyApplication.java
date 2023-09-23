package MDI;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;

public class MyApplication extends JFrame {
    private JMenuBar menuBar;

    public MyApplication() {
        setTitle("My MDI Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        // Create menu bar
        menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        // Create File menu
        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        // Create New menu item
        JMenuItem newItem = new JMenuItem("New");
        fileMenu.add(newItem);
        newItem.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addNewInternalFrame();
            }
        });

        setVisible(true);
    }

    private void addNewInternalFrame() {
        MyInternalFrame internalFrame = new MyInternalFrame("New Internal Frame");
        add(internalFrame);
        internalFrame.setVisible(true);
    }

    public static void main(String[] args) {
        MyApplication app = new MyApplication();
    }
}