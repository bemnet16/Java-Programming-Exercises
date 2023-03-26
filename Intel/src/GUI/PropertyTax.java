package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class PropertyTax extends JFrame {

    private JPanel jPanel;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton calculate,exit;


    public PropertyTax(){

        setTitle("Property Tax Calculator");
        setSize(250,150);

        build();
        add(jPanel);




        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

    }

    public void build(){

        jLabel = new JLabel("Property value:");
        jTextField = new JTextField(10);
        calculate = new JButton("calculate");
        exit = new JButton("Exit");

        calculate.addActionListener(new al());
        exit.addActionListener(new el());

        jPanel = new JPanel();
        jPanel.setLayout(new GridLayout(2,10));

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(exit);
        jPanel.add(calculate);

    }

    private class al implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String in = jTextField.getText();
            double tot,ass,tax;

            tot = Double.parseDouble(in);
            ass = tot * 0.6;
            tax = (ass / 100) * 0.64;

            JOptionPane.showMessageDialog(null,"tax : " + tax);
        }
    }

    private class el implements ActionListener{

        public void actionPerformed(ActionEvent e) {

            System.exit(0);

             }
        }

    public static void main(String[] args) {
        new PropertyTax();
    }
}
