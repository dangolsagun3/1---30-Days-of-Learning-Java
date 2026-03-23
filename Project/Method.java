class Method {

    // Method that returns an integer value
    int addNumbers(int a, int b) {
        int sum = a + b;
        return sum;  // returning value
    }

    public static void main(String[] args) {
        Method obj = new Method();

        int result = obj.addNumbers(5, 10); // calling method

        System.out.println("Sum is: " + result);
    }
}