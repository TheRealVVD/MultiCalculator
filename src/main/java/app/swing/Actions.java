package app.swing;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static app.swing.ButtonsAndOperations.operationsButtons;
import static app.swing.ResultField.resultField;

public class Actions extends JFrame implements ActionListener {
    static String a = "", b = "", operation = "";
    int res;
    @Override
    public void actionPerformed(ActionEvent e) {
        String s = e.getActionCommand();

        if (s.charAt(0) >= '0' && s.charAt(0) <= '9') {
            if (operation.equals("")) {
                a += s;
            } else {
                b += s;
            }
            resultField.setText(a + operation + b);

        } else if (s.charAt(0) == 'C') {
            a = b = operation = "";
            resultField.setText("0");
        } else if (s.charAt(0) == '=') {
            if (operation.equals("+")) {
                res = Integer.parseInt(a) + Integer.parseInt(b);
            }
            if (operation.equals("-")) {
                res = Integer.parseInt(a) - Integer.parseInt(b);
            }
            if (operation.equals("*")) {
                res = Integer.parseInt(a) * Integer.parseInt(b);
            }
            if (operation.equals("/")) {
                try {
                    res = Integer.parseInt(a) / Integer.parseInt(b);

                }
                catch (ArithmeticException exc) {
                    resultField.setText("Делить на ноль нельзя");
                }
            };
            a = String.valueOf(res);
            resultField.setText(a);
            operation = b = "";
        } else {
            if (operation.equals("")) {
                operation = s;
            }
            resultField.setText(a + operation + b);
        }
    }
}
