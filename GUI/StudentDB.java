import java.sql.*;

public class StudentDB {

    public static void main(String[] args) {

        String url = "jdbc:mysql://localhost:3306/College";
        String user = "root";      // change if needed
        String password = "";      // change if needed

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(url, user, password);

            String insertQuery = "INSERT INTO tbl_students VALUES (?, ?, ?, ?)";
            PreparedStatement pst = con.prepareStatement(insertQuery);

            Object[][] students = {
                {1, "Ram", "1st", "BCA"},
                {2, "Sita", "2nd", "BBA"},
                {3, "Hari", "3rd", "BSc"},
                {4, "Gita", "4th", "BIT"}
            };

            for (Object[] s : students) {
                pst.setInt(1, (int) s[0]);
                pst.setString(2, (String) s[1]);
                pst.setString(3, (String) s[2]);
                pst.setString(4, (String) s[3]);
                pst.executeUpdate();
            }

            System.out.println("Student records inserted successfully!\n");

            String selectQuery = "SELECT * FROM tbl_students";
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery(selectQuery);

            System.out.println("Student Records:");
            System.out.println("SID\tName\tSemester\tProgram");

            while (rs.next()) {
                System.out.println(
                    rs.getInt("sid") + "\t" +
                    rs.getString("name") + "\t" +
                    rs.getString("semester") + "\t" +
                    rs.getString("program")
                );
            }

            con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}{

}