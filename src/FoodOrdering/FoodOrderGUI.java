package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;

public class FoodOrderGUI extends JFrame{
    private JPanel pnlFoodOrdering;
    private JRadioButton rbNone;
    private JButton btnOrder;
    private JRadioButton rb5;
    private JRadioButton rb10;
    private JRadioButton rb15;
    private JCheckBox cPizza;
    private JCheckBox cBurger;
    private JCheckBox cFries;
    private JCheckBox cSoftDrinks;
    private JCheckBox cTea;
    private JCheckBox cSundae;

    public static void main(String[] args) {
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.pnlFoodOrdering);
        app.setTitle("Food Ordering System");
        app.setSize(450, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }
}
