package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MetricConverter extends JFrame {

    private JPanel jPanel;
    private JLabel jLabel;
    private JTextField jTextField;


    public MetricConverter() {
        setTitle("Metric converter");
        setSize(400,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        build();
        add(jPanel);
        setVisible(true);

    }

    public void build(){

        JRadioButton r1;
        JRadioButton r2;
        JRadioButton r3;


        jLabel = new JLabel("Enter a distance in kilometer: ");
        jTextField = new JTextField(15);

        r1 = new JRadioButton("convert to miles");
        r2 = new JRadioButton("convert to feet");
        r3 = new JRadioButton("convert to inches");

        r1.addActionListener(new radioActionListner());
        r2.addActionListener(new radioActionListner());
        r3.addActionListener(new radioActionListner());

        ButtonGroup group = new ButtonGroup();
        group.add(r1);
        group.add(r2);
        group.add(r3);

        jPanel = new JPanel();

        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(r1);
        jPanel.add(r2);
        jPanel.add(r3);


    }

    private class radioActionListner implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String action = e.getActionCommand();
            String km = jTextField.getText();

            if(action.equals("convert to miles"))
                JOptionPane.showMessageDialog(null,km + " kilometers is " + (Double.parseDouble(km) * 0.6214) + " miles.");
            else if(action.equals("convert to feet"))
                JOptionPane.showMessageDialog(null,km + " kilometers is " + (Double.parseDouble(km) * 3281) + " feet.");
            else if(action.equals("convert to inches"))
                JOptionPane.showMessageDialog(null,km + " kilometers is " + (Double.parseDouble(km) * 39370) + " inches.");
        }
    }

    public static void main(String[] args) {

        new MetricConverter();
    }
}
