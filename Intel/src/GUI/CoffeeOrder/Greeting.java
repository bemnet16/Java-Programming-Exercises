package GUI.CoffeeOrder;

import javax.swing.*;

public class Greeting extends JPanel {

    private JLabel jLabel;

    public Greeting() {

        jLabel = new JLabel("Welcome to Bradi's Bagle house");
        add(jLabel);
    }
}
