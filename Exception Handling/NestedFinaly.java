public class NestedFinaly {

    public static void main(String[] args) {
        try {
            try {
                int result = 10 / 0;
                System.out.println("Result: " + result);
            } finally {
                System.out.println("Inner finally block executed.");
            }

            int[] numbers = {1, 2, 3};
            System.out.println(numbers[5]);
        } finally {
            System.out.println("Outer finally block executed.");
        }

        System.out.println("Program continues...");
    }
}
