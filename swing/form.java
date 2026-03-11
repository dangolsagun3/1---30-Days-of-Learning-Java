// WAP to create frame and add a button to it
import javax.swing.*;

class form {
    public static void main(String[] args) {
        JFrame f = new JFrame("My Form");
        JButton b = new JButton("Submit.");
        b.setBounds(50, 100, 95, 30);
        f.add(b);
        f.setSize(400, 400);
        f.setLayout(null);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setLocationRelativeTo(null);
        f.setVisible(true);
    }
}