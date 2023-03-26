package GUI;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class RetailItemPrice extends JFrame {

        private JPanel jPanel;
        private JLabel wholeSale;
        private JLabel markUp;
        private JTextField f1;
        private JTextField f2;
        private JButton retailPrice;
        private JButton jButton;

    public RetailItemPrice(){

        setTitle("Retail Price");
        setSize(300,200);
        build();

        add(jPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void build(){

        wholeSale = new JLabel("Whole sale cost :");
        markUp = new JLabel("markup percentage :");

        f1 = new JTextField(10);
        f2 = new JTextField(10);

        retailPrice = new JButton("Retail Price");
        jButton = new JButton("        ");
        retailPrice.addActionListener(new RListener());

        jPanel = new JPanel();
        jPanel.add(wholeSale);
        jPanel.add(f1);
        jPanel.add(markUp);
        jPanel.add(f2);
        jPanel.add(retailPrice);
        jPanel.add(jButton);

    }

    private class RListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String input;
            double whole,mark,price;

            input = f1.getText();
            whole = Double.parseDouble(input);

            input = f2.getText();
            mark = Double.parseDouble(input) / 100;

            price = whole * mark;

            JOptionPane.showMessageDialog(null,"retail price : " + price);

        }
    }

    public static void main(String[] args) {
        new RetailItemPrice();
    }
}
