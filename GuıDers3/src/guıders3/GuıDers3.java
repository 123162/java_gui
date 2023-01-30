package guıders3;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GuıDers3 {

    public static void main(String[] args) {

        JFrame frame = new JFrame("JLabel");
        frame.setSize(500, 500);
        JLabel lblName = new JLabel("Name:");
        JLabel lblPass = new JLabel("Password:");
        JLabel lblAddress = new JLabel("Address:");

        JTextField txtName = new JTextField(10); //karakter sÄ±nÄ±rÄ±
        lblName.setLabelFor(txtName);
        
        JPasswordField txtPass = new JPasswordField(10);
        lblPass.setLabelFor(txtPass);

        JTextArea txtAddress = new JTextArea(10,10);
        lblAddress.setLabelFor(txtAddress);

        JButton btn = new JButton("GÖNDER");
        btn.setBounds(100, 250, 100, 20);
        
        lblName.setBounds(100, 100, 50, 30);
        txtName.setBounds(200, 100, 100, 30);

        lblPass.setBounds(100, 150, 70, 30);
        txtPass.setBounds(200, 150, 70, 30);

        lblAddress.setBounds(100, 200, 50, 30);
        txtAddress.setBounds(200, 200, 50, 30);
        
        frame.add(btn);
        frame.add(lblName);
        frame.add(lblPass);
        frame.add(lblAddress);
        frame.add(txtName);
        frame.add(txtPass);
        frame.add(txtAddress);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
