package guıders2;

import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.WindowConstants;

public class GuıDers2 {

    public static void main(String[] args) {
        JFrame frame = new JFrame("bu bir çerçevedir.");
        frame.setSize(500, 500);
        frame.setBackground(Color.yellow);

        JLabel lblOrnek = new JLabel(" bu bir labeldir");
        JLabel lblOrnek2 = new JLabel();
        lblOrnek2.setText("hello");

        frame.add(lblOrnek);
        lblOrnek.setBounds(0, 0, 200, 30);
        lblOrnek.setForeground(Color.red);
        
        frame.add(lblOrnek2);
        
        JLabel lblOrnek3=new JLabel(new ImageIcon("alert-icon.png"));
        lblOrnek3.setBounds(10,10,10,30);
        frame.add(lblOrnek3);
        
        JLabel lblOrnek4=new JLabel("image resmi",new ImageIcon("alert-icon.png"),SwingConstants.LEFT);
        lblOrnek3.setBounds(10,20,10,30);
        frame.add(lblOrnek4);
        
        
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);//pencereyi kapattığımızda run da dursun diye

    }

}
