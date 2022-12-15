package LeapYear;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class LeapYearGUI extends JFrame{
    private JPanel pnlLeapYearChecker;
    private JTextField tfYear;
    private JButton btnCheckYear;

    public LeapYearGUI() throws Exception{
        btnCheckYear.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                LeapYearChecker();
            }
        });

        tfYear.addKeyListener(new KeyListener() {
            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                    LeapYearChecker();
                }
            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
    }

    public static void main(String[] args) throws Exception {
        LeapYearGUI app = new LeapYearGUI();
        app.setContentPane(app.pnlLeapYearChecker);
        app.setTitle("Leap Year Checker");
        app.setSize(400, 250);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void LeapYearChecker() {
        try {
            int year = Integer.parseInt(tfYear.getText());
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                JOptionPane.showMessageDialog(pnlLeapYearChecker, "Leap year");
            } else {
                JOptionPane.showMessageDialog(pnlLeapYearChecker, "Not a leap year");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(pnlLeapYearChecker, "Invalid input");
        }
    }

}
