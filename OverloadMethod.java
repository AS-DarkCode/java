public class OverloadMethod {
    // Method to add two integers
    public static int add(int a, int b) {
        return a + b;
    }

    // Method to add two floating-point numbers
    public static double add(double a, double b) {
        return a + b;
    }

    // Method to add three integers
    public static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        // Test the overloaded methods
        System.out.println("Adding two integers: " + add(5, 10));
        System.out.println("Adding two floating-point numbers: " + add(3.5, 2.7));
        System.out.println("Adding three integers: " + add(2, 4, 6));
    }
}