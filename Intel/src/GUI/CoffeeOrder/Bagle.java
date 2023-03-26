package GUI.CoffeeOrder;

import javax.swing.*;
import java.awt.*;

public class Bagle extends JPanel{

    private JRadioButton white;
    private JRadioButton wheat;
    private ButtonGroup group;

    public Bagle() {

        white = new JRadioButton("White", true);
        wheat = new JRadioButton("Whole Wheat");
        group = new ButtonGroup();

        group.add(white);
        group.add(wheat);

        setLayout(new GridLayout(2, 1));

        add(white);
        add(wheat);
        setBorder(BorderFactory.createTitledBorder("bagle"));
    }
    public double getTotalBagle(){

        double price = 0;

        if(white.isSelected())
            price = 1.25;
        else if(wheat.isSelected())
            price =  1.50;

        return price;
    }
}
