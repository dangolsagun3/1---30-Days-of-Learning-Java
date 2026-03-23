public class Vehicle {
    void start() {
        System.out.println("Vehicle is starting...");
    }
}

// Car class inherits Vehicle class
class Car extends Vehicle {
    // overriding method
    void start() {
        System.out.println("    Car is starting with a key...");
    }
}


