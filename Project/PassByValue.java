public class PassByValue {

    // Method with parameters
    void changeValue(int num) {
        num = num + 10;  // modifying value
        System.out.println("Inside method, value is: " + num);
    }

    public static void main(String[] args) {
        PassByValue obj = new PassByValue();

        int number = 5;
        System.out.println("Before method call, value is: " + number);

        obj.changeValue(number);  // passing value

        System.out.println("After method call, value is: " + number);
    }
}
