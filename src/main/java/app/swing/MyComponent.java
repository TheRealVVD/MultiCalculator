package app.swing;

import javax.swing.*;
import java.awt.*;

public class MyComponent {

    public static void setupButtonsSettings(JButton jbutton, Font font, Color color, Dimension dimension) {
        jbutton.setFont(font);
        jbutton.setBackground(color);
        jbutton.setPreferredSize(dimension);
    }
}
