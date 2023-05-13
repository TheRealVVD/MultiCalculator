package app.swing;

import javax.swing.*;
import java.awt.*;

public class Frame {
    public static JFrame frame() {
        JFrame jFrame = new JFrame() {};
        jFrame.setVisible(true); // делаем приложение видимым

        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();
        jFrame.setBounds(dimension.width/2 - 250, dimension.height/2 - 150, 500, 300); // заменяет 2 метода (setSize и setLocation)

        jFrame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE); // операция для кнопки "крестик"
        // первые 2 параметра - location, вторые 2 параметра - size
        jFrame.setTitle("Calculator");

        return jFrame;
    }
}
