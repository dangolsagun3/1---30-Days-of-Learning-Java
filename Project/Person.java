public class Person {
    private String name;
    private int age;
    
    public Person(String name, int age) {
        this.name = name;  
        this.age = age;    
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
    
    public static void main(String[] args) {
        Person person = new Person("Shree Krishna Poudel", 45);
        
        person.displayInfo();
    }
}