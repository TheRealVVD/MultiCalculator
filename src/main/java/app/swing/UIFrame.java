package app.swing;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import static app.swing.MyComponent.setupButtonsSettings;

public class UIFrame implements ActionListener {
    
    private final Calculatings calc;
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
    private final String[] operationsButtonsSign = {"+", "-", "*", "/", "=", "log", "1/x", "x*x", "x^y",
            "Sin", "Cos", "Tan", "C", "x!", "|x|"};
    private final JButton buttons[], plusBut, minusBut, multiplyBut, divideBut, equalBut, logBut, oneDividedByBut,
            squareBut, xPOWyBut, sinBut, cosBut, tanBut, cancelBut, rateBut, absBut;

    private final Font buttonFont;
    private final Font digitButtonFont;
    private final Font resultAreaFont;
    private final Dimension buttonsDimension;
    private final Dimension resultAreaDimension;

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

        resultArea = new JTextArea(1, 30);

        buttonFont = new Font("Consolas", Font.PLAIN, 16);
        digitButtonFont = new Font("Consolas", Font.BOLD, 16);
        resultAreaFont = new Font("Consolas", Font.BOLD, 20);

        buttonsDimension = new Dimension(64, 40);
        resultAreaDimension = new Dimension(350, 35);

        buttons = new JButton[10];
        for (int i = 0; i < 10; i++) {
            buttons[i] = new JButton(Integer.toString(i));
        }
        plusBut = new JButton("+");
        minusBut = new JButton("-");
        multiplyBut = new JButton("*");
        divideBut = new JButton("/");
        equalBut = new JButton("=");
        logBut = new JButton("log");
        oneDividedByBut = new JButton("1/x");
        squareBut = new JButton("x*x");
        xPOWyBut = new JButton("x^y");
        sinBut = new JButton("Sin");
        cosBut = new JButton("Cos");
        tanBut = new JButton("Tan");
        cancelBut = new JButton("C");
        rateBut = new JButton("1%");
        absBut = new JButton("|x|");

        calc = new Calculatings();
    }

    public void init() {
        Toolkit toolkit = Toolkit.getDefaultToolkit();
        Dimension dimension = toolkit.getScreenSize();

        frame.setBounds(dimension.width/2 - 190, dimension.height/2 - 190, 380, 380);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setLocationRelativeTo(null);

        resultArea.setEditable(false);
        resultArea.setFont(resultAreaFont);
        resultArea.setPreferredSize(resultAreaDimension);


        for (JButton button : buttons) {
            setupButtonsSettings(button, digitButtonFont, Color.WHITE, buttonsDimension);
        }
        setupButtonsSettings(plusBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(minusBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(multiplyBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(divideBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(equalBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(logBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(oneDividedByBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(squareBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(xPOWyBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(sinBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(cosBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(tanBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(cancelBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(rateBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);
        setupButtonsSettings(absBut, buttonFont, Color.LIGHT_GRAY, buttonsDimension);



//        panel.add(Box.createHorizontalStrut(100));
        subPanel1.add(resultArea);
        panel.add(subPanel1);

        subPanel2.add(squareBut);
        subPanel2.add(absBut);
        subPanel2.add(xPOWyBut);
        subPanel2.add(cancelBut);
        subPanel2.add(divideBut);
        panel.add(subPanel2);


        subPanel3.add(logBut);
        subPanel3.add(buttons[7]);
        subPanel3.add(buttons[8]);
        subPanel3.add(buttons[9]);
        subPanel3.add(multiplyBut);
        panel.add(subPanel3);

        subPanel4.add(sinBut);
        subPanel4.add(buttons[4]);
        subPanel4.add(buttons[5]);
        subPanel4.add(buttons[6]);
        subPanel4.add(minusBut);
        panel.add(subPanel4);

        subPanel5.add(cosBut);
        subPanel5.add(buttons[1]);
        subPanel5.add(buttons[2]);
        subPanel5.add(buttons[3]);
        subPanel5.add(plusBut);
        panel.add(subPanel5);

        subPanel6.add(tanBut);
        subPanel6.add(oneDividedByBut);
        subPanel6.add(buttons[0]);
        subPanel6.add(rateBut);
        subPanel6.add(equalBut);
        panel.add(subPanel6);

        for (int i = 0; i < 10; i++) {
            buttons[i].addActionListener(this);
        }
        plusBut.addActionListener(this);
        minusBut.addActionListener(this);plusBut.addActionListener(this);
        multiplyBut.addActionListener(this);
        divideBut.addActionListener(this);
        equalBut.addActionListener(this);
        oneDividedByBut.addActionListener(this);
        rateBut.addActionListener(this);
        cancelBut.addActionListener(this);
        squareBut.addActionListener(this);
        xPOWyBut.addActionListener(this);
        logBut.addActionListener(this);
        sinBut.addActionListener(this);
        cosBut.addActionListener(this);
        tanBut.addActionListener(this);
        absBut.addActionListener(this);


        frame.add(panel);
        frame.setVisible(true);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        final Object source = e.getSource();
        Double checkNum = null;

        for (int i = 0; i < 10; i++) {
            if (source == buttons[i]) {
                resultArea.replaceSelection(valueButtons[i]);
                return;
            }
        }


        try {
            checkNum = Double.parseDouble(resultArea.getText());
        } catch(NumberFormatException k) {

        }

        if (checkNum != null || source == cancelBut) {
            if (source == plusBut) {
                writer(calc.calculateBi(Calculatings.BiOperatorModes.plus, reader()));
                resultArea.replaceSelection(plusBut.getText());
            }

            if (source == minusBut) {
                writer(calc.calculateBi(Calculatings.BiOperatorModes.minus, reader()));
                resultArea.replaceSelection(minusBut.getText());
            }

            if (source == multiplyBut) {
                writer(calc.calculateBi(Calculatings.BiOperatorModes.multiply, reader()));
                resultArea.replaceSelection(multiplyBut.getText());
            }

            if (source == divideBut) {
                writer(calc.calculateBi(Calculatings.BiOperatorModes.divide, reader()));
                resultArea.replaceSelection(divideBut.getText());
            }

            if (source == xPOWyBut) {
                writer(calc.calculateBi(Calculatings.BiOperatorModes.xpowerofy, reader()));
            }

            if (source == squareBut) {
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.square, reader()));
            }

            if (source == rateBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.rate, reader()));

            if (source == oneDividedByBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.oneDividedBy, reader()));

            if (source == cosBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.cos, reader()));

            if (source == sinBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.sin, reader()));

            if (source == tanBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.tan, reader()));

            if (source == logBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.log, reader()));

            if (source == rateBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.rate, reader()));

            if (source == absBut)
                writer(calc.calculateMono(Calculatings.MonoOperatorModes.abs, reader()));

            if (source == equalBut)
                writer(calc.calculateEqual(reader()));

            if (source == cancelBut)
                writer(calc.reset());

        }

        resultArea.selectAll();
    }

    public Double reader() {
        Double num;
        String str;
        str = resultArea.getText();
        num = Double.valueOf(str);

        return num;
    }

    public void writer(final Double num) {
        if (Double.isNaN(num)) {
            resultArea.setText("");
        } else {
            resultArea.setText(Double.toString(num));
        }
    }
}
