public class Person2 {
    String name;
    int age;

    void setPersonDetails(String n, int a) {
        name = n;
        age = a;
    }

    void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}

class Employee extends Person {
    int empId;
    double salary;

    void setEmployeeDetails(int id, double sal) {
        empId = id;
        salary = sal;
    }

    void displayEmployee() {
        System.out.println("Employee ID: " + empId);
        System.out.println("Salary: " + salary);
    }
}

class Manager extends Employee {
    String department;

    void setManagerDetails(String dept) {
        department = dept;
    }

    void displayManager() {
        System.out.println("Department: " + department);
    }
}

public class Main {
    public static void main(String[] args) {
        Manager m = new Manager();

        // setting values
        m.setPersonDetails("Sagun", 22);
        m.setEmployeeDetails(101, 50000);
        m.setManagerDetails("IT");

        // displaying all details
        m.displayPerson();
        m.displayEmployee();
        m.displayManager();
    }
}