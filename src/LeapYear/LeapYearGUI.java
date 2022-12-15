package LeapYear;

import javax.swing.*;

public class LeapYearGUI extends JFrame{
    private JPanel pnlLeapYearChecker;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public static void main(String[] args) throws Exception {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.pnlLeapYearChecker);
        app.setTitle("Leap Year Checker");
        app.setSize(400, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

}
