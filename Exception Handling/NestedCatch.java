public class NestedCatch {
    public static void main(String[] args) {
        try {
            // Example code that can cause multiple exceptions
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing array element...");
            
            int result = numbers[5] / 0; // This will cause an ArrayIndexOutOfBoundsException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            // Catch block for ArithmeticException
            System.out.println("ArithmeticException caught: Cannot divide by zero. " + e.getMessage());
        } catch (ArrayIndexOutOfBoundsException e) {
            // Catch block for ArrayIndexOutOfBoundsException
            System.out.println("ArrayIndexOutOfBoundsException caught: Invalid array index. " + e.getMessage());
        } catch (Exception e) {
            // Generic catch block for other exceptions
            System.out.println("General exception caught: " + e.getMessage());
        }

        System.out.println("Program continues after try-catch blocks.");
    }
}
