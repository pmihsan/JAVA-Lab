package execution;

import java.util.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.table.*;
 
public class SwingCalendar extends JFrame {
 
  DefaultTableModel model;
  Calendar cal = new GregorianCalendar();
  JLabel label;
 
  SwingCalendar() {
 
    this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    this.setTitle("Calandar");
    this.setResizable(false);
    this.setSize(400,300);
    this.setLayout(new BorderLayout());
    this.setVisible(true);
 
 
    label = new JLabel();
    label.setHorizontalAlignment(SwingConstants.CENTER);
 
    JButton b1 = new JButton("Prior");
    b1.setBounds(20, 160, 100, 30);
    b1.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        cal.add(Calendar.MONTH, -1);
        updateMonth();
      }
    });
 
    JButton b2 = new JButton("After");
    b2.setBounds(140, 160, 100, 30);
    b2.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent ae) {
        cal.add(Calendar.MONTH, +1);
        updateMonth();
      }
    });
 
    JPanel panel = new JPanel();
    panel.setLayout(new BorderLayout());
    panel.add(label,BorderLayout.CENTER);
    
    JPanel panel2 = new JPanel();
    panel2.setLayout(new BorderLayout());
    panel2.add(b2,BorderLayout.EAST);
    panel2.add(b1,BorderLayout.WEST);
 
 
    String [] columns = {"Sun","Mon","Tue","Wed","Thu","Fri","Sat"};
    model = new DefaultTableModel(null,columns);
    JTable table = new JTable(model);
    JScrollPane pane = new JScrollPane(table);
 
    this.add(panel,BorderLayout.NORTH);
    this.add(pane,BorderLayout.CENTER);
    this.add(panel2,BorderLayout.SOUTH);
    
    
//    getContentPane().add(panel2, BorderLayout.SOUTH);
 
    this.updateMonth();
 
  }
 
  void updateMonth() {
    cal.set(Calendar.DAY_OF_MONTH, 1);
 
    String month = cal.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.US);
    int year = cal.get(Calendar.YEAR);
    label.setText(month + " " + year);
 
    int startDay = cal.get(Calendar.DAY_OF_WEEK);
    int numberOfDays = cal.getActualMaximum(Calendar.DAY_OF_MONTH);
    int weeks = cal.getActualMaximum(Calendar.WEEK_OF_MONTH);
 
    model.setRowCount(0);
    model.setRowCount(weeks);
 
    int i = startDay-1;
    for(int day=1;day<=numberOfDays;day++){
      model.setValueAt(day, i/7 , i%7 );    
      i = i + 1;
    }
 
  }
 
  public static void main(String[] arguments) {
    JFrame.setDefaultLookAndFeelDecorated(false);
    SwingCalendar sc = new SwingCalendar();
  }
 
}
