package app.swing;

import app.Main;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ButtonsAndOperations {
    public static JPanel btnsAndOps() {
        Main listen = new Main();

        JPanel buttonsPanel = new JPanel();
        GridLayout numsAndOpsLayout = new GridLayout(6, 3);
        buttonsPanel.setLayout(numsAndOpsLayout);

        ArrayList<JButton> btns = new ArrayList<>();
        for (int i = 0; i < 10; i++) {
            JButton jButton = new JButton(Integer.toString(i));
//            jButton.addActionListener(listen);
            btns.add(jButton);
        }
        btns.forEach(buttonsPanel::add);

        List<String> operations = Arrays.asList("+", "-", "*", "/", ".", "C", "=");
        operations.forEach(x -> {
            JButton operButtons = new JButton(x);
//            operButtons.addActionListener(listen);
            buttonsPanel.add(operButtons);
        });



        return buttonsPanel;
    }
}
