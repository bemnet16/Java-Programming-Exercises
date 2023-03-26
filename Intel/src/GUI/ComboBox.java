package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ComboBox extends JFrame {

    private JPanel jPanel;
    private JPanel main;
    private JPanel j;
    private JLabel jLabel;
    private JTextField jTextField;
    private JComboBox jComboBox;


    public ComboBox(){

        setTitle("combo box demo");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        build();

        j = new JPanel();
        j.setLayout(new BorderLayout());

        j.add(main,BorderLayout.CENTER);
        j.add(jPanel,BorderLayout.SOUTH);


        add(j);



        pack();
        setVisible(true);

    }

    public void build(){

        String[] coffee = {"Regular coffee","Dark roast","Cappuccino","Espresso","Decaf"};

        ImageIcon imageIcon = new ImageIcon("C:\\Users\\Bem\\Desktop\\New folder\\Telegram\\IMG_20220614_091608_230.jpg");
        jLabel = new JLabel("You selected:",imageIcon,SwingConstants.LEFT);

        jTextField = new JTextField(10);
        jTextField.setEditable(false);

        jComboBox = new JComboBox(coffee);
        jComboBox.setEditable(true);

        jComboBox.addActionListener(new al());



        jPanel = new JPanel();
        main = new JPanel();

        main.add(jComboBox);

        jPanel.add(jLabel);
        jPanel.add(jTextField);

    }

    private class al implements ActionListener{

        public void actionPerformed(ActionEvent e){

            String selected = (String) jComboBox.getSelectedItem();

            jTextField.setText(selected);

        }
    }

    public static void main(String[] args) {
        new ComboBox();
    }
}
