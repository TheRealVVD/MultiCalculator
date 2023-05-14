package app.swing;

import javax.swing.*;

import static app.swing.ButtonsAndOperations.btnsAndOps;
import static app.swing.Frame.frame;
import static app.swing.ResultField.initResultField;
import static app.swing.ResultField.resultField;


public class MainPanel {
    public static JPanel mainPanel() {
        JPanel mainPanel = new JPanel();
        mainPanel.add(initResultField());
        mainPanel.add(btnsAndOps());

        return mainPanel;
    }
}
