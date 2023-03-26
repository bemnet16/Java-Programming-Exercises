package GUI.TheaterRevenu;

import javax.swing.*;
import java.awt.*;

public class Price extends JPanel {

    private JLabel perAdult;
    private JLabel noAdult;
    private JLabel perChild;
    private JLabel noChild;

    private JTextField perAdultTF;
    private JTextField noAdultTF;
    private JTextField perChildTF;
    private JTextField noChildTF;


    public Price() {

        setLayout(new GridLayout(4,4));

        perAdult = new JLabel("price per adult:");
        noAdult = new JLabel("Number of adult:");
        perChild = new JLabel("Price per child:");
        noChild = new JLabel("Number of child:");

        perAdultTF = new JTextField(10);
        noAdultTF = new JTextField(10);
        perChildTF = new JTextField(10);
        noChildTF = new JTextField(10);

        add(perAdult);
        add(perAdultTF);

        add(noAdult);
        add(noAdultTF);

        add(perChild);
        add(perChildTF);

        add(noChild);
        add(noChildTF);
    }

    public double getPerAdultTF() {

        double price = 0;

        if(!perAdultTF.getText().isEmpty())
            price = Double.parseDouble(perAdultTF.getText());

        return price;
    }

    public double getNoAdultTF() {

        double price = 0;

        if(!noAdultTF.getText().isEmpty())
            price = Double.parseDouble(noAdultTF.getText());

        return price;
    }

    public double getPerChildTF() {

        double price = 0;

        if(!perChildTF.getText().isEmpty())
            price = Double.parseDouble(perChildTF.getText());

        return price;
    }

    public double getNoChildTF() {

        double price = 0;

        if(!noChildTF.getText().isEmpty())
            price = Double.parseDouble(noChildTF.getText());

        return price;
    }
}
