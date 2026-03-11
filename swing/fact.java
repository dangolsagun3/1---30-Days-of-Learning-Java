// make a from to calculate the factorial of a number
import javax.swing.*;           
import java.awt.event.*;    

public class fact {
    public static void main(String[] args) {
        JFrame f = new JFrame("Factorial Calculator");
        JLabel l1 = new JLabel("Enter a number:");
        JTextField t1 = new JTextField();
        JButton b1 = new JButton("Calculate Factorial");
        JLabel l2 = new JLabel("Result:");

        l1.setBounds(50, 50, 150, 20);
        t1.setBounds(200, 50, 100, 20);
        b1.setBounds(50, 100, 200, 30);
        l2.setBounds(50, 150, 300, 20);

        b1.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                try {
                    int num = Integer.parseInt(t1.getText());
                    int fact = 1;
                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }
                    l2.setText("Result: " + fact);
                } catch (NumberFormatException ex) {
                    l2.setText("Please enter a valid integer.");
                }
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
