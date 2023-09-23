package MDI;

import javax.swing.*;
import java.awt.*;
import java.time.LocalDateTime;

public class ChildFrame extends JInternalFrame {
    private JTextArea textArea;
    private JLabel statusBar;
    private String title;

    public ChildFrame(String title) {
        super(title, true, true, true, true);
        this.title = title;
        textArea = new JTextArea();
        getContentPane().add(textArea, BorderLayout.CENTER);
        statusBar = new JLabel("Ready");
        getContentPane().add(statusBar, BorderLayout.SOUTH);
        pack();
    }

    public void appendText(String text) {
        textArea.append(text);
    }

    public void setStatus(String status) {
        statusBar.setText(status);
    }

    public String getTitle() {
        return title;
    }

    public void updateTime() {
        LocalDateTime now = LocalDateTime.now();
        setStatus(now.toString());
    }
}
