public class School {
    private String schoolName;
    private String location;
    public School(String schoolName, String location) {
        this.schoolName = schoolName;
        this.location = location;
    }
    class Student {
        private String studentName;
        private int rollNumber;
        public Student(String studentName, int rollNumber) {
            this.studentName = studentName;
            this.rollNumber = rollNumber;
        }
        public void displayDetails() {
            System.out.println(" Student Details ");
            System.out.println("Student Name: " + studentName);
            System.out.println("Roll Number: " + rollNumber);
            System.out.println("School Name: " + schoolName);     
            System.out.println("School Location: " + location);   
        }
    }
    
    public static void main(String[] args) {
        School school = new School("North East School", "Hetauda");
        School.Student student = school.new Student("Rahul Sharma", 101);
        student.displayDetails();
        School.Student student2 = school.new Student("Priya Adhikari", 102);
        student2.displayDetails();
    }
}
