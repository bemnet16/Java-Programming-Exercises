package GUI.CoffeeOrder;

import javax.swing.*;
import java.awt.*;

public class Topping extends JPanel {

    private JCheckBox cream;
    private JCheckBox butter;
    private JCheckBox peach;
    private JCheckBox blueberry;

    public Topping() {

        cream = new JCheckBox("Cream cheese",true);
        butter = new JCheckBox("Butter");
        peach = new JCheckBox("Peach Jelly");
        blueberry = new JCheckBox("Blueberry Jam");

        setLayout(new GridLayout(4,0));

        add(cream);
        add(butter);
        add(peach);
        add(blueberry);
        setBorder(BorderFactory.createTitledBorder("toppings"));
    }

    public double getTotalTopping(){

        double price = 0;

        if(cream.isSelected())
            price += 0.5;
        if(butter.isSelected())
            price += 0.25;
        if(peach.isSelected())
            price += 0.75;
        if(blueberry.isSelected())
            price += 0.75;

        return price;
    }
}
