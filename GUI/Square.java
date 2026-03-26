// Write a java GUI program to calculate the square of the entered number. 
import java.awt.event.*;
import javax.swing.*;

public class Square extends JFrame implements ActionListener {  
    JTextField textField;  
    JButton button;  
    JLabel label;  
  
    Square() {  
        textField = new JTextField();  
        textField.setBounds(50, 50, 150, 20);  
  
        button = new JButton("Calculate Square");  
        button.setBounds(50, 100, 150, 30);  
        button.addActionListener(this);  
  
        label = new JLabel();  
        label.setBounds(50, 150, 200, 30);  
  
        add(textField);  
        add(button);  
        add(label);  
  
        setSize(300, 300);  
        setLayout(null);  
        setVisible(true);  
    }  
  
    public void actionPerformed(ActionEvent e) {  
        try {  
            double number = Double.parseDouble(textField.getText());  
            double square = number * number;  
            label.setText("Square: " + square);  
        } catch (NumberFormatException ex) {  
            label.setText("Please enter a valid number.");  
        }  
    }  
  
    public static void main(String[] args) {  
        new Square();  
    }  
}
