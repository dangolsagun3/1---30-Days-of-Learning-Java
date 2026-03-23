import java.awt.event.*;
import javax.swing.*;

public class simpleform {
    public static void main(String args[]) {

        JFrame f = new JFrame("Simple Form");

        JLabel l1 = new JLabel("Enter Name:");
        l1.setBounds(50, 50, 80, 30);

        JTextField t1 = new JTextField();
        t1.setBounds(150, 50, 150, 30);

        JButton b1 = new JButton("Submit");
        b1.setBounds(150, 100, 80, 30);

        JLabel l2 = new JLabel();
        l2.setBounds(50, 150, 200, 30);
        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String name = t1.getText();
                l2.setText("Hello, " + name);
            }
        });
        f.add(l1);
        f.add(t1);
        f.add(b1);
        f.add(l2);

        f.setSize(400, 300);
        f.setLayout(null);
        f.setVisible(true);
    }
}