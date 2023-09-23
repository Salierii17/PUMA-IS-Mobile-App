package week_9;
import javax.swing.*;

public class SimpleForm extends JFrame {
    private JLabel nameLabel;
    private JLabel emailLabel;
    private JTextField nameField;
    private JTextField emailField;
    private JButton submitButton;

    public SimpleForm() {
        super("Simple Form");

        // Create Labels
        nameLabel = new JLabel("Name:");
        emailLabel = new JLabel("Email:");

        // Create Text Fields
        nameField = new JTextField(20);
        emailField = new JTextField(20);

        // Create Submit Button
        submitButton = new JButton("Submit");

        // Set Layout
        setLayout(new GridLayout(3, 2));

        // Add Components to JFrame
        add(nameLabel);
        add(nameField);
        add(emailLabel);
        add(emailField);
        add(submitButton);

        // Set JFrame Properties
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public static void main(String[] args) {
        SimpleForm form = new SimpleForm();
    }
}
