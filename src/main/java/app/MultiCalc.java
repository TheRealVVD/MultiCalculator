package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MultiCalc extends JFrame {
    public int res = 0;

    public MultiCalc() {
        setTitle("Calculator");
        JPanel panel = new JPanel();
        JButton plusButton = new JButton("+");
        JButton minusButton = new JButton("-");
        JButton multiplyButton = new JButton("*");
        JButton divideButton = new JButton("/");
        JLabel result = new JLabel("Result");
        JTextField x1 = new JTextField("1");
        JTextField x2 = new JTextField("2");
        ActionListener listenerPlus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 + x_2;
                result.setText(String.valueOf(res));
            }
        };
        ActionListener listenerMinus = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 - x_2;
                result.setText(String.valueOf(res));
            }
        };
        ActionListener listenerMultiply = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 * x_2;
                result.setText(String.valueOf(res));
            }
        };
        ActionListener listenerDivide = new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                int x_1 = Integer.parseInt(x1.getText());
                int x_2 = Integer.parseInt(x2.getText());
                res = x_1 / x_2;
                result.setText(String.valueOf(res));
            }
        };

        plusButton.addActionListener(listenerPlus);
        minusButton.addActionListener(listenerMinus);
        multiplyButton.addActionListener(listenerMultiply);
        divideButton.addActionListener(listenerDivide);

        panel.setSize(new Dimension(1, 1));
        add(panel);
        panel.add(result);
        panel.add(plusButton);
        panel.add(minusButton);
        panel.add(divideButton);
        panel.add(multiplyButton);
        panel.add(x1);
        panel.add(x2);

        setPreferredSize(new Dimension(500, 500));
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
    }
}
