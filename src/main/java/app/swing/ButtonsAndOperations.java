package app.swing;

import app.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ButtonsAndOperations {

    static ArrayList<JButton> integersButtons;
    static List<String> operationsButtons;

    public static JPanel btnsAndOps() {
        Actions listen = new Actions();

        JPanel buttonsPanel = new JPanel();
        GridLayout numsAndOpsLayout = new GridLayout(6, 3);
        buttonsPanel.setLayout(numsAndOpsLayout);

        integersButtons = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton(Integer.toString(i));
            jButton.addActionListener(listen);
            integersButtons.add(jButton);
        }
        integersButtons.forEach(buttonsPanel::add);

        operationsButtons = Arrays.asList("+", "-", "*", "/", ".", "C", "=");
        operationsButtons.forEach(x -> {
            JButton operButtons = new JButton(x);
            operButtons.addActionListener(listen);
            buttonsPanel.add(operButtons);
        });



        return buttonsPanel;
    }
}
