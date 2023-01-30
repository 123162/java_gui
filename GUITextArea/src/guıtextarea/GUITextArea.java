package guıtextarea;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.WindowConstants;

public class GUITextArea {

    public static void main(String[] args) {
        JFrame frame = new JFrame("text area örneği");

        JLabel l1, l2;
        JTextArea area;
        JButton btn;

        l1 = new JLabel();
        l1.setBounds(50, 25, 100, 30);
        frame.add(l1);

        l2 = new JLabel();
        l2.setBounds(160, 25, 100, 30);
        frame.add(l2);

        area = new JTextArea();
        area.setBounds(20, 75, 250, 200);
        frame.add(area);

        btn = new JButton("hesapla");
        btn.setBounds(100, 300, 120, 30);
        frame.add(btn);

        btn.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String text=area.getText();
                String word[]=text.split("\\s");
                l1.setText("kelime: "+word.length);
                l2.setText("karakter: "+text.length());
            }

        });

        frame.setSize(500, 500);
        frame.setLayout(null);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);

    }

}
