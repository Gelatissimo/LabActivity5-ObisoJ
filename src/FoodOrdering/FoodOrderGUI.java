package FoodOrdering;

import LeapYear.LeapYearGUI;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.ArrayList;
import java.util.List;

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

    private List<JCheckBox> menu;
    private List<JRadioButton> discounts;

    static class NoSelectedFood extends Exception {
        @Override
        public String toString() {
            return "Please check at least 1 type of food";
        }
    }

    static class NoSelectedDiscount extends Exception {
        @Override
        public String toString() {
            return "Please check at least 1 type of discount";
        }
    }

    public FoodOrderGUI() throws Exception{
        menu = new ArrayList<>();
        menu.add(cPizza);
        menu.add(cBurger);
        menu.add(cFries);
        menu.add(cSoftDrinks);
        menu.add(cTea);
        menu.add(cSundae);
        discounts = new ArrayList<>();
        discounts.add(rbNone);
        discounts.add(rb5);
        discounts.add(rb10);
        discounts.add(rb15);

        btnOrder.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent ae) {
                OrderFood();
            }
        });

        for (JCheckBox c : menu) {
            c.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        OrderFood();
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }

        for (JRadioButton r : discounts) {
            r.addKeyListener(new KeyListener() {
                @Override
                public void keyTyped(KeyEvent e) {

                }

                @Override
                public void keyPressed(KeyEvent e) {
                    if (e.getKeyCode() == KeyEvent.VK_ENTER) {
                        OrderFood();
                    }
                }

                @Override
                public void keyReleased(KeyEvent e) {

                }
            });
        }
        rbNone.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rb5.setSelected(false);
                rb10.setSelected(false);
                rb15.setSelected(false);
            }
        });

        rb5.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbNone.setSelected(false);
                rb10.setSelected(false);
                rb15.setSelected(false);
            }
        });

        rb10.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbNone.setSelected(false);
                rb5.setSelected(false);
                rb15.setSelected(false);
            }
        });
        rb15.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                rbNone.setSelected(false);
                rb5.setSelected(false);
                rb10.setSelected(false);
            }
        });
    }

    public static void main(String[] args) throws Exception{
        FoodOrderGUI app = new FoodOrderGUI();
        app.setContentPane(app.pnlFoodOrdering);
        app.setTitle("Food Ordering System");
        app.setSize(450, 500);
        app.setDefaultCloseOperation(EXIT_ON_CLOSE);
        app.setVisible(true);
    }

    public void OrderFood() {
        try {
            double total = 0;
            int menu_ctr = 0;
            for (JCheckBox c : menu) {
                if (c.isSelected()) {
                    if (c.getText().equals("Pizza")) {
                        total += 100;
                        menu_ctr++;
                    }
                    if (c.getText().equals("Burger")) {
                        total += 80;
                        menu_ctr++;
                    }
                    if (c.getText().equals("Fries")) {
                        total += 65;
                        menu_ctr++;
                    }
                    if (c.getText().equals("SoftDrinks")) {
                        total += 55;
                        menu_ctr++;
                    }
                    if (c.getText().equals("Tea")) {
                        total += 50;
                        menu_ctr++;
                    }
                    if (c.getText().equals("Sundae")) {
                        total += 40;
                        menu_ctr++;
                    }
                }
            }
            if (menu_ctr == 0) {
                throw (new NoSelectedFood());
            }
            int discounts_ctr = 0;
            for (JRadioButton r : discounts) {
                if (r.isSelected()) {
                    if (r.getText().equals("None")) {
                        JOptionPane.showMessageDialog(pnlFoodOrdering, "The total price is Php " + String.format("%.2f", total));
                        discounts_ctr++;
                    }
                    if (r.getText().equals("5% Off")) {
                        JOptionPane.showMessageDialog(pnlFoodOrdering, "The total price is Php " + String.format("%.2f", total * .95));
                        discounts_ctr++;
                    }
                    if (r.getText().equals("10% Off")) {
                        JOptionPane.showMessageDialog(pnlFoodOrdering, "The total price is Php " + String.format("%.2f", total * .90));
                        discounts_ctr++;
                    }
                    if (r.getText().equals("15% Off")) {
                        JOptionPane.showMessageDialog(pnlFoodOrdering, "The total price is Php " + String.format("%.2f", total * .85));
                        discounts_ctr++;
                    }
                }
            }
            if (discounts_ctr == 0) {
                throw (new NoSelectedDiscount());
            }
        } catch (NoSelectedFood | NoSelectedDiscount e) {
            JOptionPane.showMessageDialog(pnlFoodOrdering, e.toString());
        }
    }
}
