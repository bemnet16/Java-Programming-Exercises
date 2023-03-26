package GUI;
import javax.swing.*;
import java.awt.event.*;

public class KilometerConvert extends JFrame {

    private JPanel panel;
    private JLabel messageLabel;
    private JTextField text;
    private JButton button;

    public KilometerConvert(){
        setTitle("kilo meter converter");
        setSize(310,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        buildpanel();
        add(panel);
        setVisible(true);
    }
    public void buildpanel() {
        messageLabel = new JLabel("Enter kilometer :");
        text = new JTextField(12);
        button = new JButton("convert");
        panel = new JPanel();
        panel.add(messageLabel);
        panel.add(text);
        panel.add(button);
        cal c = new cal();
        button.addActionListener(c);


    }
        private class cal implements ActionListener{
            public void actionPerformed(ActionEvent bem){
                String inp;
                double mile;

                final double RA = 0.612;
                inp = text.getText();

                System.out.println("Reading " + inp + " from the text field.");
                System.out.println("Converted value: " + Double.parseDouble(inp));


                mile = Double.parseDouble(inp) * RA;
                dis(mile);

                System.out.println("Ready for another input.");
            }
        }
        public void dis(double d){
        JFrame j = new JFrame();
        JPanel p = new JPanel();
            j.setTitle("kilo meter converter");
            j.setSize(500,150);
            j.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            messageLabel = new JLabel("the anseer" + d);
            p.add(messageLabel);
            j.add(p);
            j.setVisible(true);
        }

    public static void main(String[] args) {
        KilometerConvert p = new KilometerConvert();
    }
}