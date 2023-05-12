package spot;

import javax.swing.*;

import java.awt.*;

public class StudentForm extends JFrame{
	
	
	StudentForm(){
		this.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		
        // Form fields
        JLabel name = new JLabel("Name");
        JTextField nameField = new JTextField("Ihsan");
        panel.add(name);
        panel.add(nameField);
        
        JPanel panel1 = new JPanel();
		panel1.setLayout(new FlowLayout());
        JLabel dept = new JLabel("Department");
        JRadioButton r1 = new JRadioButton("CSE");
        JRadioButton r2 = new JRadioButton("IT");
        panel1.add(dept);
        panel1.add(r1);
        panel1.add(r2);
        
        JPanel panel2 = new JPanel();
		panel2.setLayout(new FlowLayout());
        JLabel gender = new JLabel("Gender");
        JRadioButton f1 = new JRadioButton("Male");
        JRadioButton f2 = new JRadioButton("Female");
        panel2.add(gender);
        panel2.add(f1);
        panel2.add(f2);
        
        JPanel panel3 = new JPanel();
		panel3.setLayout(new FlowLayout());
        JLabel area = new JLabel("Area of Interest");
        JCheckBox a1 = new JCheckBox("Development");
        JCheckBox a2 = new JCheckBox("Testing");
        panel3.add(area);
        panel3.add(a1);
        panel3.add(a2);
        
        JPanel panel4 = new JPanel();
		panel4.setLayout(new FlowLayout());
        JLabel hobbies = new JLabel("Hobbies");
        JCheckBox h1 = new JCheckBox("Books");
        JCheckBox h2 = new JCheckBox("Travelling");
        panel4.add(hobbies);
        panel4.add(h1);
        panel4.add(h2);
        
        JButton confirm = new JButton("CONFIRM");
        JButton submit = new JButton("SUBMIT");
        JButton reset = new JButton("EXIT");
        
        this.add(panel);
        this.add(panel1);
        this.add(panel2);
        this.add(panel3);
        this.add(panel4);

        this.add(confirm);
        this.add(submit);
        this.add(reset);

        // Frame Configuration
        this.setTitle("Student Form");
        this.setSize(300, 300);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        this.setVisible(true);
        this.setResizable(false);
	}
	public static void main(String[] args){
		StudentForm sf = new StudentForm();
	}
}
