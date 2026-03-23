public class connect {
    public static void main(String[] args) {
            Class.forName("com.mysql.cj.jdbc.Driver");
            String url = "jdbc:mysql://localhost:3306/StudentDB";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/StudentDB", "root", "");
            System.out.println("Database Connected successful!");
    }       
    
}
