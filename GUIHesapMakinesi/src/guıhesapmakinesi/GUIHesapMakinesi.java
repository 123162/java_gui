package guıhesapmakinesi;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class GUIHesapMakinesi {

    public static void main(String[] args) {
        JFrame frame = new JFrame("hesap makinesi");
        
        JLabel l1, l2, l3;
        JTextField f1, f2, f3;
        JButton btn;

        l1 = new JLabel("1.sayı");
        l1.setBounds(50, 10, 100, 30);
        frame.add(l1);

        f1 = new JTextField();
        f1.setBounds(50, 40, 200, 30);
        frame.add(f1);

        l2 = new JLabel("2.sayı");
        l2.setBounds(50, 70, 100, 30);
        frame.add(l2);

        f2 = new JTextField();
        f2.setBounds(50, 100, 200, 30);
        frame.add(f2);

        l3 = new JLabel("toplam");
        l3.setBounds(50, 130, 100, 30);
        frame.add(l3);

        f3 = new JTextField();
        f3.setBounds(50, 160, 200, 30);
        f3.setEditable(false);
        frame.add(f3);

        btn = new JButton("sonuç");
        btn.setBounds(50, 220, 200, 30);
        frame.add(btn);
        
        btn.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
               int a=Integer.parseInt(f1.getText());
               int b=Integer.parseInt(f2.getText());
               int c=a+b;
               String sonuc=String.valueOf(c);
               f3.setText(sonuc);
               
            }
            
        });

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
