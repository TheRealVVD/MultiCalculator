package app.swing;

import javax.swing.*;

import static app.swing.ButtonsAndOperations.btnsAndOps;
import static app.swing.Frame.frame;
import static app.swing.ResultField.resultField;

public class MainPanel {
    public static JPanel mainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(resultField());
        mainPanel.add(btnsAndOps());

        return mainPanel;
    }
}
