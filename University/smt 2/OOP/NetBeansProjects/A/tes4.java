package MDI;

import java.awt.BorderLayout;

import javax.swing.*;

public class tes4 {
  public static void main(String[] args) {
    JFrame parentWindow = new JFrame("MDI Interface Example");
    parentWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    parentWindow.setLayout(new BorderLayout());

    JDesktopPane desktopPane = new JDesktopPane();
    parentWindow.add(desktopPane, BorderLayout.CENTER);

    JInternalFrame childWindow1 = new JInternalFrame("Child Window 1", true, true, true, true);
    childWindow1.setBounds(50, 50, 200, 200);
    desktopPane.add(childWindow1);

    JInternalFrame childWindow2 = new JInternalFrame("Child Window 2", true, true, true, true);
    childWindow2.setBounds(100, 100, 200, 200);
    desktopPane.add(childWindow2);

    childWindow1.setVisible(true);
    childWindow2.setVisible(true);

    parentWindow.setSize(500, 500);
    parentWindow.setVisible(true);
  }
}
