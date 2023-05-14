package app.swing;

import javax.swing.*;

public class ResultField {

    static JTextField resultField;
    public static JTextField initResultField() {
        resultField = new JTextField(16); // 16 количество символов, вмещающихся в строку
        resultField.setEditable(false); // false - можно изменить только с помощью кнопок
//        resultField.setSize(100, 100);

        resultField.setText("0");
        return resultField;
    }

}
