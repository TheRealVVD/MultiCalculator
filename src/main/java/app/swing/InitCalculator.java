package app.swing;

import javax.swing.*;

import static app.swing.Frame.frame;
import static app.swing.MainPanel.mainPanel;

public class InitCalculator {
    public static JFrame initCalculator() {
        JFrame frame = frame();
        frame.add(mainPanel());

        return frame;
    }
}
