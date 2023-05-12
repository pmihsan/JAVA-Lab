package execution;

import javax.swing.*;
import java.awt.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingPanel extends JFrame {

    SwingPanel(){
        setTitle("Toggle");
        setVisible(true);
        setSize(300, 300);
        setLayout(new FlowLayout());
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final JPanel jp = new JPanel(new FlowLayout());
        JButton t = new JButton("toggle");
        jp.add(t, BorderLayout.CENTER);
        jp.setSize(70,70);
        jp.setBackground(Color.DARK_GRAY);
        add(jp);
        t.addMouseListener(new MouseListener() {
            
            public void mouseClicked(MouseEvent e) {
                jp.setBackground(Color.WHITE);
            }

            
            public void mousePressed(MouseEvent e) {
                jp.setBackground(Color.BLACK);
            }

            
            public void mouseReleased(MouseEvent e) {
//                jp.setBackground(Color.CYAN);
            }

            
            public void mouseEntered(MouseEvent e) {
                jp.setBackground(Color.YELLOW);
            }

            
            public void mouseExited(MouseEvent e) {
//                jp.setBackground(Color.GREEN);
            }
        });
    }

    public static void main(String[] args) {
        SwingPanel sp = new SwingPanel();
    }
}
