package app.swing;

import javax.swing.*;
import java.awt.*;

public class MyComponent extends JComponent {
    @Override
    protected void paintComponent(Graphics g) {
        Graphics2D g2 = (Graphics2D) g;
        //        String[] fonts = GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
        Font font = new Font("Bitstream Charter", Font.BOLD, 20);

        g2.setFont(font);
        g2.drawString("Hello world", 20, 20);
    }


}
