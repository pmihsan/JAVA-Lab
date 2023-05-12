package execution;

import javax.swing.*;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

public class SwingMouseEvents extends JFrame {
    SwingMouseEvents(){
        setTitle("Mouse Position");
        setVisible(true);
        setSize(400, 400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        final JLabel l = new JLabel("Click to see mouse pos");
        l.setHorizontalAlignment(JLabel.CENTER);
        add(l);

        l.addMouseListener(new MouseListener() {
            
            public void mouseClicked(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
                l.setText("Mouse Clicked at " + x + ", " + y);
            }

            
            public void mousePressed(MouseEvent e) {
                int x = e.getX();
                int y = e.getY();
//                l.setText("Mouse Pressed at " + x + ", " + y);
            }

            
            public void mouseReleased(MouseEvent e) {
                l.setText("Mouse Released");
            }

            
            public void mouseEntered(MouseEvent e) {

            }

            
            public void mouseExited(MouseEvent e) {

            }
        });
    }

    public static void main(String[] args) {
        SwingMouseEvents sme = new SwingMouseEvents();
    }
}
