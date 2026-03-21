public class Student {
    String name;
    int age;
    
    public Student() {
        this.name = "Ram Bahadur Khatri";
        this.age = 35;
    }
    
    public void displayDetails() {
        System.out.println("Student Name: " + name);
        System.out.println("Student Age: " + age);
    }
    
    public static void main(String[] args) {
        Student student = new Student();
        
        student.displayDetails();
    }
}