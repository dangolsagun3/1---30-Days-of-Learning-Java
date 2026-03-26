import javax.swing.*;
import java.awt.event.*;

public class FactorialCube extends JFrame {

    JLabel inputLabel, resultLabel;
    JTextField textField;
    JButton resultButton;

    public FactorialCube() {
        setTitle("Factorial & Cube Calculator");
        setSize(350, 200);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Input Label
        inputLabel = new JLabel("Enter a number:");
        inputLabel.setBounds(20, 20, 120, 25);
        add(inputLabel);

        // Text Field
        textField = new JTextField();
        textField.setBounds(150, 20, 150, 25);
        add(textField);

        // Button
        resultButton = new JButton("Result");
        resultButton.setBounds(100, 60, 120, 30);
        add(resultButton);

        // Result Label
        resultLabel = new JLabel("");
        resultLabel.setBounds(20, 110, 300, 25);
        add(resultLabel);

        // Mouse Listener
        resultButton.addMouseListener(new MouseAdapter() {

            // When mouse is pressed → Factorial
            public void mousePressed(MouseEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    long fact = 1;

                    if (num < 0) {
                        resultLabel.setText("Factorial not defined for negative numbers!");
                        return;
                    }

                    for (int i = 1; i <= num; i++) {
                        fact *= i;
                    }

                    resultLabel.setText("Factorial: " + fact);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }

            // When mouse is released → Cube
            public void mouseReleased(MouseEvent e) {
                try {
                    int num = Integer.parseInt(textField.getText());
                    int cube = num * num * num;
                    resultLabel.setText("Cube: " + cube);
                } catch (NumberFormatException ex) {
                    resultLabel.setText("Invalid input!");
                }
            }
        });
    }

    public static void main(String[] args) {
        FactorialCube app = new FactorialCube();
        app.setVisible(true);
    }
}