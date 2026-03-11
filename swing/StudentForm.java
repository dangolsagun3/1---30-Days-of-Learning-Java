import java.awt.event.*;    
import java.sql.*;
import javax.swing.*;

    public class StudentForm {

        public static void main(String[] args) {
            JFrame f = new JFrame("Student Form");
            f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            f.setSize(400, 300);
            f.setLayout(null);

            JLabel l1 = new JLabel("Id:");
            l1.setBounds(50, 50, 100, 20);

            JLabel l2 = new JLabel("Name:");
            l2.setBounds(50, 80, 100, 20);

            JLabel l3 = new JLabel("Address:");
            l3.setBounds(50, 110, 100, 20);

            JTextField t1 = new JTextField();
            t1.setBounds(150, 50, 150, 20); 

            JTextField t2 = new JTextField();
            t2.setBounds(150, 80, 150, 20);

            JTextField t3 = new JTextField();
            t3.setBounds(150, 110, 150, 20);

            JButton b1 = new JButton("Save");
            b1.setBounds(100, 150, 100, 30);

            JButton b2 = new JButton("Clear");
            b2.setBounds(200, 150, 100, 30);

            f.add(l1);
            f.add(l2);
            f.add(l3);
            f.add(t1);  
            f.add(t2);
            f.add(t3);
            f.add(b1);
            f.add(b2);

            b1.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    String id = t1.getText();
                    String name = t2.getText();
                    String address = t3.getText();

                    try {
                        Class.forName("com.mysql.cj.jdbc.Driver");
                        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "");
                        String query = "INSERT INTO students (id, name, address) VALUES (?, ?, ?)";
                        PreparedStatement pstmt = con.prepareStatement(query);
                        pstmt.setString(1, id);
                        pstmt.setString(2, name);
                        pstmt.setString(3, address);
                        pstmt.executeUpdate();
                        JOptionPane.showMessageDialog(f, "Student saved successfully!");
                        con.close();
                    } catch (ClassNotFoundException | SQLException ex) {
                        JOptionPane.showMessageDialog(f, "Error: " + ex.getMessage());
                    }
                }
            });

            b2.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent e) {
                    t1.setText("");
                    t2.setText("");
                    t3.setText("");
                }
            });

            f.setVisible(true);
        }
    }