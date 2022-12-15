package SimpleCalc;

import javax.swing.*;

public class SimpleCalcGUI extends JFrame{
    private JPanel pnlSimpleCalculator;
    private JTextField tfNumber1;
    private JComboBox cbOperations;
    private JButton btnCompute;
    private JTextField tfNumber;
    private JTextField lblResult;



    public static void main(String[] args) {
        SimpleCalcGUI app = new SimpleCalcGUI();
        app.setTitle("Simple Calculator");
        app.setContentPane(app.pnlSimpleCalculator);
        app.setSize(525, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
