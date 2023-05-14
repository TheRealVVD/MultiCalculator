package app;

import java.awt.event.ActionListener;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

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
