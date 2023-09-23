package EXERCISE_2;

import java.awt.*;
import javax.swing.*;

public class form2 extends JFrame {
    
    private JLabel nameLabel, ageLabel, genderLabel, coursesLabel, yearLabel;
    private JTextField nameField, ageField;
    private JRadioButton maleRadio, femaleRadio;
    private JCheckBox javaCheck, pythonCheck, cppCheck;
    private JComboBox<String> yearBox;
    private JButton submitButton;
    
    public form2() {
        super("Student Form");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // Create the labels
        nameLabel = new JLabel("Name:");
        ageLabel = new JLabel("Age:");
        genderLabel = new JLabel("Gender:");
        coursesLabel = new JLabel("Courses:");
        yearLabel = new JLabel("Year:");
        
        // Create the text fields
        nameField = new JTextField(20);
        ageField = new JTextField(3);
        
        // Create the radio buttons and add them to a button group
        maleRadio = new JRadioButton("Male");
        femaleRadio = new JRadioButton("Female");
        ButtonGroup genderGroup = new ButtonGroup();
        genderGroup.add(maleRadio);
        genderGroup.add(femaleRadio);
        
        // Create the check boxes
        javaCheck = new JCheckBox("Java");
        pythonCheck = new JCheckBox("Python");
        cppCheck = new JCheckBox("C++");
        
        // Create the combo box
        String[] yearOptions = {"1st Year", "2nd Year", "3rd Year", "4th Year", "5th Year"};
        yearBox = new JComboBox<>(yearOptions);
        
        // Create the submit button
        submitButton = new JButton("Submit");
        
        // Create a panel and add the components to it
        JPanel panel = new JPanel(new GridBagLayout());
        GridBagConstraints c = new GridBagConstraints();
        c.gridx = 0;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_END;
        panel.add(nameLabel, c);
        c.gridy = 1;
        panel.add(ageLabel, c);
        c.gridy = 2;
        panel.add(genderLabel, c);
        c.gridy = 3;
        panel.add(coursesLabel, c);
        c.gridy = 4;
        panel.add(yearLabel, c);
        c.gridx = 1;
        c.gridy = 0;
        c.anchor = GridBagConstraints.LINE_START;
        panel.add(nameField, c);
        c.gridy = 1;
        panel.add(ageField, c);
        c.gridy = 2;
        panel.add(maleRadio, c);
        c.gridx = 2;
        panel.add(femaleRadio, c);
        c.gridx = 1;
        c.gridy = 3;
        panel.add(javaCheck, c);
        c.gridx = 2;
        panel.add(pythonCheck, c);
        c.gridx = 3;
        panel.add(cppCheck, c);
        c.gridy = 4;
        c.gridx = 1;
        c.gridwidth = 3;
        panel.add(yearBox, c);
        c.gridy = 5;
        c.gridx = 0;
        c.gridwidth = 4;
        panel.add(submitButton, c);
        
        // Add the panel to the frame
        getContentPane().add(panel);
        
        // Set the size and make the frame visible
        setSize(400, 250);
        setVisible(true);
    }
    
    public static void main(String[] args) {
        new form2();
    }
}

