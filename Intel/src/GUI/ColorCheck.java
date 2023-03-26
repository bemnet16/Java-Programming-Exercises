package GUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;

public class ColorCheck extends JFrame {

    private JPanel jPanel;
    private JLabel jLabel;
    private JCheckBox jCheckBox1;
    private JCheckBox jCheckBox2;

    public ColorCheck() {

        setTitle("color check");
        setSize(300,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        build();
        add(jPanel);
        setVisible(true);
    }


    public void build(){

        jLabel = new JLabel("Select the check box to change colors.");
        jCheckBox1 = new JCheckBox("yellow background");
        jCheckBox2 = new JCheckBox("red foreground");

        jCheckBox1.addItemListener(new item());
        jCheckBox2.addItemListener(new item());

        jPanel = new JPanel();
        jPanel.add(jLabel);
        jPanel.add(jCheckBox1);
        jPanel.add(jCheckBox2);




        jPanel.setBorder(BorderFactory.createTitledBorder("color choice"));

    }

    private class item implements ItemListener{

        public void itemStateChanged(ItemEvent e){

            if(e.getSource() == jCheckBox1){
                if(jCheckBox1.isSelected()) {
                    jPanel.setBackground(Color.yellow);
                    jCheckBox1.setBackground(Color.yellow);
                    jCheckBox2.setBackground(Color.yellow);
                    jPanel.setBorder(BorderFactory.createEmptyBorder(20,20,20,20));
                }else {
                    jPanel.setBackground(Color.LIGHT_GRAY);
                    jCheckBox1.setBackground(Color.lightGray);
                    jCheckBox2.setBackground(Color.lightGray);
                    jPanel.setBorder(BorderFactory.createLineBorder(Color.RED,2));
                }
            }
            else if(e.getSource() == jCheckBox2) {
                if(jCheckBox2.isSelected()) {
                    jLabel.setForeground(Color.red);
                    jCheckBox1.setForeground(Color.RED);
                    jCheckBox2.setForeground(Color.RED);
                }else{
                    jLabel.setForeground(Color.BLACK);
                    jCheckBox1.setForeground(Color.BLACK);
                    jCheckBox2.setForeground(Color.BLACK);

                }
            }

        }


    }

    public static void main(String[] args) {

        new ColorCheck();
    }
}
