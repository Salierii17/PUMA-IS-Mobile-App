package MDI;

import javax.swing.*;
import java.awt.*;

public class MDIApplication extends JFrame {

    public MDIApplication() {
        super("MDI Application");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);

        JDesktopPane desktop = new JDesktopPane();
        setContentPane(desktop);

        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu fileMenu = new JMenu("File");
        menuBar.add(fileMenu);

        JMenuItem newMenuItem = new JMenuItem("New");
        newMenuItem.addActionListener(e -> {
            JInternalFrame internalFrame = new JInternalFrame("New Window", true, true, true, true);
            internalFrame.setSize(400, 300);
            internalFrame.setLocation(50, 50);
            desktop.add(internalFrame);
            internalFrame.setVisible(true);
        });
        fileMenu.add(newMenuItem);
    }

    public static void main(String[] args) {
        MDIApplication mdiApplication = new MDIApplication();
        mdiApplication.setVisible(true);
    }
}