package GUI.TheaterRevenu;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Theater extends JFrame {

    private JPanel mainPanel;
    private Price price = new Price();
    private JPanel btn;
    private JButton calculate;

    public Theater(){

        super("Theater revenue");
        setDefaultCloseOperation(EXIT_ON_CLOSE);


        build();
        add(mainPanel);
        pack();
        setVisible(true);

    }

    public void build(){

        mainPanel = new JPanel();

        calculate = new JButton("calculate");
        calculate.addActionListener(new calcListener());

        btn = new JPanel();
        btn.add(calculate);


        mainPanel.setLayout(new BorderLayout());

        mainPanel.add(price,BorderLayout.NORTH);
        mainPanel.add(btn,BorderLayout.SOUTH);

    }

    private class calcListener implements ActionListener{

        public void actionPerformed(ActionEvent e){

            double tAdult,nAdult,tChild,nChild,tGross,tNet;

            tAdult = price.getPerAdultTF() * price.getNoAdultTF();
            nAdult = tAdult - (tAdult / 2);

            tChild = price.getPerChildTF() * price.getNoChildTF();
            nChild = tChild - (tChild / 2);

            tGross = tAdult + tChild;
            tNet = nAdult + nChild;

            JOptionPane.showMessageDialog(null," Gross revenue for adult tickets sold: " + tAdult
            + "\nNet revenue for adult tickets sold: " + nAdult
            + "\nGross revenue for child tickets sold: " + tChild
            + "\nNet revenue for child tickets sold: " + nChild
            + "\n\t Total gross revenue: " + tGross
            +"\n\t Total net revenue" + tNet);

        }
    }

    public static void main(String[] args) {
        new Theater();
    }
}