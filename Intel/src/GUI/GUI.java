package GUI;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GUI extends JFrame{

    private JPanel p;
    private JPanel p2;
    private JLabel l;
    private JTextField t;
    private JButton b;

    JButton r1;
    JButton r2;
    JButton bl1;
    JButton bl2;

    public GUI() {

        setTitle("kilo converter:");
        setSize(410,200);
        setDefaultCloseOperation(3);
        buildPa();
        add(p);
        setBackground(Color.BLACK);
        setLayout(new GridLayout(2,3));
        JPanel j = new JPanel();

        p2 = new JPanel();

        JRadioButton r1 = new JRadioButton("r 1");
        JRadioButton r2 = new JRadioButton("r 2");
        JRadioButton r3 = new JRadioButton("r 3");

        ButtonGroup g = new ButtonGroup();
        g.add(r1);
        g.add(r2);
        g.add(r3);

        p2.add(r1);
        p2.add(r2);
        p2.add(r3);

        j.add(l);
        j.add(t);
        j.add(b);
        j.add(p2);

        add(j);
        add(r1);
        add(r2);
        add(bl1);
        add(bl2);
        setVisible(true);

    }

    public void buildPa(){

        p = new JPanel();
        l = new JLabel("enter a distance in kilometer : ");
        t = new JTextField(10);
        b = new JButton("calculate");

        r1 = new JButton("red 1");
        r2 = new JButton("red 2");
        bl1 = new JButton("blue 1");
        bl2 = new JButton("blue 2");
        JButton y = new JButton("yellow");

        b.addActionListener(new My());

        r1.addActionListener(new Red());
        r2.addActionListener(new Red());
        bl1.addActionListener(new Blue());
        bl2.addActionListener(new Blue());
        y.addActionListener(new Yellow());

        p.add(l);
        p.add(t);
        p.add(b);

        p.add(r1);
        p.add(r2);
        p.add(bl1);
        p.add(bl2);
        p.add(y);

    }

    private class My implements ActionListener {

        public void actionPerformed(ActionEvent e) {

            String input;
            double mile;

            input = t.getText();
            mile = Double.parseDouble(input) * 0.6214;

            JOptionPane.showMessageDialog(null, input + "kilometers is " + mile + "miles.");

        }
    }
        private class Red implements ActionListener{

            public void actionPerformed(ActionEvent e){

                p.setBackground(Color.RED);
                l.setForeground(Color.BLUE);

                String ac = e.getActionCommand();

                if(ac.equals("red 1"))
                    JOptionPane.showMessageDialog(null,"you click the first red button." + e.getActionCommand());
                else if(ac.equals("red 2"))
                    JOptionPane.showMessageDialog(null,"you click the SECOND red button." + e.getActionCommand());

            }
        }

        private class Yellow implements ActionListener{

            public void actionPerformed(ActionEvent e){

                p.setBackground(Color.YELLOW);
                l.setForeground(Color.CYAN);

            }
        }

        private class Blue implements ActionListener{

            public void actionPerformed(ActionEvent e){

                p.setBackground(Color.BLUE);
                l.setForeground(Color.MAGENTA);


                if(e.getSource() == bl1)
                    JOptionPane.showMessageDialog(null,"you click the first blue button." + e.getActionCommand());
                else if(e.getSource() == bl2)
                    JOptionPane.showMessageDialog(null,"you click the SECOND blue button." + e.getActionCommand());



            }
        }







    public static void main(String[] args) {

        new GUI();

    }
}
