package GUI;

import javax.swing.*;
import java.awt.*;

public class Table extends JFrame {

    private JPanel panel;
    private JMenuBar menuBar;
    private JMenuItem menuItem;
    private JMenu menu;
    private JButton button;
    private JLabel label;
    private JTable table;

    public Table() {

        setTitle("table");
        setSize(200,400);
        build();
        add(panel);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }

    public void build(){

        button = new JButton("save");
        label = new JLabel("TABALE");
        table = new JTable(12,23);
        String[] name = {"adugnaw" , "etunat", "bemnet", "hilina"};



        panel = new JPanel();

        panel.add(label);
        panel.add(table);
        panel.add(button);
    }

    public static void main(String[] args) {
        new Table();
    }
}
