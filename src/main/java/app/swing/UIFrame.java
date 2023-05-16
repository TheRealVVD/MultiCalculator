package app.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import static app.swing.MyComponent.setupButtonsSettings;

public class UIFrame implements ActionListener {
    private final JFrame frame;

    private final JPanel panel;
    private final JPanel subPanel1;
    private final JPanel subPanel2;
    private final JPanel subPanel3;
    private final JPanel subPanel4;
    private final JPanel subPanel5;
    private final JPanel subPanel6;

    private final JTextArea resultArea;


    private final String[] valueButtons = {"0", "1", "2", "3", "4", "5", "6", "7", "8", "9"};
    private final String[] operationsButtonsSign = {"+", "-", "*", "/", "=", "sqrt", "1/x", "x*x", "x^y",
            "Sin", "Cos", "Tan", "C", "x!", "|x|"};
    private final JButton buttons[], plusBut, minusBut, multiplyBut, divedeBut, equalBut, sqrtBut, oneDividedByBut,
            squareBut, xPOWyBut, sinBut, cosBut, tanBut, cancelBut, factBut, absBut;

    private final Font buttonFont;
    private final Font digitButtonFont;
    private final Font resultAreaFont;
    private final Dimension buttonsDimension;

    public UIFrame() {
        frame = new JFrame("Calculator") {};
        frame.setVisible(true);

        panel = new JPanel();
        subPanel1 = new JPanel();
        subPanel2 = new JPanel();
        subPanel3 = new JPanel();
        subPanel4 = new JPanel();
        subPanel5 = new JPanel();
        subPanel6 = new JPanel();

        resultArea = new JTextArea(1, 28);

        buttonFont = new Font("Consolas", Font.PLAIN, 16);
        digitButtonFont = new Font("Consolas", Font.BOLD, 17);
        resultAreaFont = new Font("Consolas", Font.BOLD, 20);

        buttonsDimension = new Dimension(60, 40);

        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(Integer.toString(i));
        }

        plusBut = new JButton("+");
        minusBut = new JButton("-");
        multiplyBut = new JButton("*");
        divedeBut = new JButton("/");
        equalBut = new JButton("=");
        sqrtBut = new JButton("sqrt");
        oneDividedByBut = new JButton("1/x");
        squareBut = new JButton("x*x");
        xPOWyBut = new JButton("x^y");
        sinBut = new JButton("Sin");
        cosBut = new JButton("Cos");
        tanBut = new JButton("Tan");
        cancelBut = new JButton("C");
        factBut = new JButton("x!");
        absBut = new JButton("|x|");


    }

    public void init() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        frame.setBounds(dimension.width/2 - 200, dimension.height/2 - 200, 350, 375);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        resultArea.setEditable(false);
        resultArea.setFont(resultAreaFont);
//        resultArea.set


        for (int i = 0; i < buttons.length; i++) {
            setupButtonsSettings(buttons[i], digitButtonFont, Color.WHITE, buttonsDimension);
//            buttons[i].setFont(buttonFont);
//            buttons[i].setBackground(Color.WHITE);
//            buttons[i].setPreferredSize(buttonsDimension);

        }
        plusBut.setFont(buttonFont);
        plusBut.setPreferredSize(buttonsDimension);
        minusBut.setFont(buttonFont);
        minusBut.setPreferredSize(buttonsDimension);
        multiplyBut.setFont(buttonFont);
        multiplyBut.setPreferredSize(buttonsDimension);
        divedeBut.setFont(buttonFont);
        divedeBut.setPreferredSize(buttonsDimension);
        equalBut.setFont(buttonFont);
        equalBut.setPreferredSize(buttonsDimension);
        sqrtBut.setFont(buttonFont);
        sqrtBut.setPreferredSize(buttonsDimension);
        oneDividedByBut.setFont(buttonFont);
        oneDividedByBut.setPreferredSize(buttonsDimension);
        squareBut.setFont(buttonFont);
        squareBut.setPreferredSize(buttonsDimension);
        xPOWyBut.setFont(buttonFont);
        xPOWyBut.setPreferredSize(buttonsDimension);
        sinBut.setFont(buttonFont);
        sinBut.setPreferredSize(buttonsDimension);
        cosBut.setFont(buttonFont);
        cosBut.setPreferredSize(buttonsDimension);
        tanBut.setFont(buttonFont);
        tanBut.setPreferredSize(buttonsDimension);
        cancelBut.setFont(buttonFont);
        cancelBut.setPreferredSize(buttonsDimension);
        factBut.setFont(buttonFont);
        factBut.setPreferredSize(buttonsDimension);
        absBut.setFont(buttonFont);
        absBut.setPreferredSize(buttonsDimension);


//        GridLayout numsAndOpsLayout = new GridLayout(1, 5);

        panel.add(Box.createHorizontalStrut(100));
        subPanel1.add(resultArea);
        panel.add(subPanel1);

        subPanel2.add(squareBut);
        subPanel2.add(absBut);
        subPanel2.add(xPOWyBut);
        subPanel2.add(cancelBut);
        subPanel2.add(divedeBut);
//        subPanel2.setLayout(numsAndOpsLayout);
        panel.add(subPanel2);


        subPanel3.add(sqrtBut);
        subPanel3.add(buttons[7]);
        subPanel3.add(buttons[8]);
        subPanel3.add(buttons[9]);
        subPanel3.add(multiplyBut);
//        subPanel3.setLayout(numsAndOpsLayout);
        panel.add(subPanel3);

        subPanel4.add(sinBut);
        subPanel4.add(buttons[4]);
        subPanel4.add(buttons[5]);
        subPanel4.add(buttons[6]);
        subPanel4.add(minusBut);
//        subPanel4.setLayout(numsAndOpsLayout);
        panel.add(subPanel4);

        subPanel5.add(cosBut);
        subPanel5.add(buttons[1]);
        subPanel5.add(buttons[2]);
        subPanel5.add(buttons[3]);
        subPanel5.add(plusBut);
//        subPanel5.setLayout(numsAndOpsLayout);
        panel.add(subPanel5);

        subPanel6.add(tanBut);
        subPanel6.add(oneDividedByBut);
        subPanel6.add(buttons[0]);
        subPanel6.add(factBut);
        subPanel6.add(equalBut);
//        subPanel6.setLayout(numsAndOpsLayout);
        panel.add(subPanel6);

        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {

    }
}
