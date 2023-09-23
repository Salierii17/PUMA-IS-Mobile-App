package MDI;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import javax.swing.JButton;
import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

public class MyInternalFrame extends JInternalFrame {
    private List<String> modificationHistory;
    private JTable historyTable;
    private DefaultTableModel tableModel;

    public MyInternalFrame(String title) {
        super(title, true, true, true, true);
        modificationHistory = new ArrayList<>();
        setLayout(new BorderLayout());

        JLabel label = new JLabel("This is an internal frame.");
        add(label, BorderLayout.CENTER);

        JPanel buttonPanel = new JPanel();
        JButton addButton = new JButton("Add Modification");
        addButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                addModification();
            }
        });
        buttonPanel.add(addButton);
        add(buttonPanel, BorderLayout.SOUTH);

        String[] columnNames = {"Date/Time", "Modification"};
        tableModel = new DefaultTableModel(columnNames, 0);
        historyTable = new JTable(tableModel);
        JScrollPane scrollPane = new JScrollPane(historyTable);
        add(scrollPane, BorderLayout.EAST);

        setSize(600, 400);
        setVisible(true);
    }

    private void addModification() {
        LocalDateTime now = LocalDateTime.now();
        String formattedDateTime = now.format(DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss"));
        String modification = "Modification " + (modificationHistory.size() + 1);
        modificationHistory.add(modification);
        Object[] rowData = {formattedDateTime, modification};
        tableModel.addRow(rowData);
    }
}