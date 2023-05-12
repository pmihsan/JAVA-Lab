package execution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Investment extends JFrame {
    Investment(){
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(5,3));
        setTitle("Investment Calculator");
        setSize(400,400);
        setVisible(true);

        JLabel amt, years, rate, resT;
        final JTextField amtF;
		final JTextField yearsF;
		final JTextField rateF;
		final JTextField resF;
        JButton cal;

        JPanel p1 = new JPanel(new FlowLayout());
        amt = new JLabel("Amount");
        amtF = new JTextField(10);
        p1.add(amt);
        p1.add(amtF);
        add(p1);

        JPanel p2 = new JPanel(new FlowLayout());
        years = new JLabel("Number of Years");
        yearsF = new JTextField(10);
        p2.add(years);
        p2.add(yearsF);
        add(p2);

        JPanel p3 = new JPanel(new FlowLayout());
        rate = new JLabel("Rate of Interest");
        rateF = new JTextField(10);
        p3.add(rate);
        p3.add(rateF);
        add(p3);

        JPanel p4 = new JPanel(new FlowLayout());
        cal = new JButton("Calculate");
        p4.add(cal);
        add(p4);

        JPanel p5 = new JPanel(new FlowLayout());
        resT = new JLabel("RESULT");
        resF = new JTextField(10);
        p5.add(resT);
        p5.add(resF);
        add(p5);
        pack();
        cal.addActionListener(new ActionListener() {
         
            public void actionPerformed(ActionEvent e) {
                double a = Double.parseDouble(amtF.getText());
                int y = Integer.parseInt(yearsF.getText());
                double r = Double.parseDouble(rateF.getText());
                double res = (a * (1 + r) * y * 12);
                double res2 = a * (r / 100) * y;
                res2 += a;
                resF.setText(res2+"");
            }
        });

    }

    public static void main(String[] args) {
        Investment i = new Investment();
    }
}
