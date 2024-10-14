public class InvertedRightTriangle {
    public static void main(String[] args) {
        int rows = 5; // You can change this value to adjust the size of the triangle
        
        System.out.println("Inverted Right Triangle:");
        printInvertedRightTriangle(rows);
        
        System.out.println("\nRight Triangle:");
        printRightTriangle(rows);
    }

    public static void printInvertedRightTriangle(int rows) {
        for (int i = rows; i >= 1; i--) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void printRightTriangle(int rows) {
        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
