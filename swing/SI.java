// make from to calculate simple interest
import javax.swing.*;                       
import java.awt.event.*;    

public class SI {
    public static void main(String[] args) {
        JFrame f = new JFrame("Simple Interest Calculator");
        JLabel l1 = new JLabel("Principal:");
        JTextField t1 = new JTextField();
        JLabel l2 = new JLabel("Rate of Interest:");
        JTextField t2 = new JTextField();
        JLabel l3 = new JLabel("Time (years):");
        JTextField t3 = new JTextField();
        JButton b1 = new JButton("Calculate SI");
        JLabel l4 = new JLabel("Result:");

        l1.setBounds(50, 50, 100, 20);
        t1.setBounds(200, 50, 100, 20);
        l2.setBounds(50, 100, 120, 20);
        t2.setBounds(200, 100, 100, 20);
        l3.setBounds(50, 150, 120, 20);
        t3.setBounds(200, 150, 100, 20);
        b1.setBounds(50, 200, 150, 30);
        l4.setBounds(50, 250, 300, 20);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    double principal = Double.parseDouble(t1.getText());
                    double rate = Double.parseDouble(t2.getText());
                    double time = Double.parseDouble(t3.getText());
                    double si = (principal * rate * time) / 100;
                    l4.setText("Result: " + si);
                } catch (NumberFormatException ex) {
                    l4.setText("Please enter valid numbers.");
                }
            }
        });

        f.add(l1);
        f.add(t1);
        f.add(l2);
        f.add(t2);
        f.add(l3);
        f.add(t3);
        f.add(b1);
        f.add(l4);

        f.setSize(400, 350);
        f.setLayout(null);
        f.setVisible(true);
    }
}
