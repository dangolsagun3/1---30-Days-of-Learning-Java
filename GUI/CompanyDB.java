import java.sql.*;

public class CompanyDB {

    public static void main(String[] args) {

        // Database credentials
        String url = "jdbc:mysql://localhost:3306/Company";
        String user = "root";        // change if needed
        String password = "";        // change if needed

        try {
            // Load driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish connection
            Connection con = DriverManager.getConnection(url, user, password);

            // Insert records
            String insertQuery = "INSERT INTO Employee VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);

            // Employee data
            Object[][] employees = {
                {1, "Ram", 50000, "Sales"},
                {2, "Sita", 60000, "HR"},
                {3, "Hari", 55000, "Sales"},
                {4, "Gita", 70000, "IT"},
                {5, "Shyam", 52000, "Sales"}
            };

            for (Object[] emp : employees) {
                pst.setInt(1, (int) emp[0]);
                pst.setString(2, (String) emp[1]);
                pst.setDouble(3, (double) emp[2]);
                pst.setString(4, (String) emp[3]);
                pst.executeUpdate();
            }

            System.out.println("Records inserted successfully!\n");

            // Display Sales employees
            String selectQuery = "SELECT * FROM Employee WHERE Department = 'Sales'";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("Employees in Sales Department:");
            System.out.println("EID\tName\tSalary\tDepartment");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("EID") + "\t" +
                    rs.getString("Ename") + "\t" +
                    rs.getDouble("Salary") + "\t" +
                    rs.getString("Department")
                );
            }

            // Close connection
            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}