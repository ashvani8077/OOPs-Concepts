public class NestedTryCatch {
    public static void main(String[] args) {
        try {
            // Outer try block
            int[] numbers = {1, 2, 3};
            System.out.println("Outer try block: Attempting to access array element...");

            try {
                // Inner try block
                int result = numbers[2] / 0; // This will cause an ArithmeticException
                System.out.println("Inner try block: Division result is " + result);
            } catch (ArithmeticException e) {
                // Handling ArithmeticException in inner try block
                System.out.println("Inner catch block: Cannot divide by zero. " + e.getMessage());
            }

            // This may cause an ArrayIndexOutOfBoundsException
            int invalidAccess = numbers[5];
            System.out.println("Accessing array element: " + invalidAccess);
        } catch (ArrayIndexOutOfBoundsException e) {
            // Handling ArrayIndexOutOfBoundsException in outer try block
            System.out.println("Outer catch block: Array index out of bounds. " + e.getMessage());
        }

        System.out.println("Program continues after nested try-catch blocks.");
    }
}
