package GUI.CoffeeOrder;

import javax.swing.*;
import java.awt.*;

public class Coffee extends JPanel {

    private JRadioButton none;
    private JRadioButton regular;
    private JRadioButton decaf;
    private JRadioButton cappuccino;
    private ButtonGroup group;

    public Coffee() {

        none = new JRadioButton("None",true);
        regular = new JRadioButton("Regular Coffee");
        decaf = new JRadioButton("Decaf Coffee");
        cappuccino = new JRadioButton("Cappuccino");
        group = new ButtonGroup();

        group.add(none);
        group.add(regular);
        group.add(decaf);
        group.add(cappuccino);

        setLayout(new GridLayout(4,0));

        add(none);
        add(regular);
        add(decaf);
        add(cappuccino);
        setBorder(BorderFactory.createTitledBorder("coffee"));

    }

    public double getCoffeeTotal(){

        double price = 0;

        if(none.isSelected())
            price = 0;
        else if(regular.isSelected())
            price = 1.25;
        else if(decaf.isSelected())
            price = 1.25;
        else if(cappuccino.isSelected())
            price = 2;

        return price;
    }
}
