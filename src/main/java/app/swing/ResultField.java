package app.swing;

import javax.swing.*;

public class ResultField {

    public static JTextField resultField() {
        JTextField resultField = new JTextField(16); // 16 количество символов, вмещающихся в строку
        resultField.setEditable(true); // false - можно изменить только с помощью кнопок
//        resultField.setSize(100, 100);

        resultField.setText("0");

        return resultField;
    }
}
