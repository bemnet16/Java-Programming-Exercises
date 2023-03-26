package GUI;

import javax.swing.*;
import javax.swing.event.ChangeEvent;
import javax.swing.event.ChangeListener;
import java.awt.*;

public class Temp extends JFrame {

    private JPanel main;

    private JPanel cel;
    private JPanel fahr;
    private JPanel sli;

    private JSlider jSlider;
    private JLabel c;
    private JLabel f;

    private JTextField ct;
    private JTextField ft;

    public Temp(){

        setTitle("Tempreture converter");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        main = new JPanel();
        main.setLayout(new BorderLayout());

        build();

        main.add(fahr,BorderLayout.NORTH);
        main.add(cel,BorderLayout.CENTER);
        main.add(sli,BorderLayout.SOUTH);

        add(main);




        pack();
        setVisible(true);


    }
    public void build(){

        c = new JLabel("Fahrenheit");
        ct = new JTextField("0.0",10);
        ct.setEditable(false);

        f = new JLabel("Celsius");
        ft = new JTextField("0.0",10);
        ft.setEditable(false);

        jSlider = new JSlider(JSlider.HORIZONTAL,0,100,0);
        jSlider.setMajorTickSpacing(20);
        jSlider.setMinorTickSpacing(2);
        jSlider.setPaintTicks(true);
        jSlider.setPaintLabels(true);

        jSlider.addChangeListener(new cl());



        fahr = new JPanel();
        fahr.add(f);
        fahr.add(ft);

        cel = new JPanel();
        cel.add(c);
        cel.add(ct);

        sli = new JPanel();
        sli.add(jSlider);



    }

    private class cl implements ChangeListener{

        public void stateChanged(ChangeEvent e){

            double cel,far;

            cel = jSlider.getValue();

            far = (9.0 / 5.0) * cel + 32;

            ct.setText(Double.toString(cel));

            ft.setText(String.format("%.2f",far));
        }

    }

    public static void main(String[] args) {

        new Temp();
    }

}
