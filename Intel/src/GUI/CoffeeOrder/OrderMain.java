package GUI.CoffeeOrder;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class OrderMain extends JFrame {


    private Greeting greeting;
    private Bagle bagle;
    private Topping topping;
    private Coffee coffee;
    private JButton calculate;
    private JButton exit;
    private JPanel jPanel;

    public OrderMain(){

        setTitle("Coffee order calculator");

        greeting = new Greeting();
        bagle = new Bagle();
        topping = new Topping();
        coffee = new Coffee();
        buid();

        setLayout(new BorderLayout());

        add(greeting, BorderLayout.NORTH);
        add(bagle,BorderLayout.WEST);
        add(topping,BorderLayout.CENTER);
        add(coffee,BorderLayout.EAST);
        add(jPanel,BorderLayout.SOUTH);

        pack();
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void buid(){

        jPanel = new JPanel();

        calculate = new JButton("calculate");
        exit = new JButton("Exit");

        calculate.addActionListener(new calculateListener());
        exit.addActionListener(new exitListener());

        jPanel.add(calculate);
        jPanel.add(exit);


    }

    private class calculateListener implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            double total, subTotal, tax;

            subTotal = bagle.getTotalBagle() +
                    topping.getTotalTopping() +
                    coffee.getCoffeeTotal();

            tax = subTotal * 0.06;

            total = subTotal + tax;

            JOptionPane.showMessageDialog(null, String.format("Sub Total : $%.2f" +
                    "\nTax : $%.2f\n" +
                    "Total : %.2f" +
                    "", subTotal, tax, total));

        }
    }

    private class exitListener implements ActionListener{

            public void actionPerformed(ActionEvent e){

                System.exit(0);
            }
        }

    public static void main(String[] args) {
        new OrderMain();
    }
}
