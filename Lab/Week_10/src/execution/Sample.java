package execution;

import javax.swing.*;

public class Sample {
	
	private JFrame jf = new JFrame();
	private JPanel jp = new JPanel();
	private JWindow jw = new JWindow();
	private JButton jb = new JButton("Button 1");
	
	Sample(){
		jb.setBounds(10, 20, 50, 60);
		
		jf.add(jb);
		
		jf.setTitle("Sample Frame");
		jf.setSize(400, 400);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		Sample s = new Sample();
	}

}
