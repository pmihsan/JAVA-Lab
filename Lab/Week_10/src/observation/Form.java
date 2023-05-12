package observation;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Form implements ActionListener {

	Form(){
        JFrame jf = new JFrame();

        // Form fields
        JLabel name = new JLabel("Name");
        name.setBounds(20, 50, 80, 20);

        JLabel passwd = new JLabel("Password");
        passwd.setBounds(20, 80, 80, 20);

        JTextField nameField = new JTextField();
        nameField.setBounds(120, 50, 100, 20);

        JPasswordField passwdField = new JPasswordField();
        passwdField.setBounds(120, 80, 100, 20);

        JButton submit = new JButton("SUBMIT");
        submit.setBounds(20, 160, 100, 30);
        submit.addActionListener(this);

        JButton reset = new JButton("RESET");
        reset.setBounds(140, 160, 100, 30);
        reset.addActionListener(this);

        // Add the fields to the frame
        jf.add(name);
        jf.add(nameField);

        jf.add(passwd);
        jf.add(passwdField);

        jf.add(submit);
        jf.add(reset);

        // Frame Configuration
        jf.setTitle("User Form");
        jf.setSize(300, 300);
        jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jf.setLayout(null);
        jf.setVisible(true);
        jf.setResizable(false);
    }

    public void actionPerformed(ActionEvent e) {
//        if(e.getSource() == submit)
    }

    public static void main(String[] args) {
        Form f = new Form();
    }
}
