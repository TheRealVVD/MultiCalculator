package app;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static app.swing.Frame.frame;
import static app.swing.InitCalculator.initCalculator;


public class Main extends JFrame implements ActionListener {

    public static void main(String[] args) {
        initCalculator();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.print(e.getActionCommand());
    }
}
