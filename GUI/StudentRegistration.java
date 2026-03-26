import javax.swing.*;
import java.awt.event.*;

public class StudentRegistration extends JFrame implements ActionListener {

    JLabel nameLabel, addressLabel, genderLabel, cityLabel, phoneLabel, emailLabel, resultLabel;
    JTextField nameField, phoneField, emailField;
    JTextArea addressArea;
    JRadioButton male, female;
    ButtonGroup genderGroup;
    JList<String> cityList;
    JButton submitButton;

    public StudentRegistration() {

        setTitle("Student Registration Form");
        setSize(400, 450);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Name
        nameLabel = new JLabel("Name:");
        nameLabel.setBounds(20, 20, 100, 25);
        add(nameLabel);

        nameField = new JTextField();
        nameField.setBounds(130, 20, 200, 25);
        add(nameField);

        // Address
        addressLabel = new JLabel("Address:");
        addressLabel.setBounds(20, 60, 100, 25);
        add(addressLabel);

        addressArea = new JTextArea();
        addressArea.setBounds(130, 60, 200, 60);
        add(addressArea);

        // Gender
        genderLabel = new JLabel("Gender:");
        genderLabel.setBounds(20, 140, 100, 25);
        add(genderLabel);

        male = new JRadioButton("Male");
        female = new JRadioButton("Female");

        male.setBounds(130, 140, 80, 25);
        female.setBounds(210, 140, 80, 25);

        genderGroup = new ButtonGroup();
        genderGroup.add(male);
        genderGroup.add(female);

        add(male);
        add(female);

        // City (Listbox)
        cityLabel = new JLabel("City:");
        cityLabel.setBounds(20, 180, 100, 25);
        add(cityLabel);

        String cities[] = {"Kathmandu", "Pokhara", "Lalitpur", "Bhaktapur", "Chitwan"};
        cityList = new JList<>(cities);
        cityList.setBounds(130, 180, 200, 60);
        add(cityList);

        // Phone
        phoneLabel = new JLabel("Phone:");
        phoneLabel.setBounds(20, 260, 100, 25);
        add(phoneLabel);

        phoneField = new JTextField();
        phoneField.setBounds(130, 260, 200, 25);
        add(phoneField);

        // Email
        emailLabel = new JLabel("Email:");
        emailLabel.setBounds(20, 300, 100, 25);
        add(emailLabel);

        emailField = new JTextField();
        emailField.setBounds(130, 300, 200, 25);
        add(emailField);

        // Button
        submitButton = new JButton("Submit");
        submitButton.setBounds(140, 340, 100, 30);
        add(submitButton);

        // Result Label
        resultLabel = new JLabel("");
        resultLabel.setBounds(20, 380, 350, 25);
        add(resultLabel);

        submitButton.addActionListener(this);
    }

    public void actionPerformed(ActionEvent e) {

        String name = nameField.getText();
        String address = addressArea.getText();
        String phone = phoneField.getText();
        String email = emailField.getText();

        String gender = "";
        if (male.isSelected()) gender = "Male";
        else if (female.isSelected()) gender = "Female";

        String city = cityList.getSelectedValue();

        resultLabel.setText("Registered: " + name + ", " + gender + ", " + city);
    }

    public static void main(String[] args) {
        StudentRegistration form = new StudentRegistration();
        form.setVisible(true);
    }
}