package MDI;

import java.awt.BorderLayout;

import javax.swing.*;

public class tes3 {
  public static void main(String[] args) {
    JFrame parentWindow = new JFrame("Modal Dialog Example");
    parentWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    parentWindow.setLayout(new BorderLayout());

    JButton showDialogButton = new JButton("Show Dialog");
    showDialogButton.addActionListener(e -> {
      JDialog modalDialog = new JDialog(parentWindow, "Modal Dialog", true);
      JPanel dialogPanel = new JPanel();
      dialogPanel.add(new JLabel("Enter your name:"));
      JTextField nameField = new JTextField(10);
      dialogPanel.add(nameField);
      JButton submitButton = new JButton("Submit");
      submitButton.addActionListener(e1 -> {
        JOptionPane.showMessageDialog(modalDialog, "Hello, " + nameField.getText() + "!", "Greeting", JOptionPane.INFORMATION_MESSAGE);
        modalDialog.dispose();
      });
      dialogPanel.add(submitButton);
      modalDialog.add(dialogPanel);
      modalDialog.pack();
      modalDialog.setLocationRelativeTo(parentWindow);
      modalDialog.setVisible(true);
    });
    parentWindow.add(showDialogButton, BorderLayout.CENTER);

    parentWindow.setSize(300, 200);
    parentWindow.setVisible(true);
  }
}

