package SimpleCalc;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Objects;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlSimpleCalculator;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber;
    private JTextField lblResult;

    public SimpleCalcGUI() throws Exception{
        btnCompute.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                Calculate();
            }
        });

        tfNumber1.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Calculate();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        tfNumber.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Calculate();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });

        cbOperations.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    Calculate();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) throws Exception{
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.pnlSimpleCalculator);
        app.setSize(525, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void Calculate() {
        try{
            int z = 0,
                    x = Integer.parseInt(tfNumber1.getText()),
                    y = Integer.parseInt(tfNumber.getText());
            if ("+".equals(cbOperations.getSelectedItem())) {
                z = x + y;
                lblResult.setText(Integer.toString(z));
            } else if ("-".equals(cbOperations.getSelectedItem())) {
                z = x - y;
                lblResult.setText(Integer.toString(z));
            } else if ("/".equals(cbOperations.getSelectedItem())) {
                z = x / y;
                lblResult.setText(Integer.toString(z));
            } else if ("*".equals(cbOperations.getSelectedItem())) {
                z = x * y;
                lblResult.setText(Integer.toString(z));
            } else {
                throw new Exception();
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(pnlSimpleCalculator, "Invalid input");
        }
    }

}
