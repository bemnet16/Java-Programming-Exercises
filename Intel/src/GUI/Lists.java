package GUI;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import java.awt.*;

public class Lists extends JFrame {

    private JPanel jPanel;
    private JList jList;
    private JLabel jLabel;
    private  JTextField jTextField;

    public Lists() throws HeadlessException {

        setTitle("list practice");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());
        build();
        add(jPanel);
        setSize(300,300);
        setVisible(true);
    }

    public void build(){

        String[] name = {"baba" , "mama" , "bement" , "hilina"};

        jList = new JList(name);
        jList.setSelectionMode(ListSelectionModel.MULTIPLE_INTERVAL_SELECTION);
        jLabel = new JLabel("you select:");
        jTextField = new JTextField(10);
        jTextField.setEditable(false);
        jList.addListSelectionListener(new l());
        jList.setBackground(Color.decode("#fe3c12"));
        jList.setBorder(BorderFactory.createLineBorder(Color.YELLOW,5));
        jList.setVisibleRowCount(2);

        JScrollPane jScrollPane = new JScrollPane(jList);

        jPanel = new JPanel();

        jPanel.add(jScrollPane);
        jPanel.add(jLabel);
        jPanel.add(jTextField);

    }

    private class l implements ListSelectionListener{

        public void valueChanged(ListSelectionEvent e){

            String in = (String)jList.getSelectedValue();

            jTextField.setText(in);





        }
    }

    public static void main(String[] args) {

        new Lists();
    }
}
