package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class JoeAutomotive extends JFrame {

    private JPanel jPanel;
    private JLabel jLabel;
    private JTextField jTextField;
    private JButton jButton;
    private JCheckBox oil;
    private JCheckBox lube;
    private JCheckBox radiator;
    private JCheckBox transmission;
    private JCheckBox inspection;
    private JCheckBox muffler;
    private JCheckBox tire;


    public JoeAutomotive(){

        setTitle("Joe's automotive");
        build();
        add(jPanel);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        pack();
        setVisible(true);

    }

    public void build(){

        jPanel = new JPanel();
        jLabel = new JLabel("Labour hour:");
        jLabel.setFont(new Font("Monospaced",Font.BOLD + Font.ITALIC,24));
        jTextField = new JTextField(10);
        jTextField.setText("hours");
        jButton = new JButton("calculate");

        ImageIcon image = new ImageIcon("C:\\Users\\Bem\\Desktop\\New folder\\Telegram\\IMG_20220614_091608_230.jpg");
        jButton.setIcon(image);
        jButton.setToolTipText("if you want to calculate the total amount of your expense click here.");


        oil = new JCheckBox("oil");
        lube = new JCheckBox("lube");
        radiator = new JCheckBox("radiator");
        transmission = new JCheckBox("transmission");


        jButton.addActionListener(new c());

        jPanel.setLayout(new GridLayout(8,1));
        jPanel.setFont(new Font("Monospaced",Font.BOLD + Font.ITALIC,24));


        jPanel.add(oil);
        jPanel.add(lube);
        jPanel.add(radiator);
        jPanel.add(transmission);
        jPanel.add(jLabel);
        jPanel.add(jTextField);
        jPanel.add(jButton);
    }

    private class c implements ActionListener {

        @Override
        public void actionPerformed(ActionEvent e) {

            double total = 0;
            String in = jTextField.getText();
            double hour = Double.parseDouble(in);

            if(oil.isSelected())
                total += 25;
            if(lube.isSelected())
                total += 25;
            if(radiator.isSelected())
                total += 25;
            if(transmission.isSelected())
                total += 25;

            total += hour;



            JOptionPane.showMessageDialog(null,"total : " + total);


        }
    }

    public static void main(String[] args) {
        new JoeAutomotive();
    }
}
