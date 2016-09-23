package test;

import service.DnieDAO;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * Created on 23.09.16, at 19:01
 */
public class GuiZDniami {
    private JPanel mp;
    private JTextField textField1;
    private JButton button1;
    private JTextField textField2;
    private JComboBox comboBox1;
    private JButton wybierzDzienButton;
    //------------------^^^ elementy graficzne
    private DnieDAO dnieDAO = new DnieDAO();



    public GuiZDniami() {
        comboBox1.addItem("Poniedziałek");
        comboBox1.addItem("Wtorek");
        comboBox1.addItem("Środa");
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String input = textField1.getText();
                Integer id = Integer.valueOf(input);
                String dzien = dnieDAO.getDay(id);
                textField2.setText(dzien);
            }
        });
        wybierzDzienButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                textField2.setText("" + dnieDAO.getId((String)comboBox1.getSelectedItem()));
            }
        });
    }

    public static void main(String[] args) {
        JFrame frame = new JFrame("GuiZDniami");
        frame.setContentPane(new GuiZDniami().mp);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
