// public class MultipleCatchBlock {
//     public static void main(String[] args) {
//         try {
//             int a = 10, b = 0, c;
//             c = a / b; // ArithmeticException (division by zero)
//             System.out.println(c);

//             int arr[] = {10, 20, 30};
//             System.out.println(arr[4]); // ArrayIndexOutOfBoundsException
//         } catch (ArithmeticException e) {
//             System.out.println("ArithmeticException occurred: " + e);
//         } catch (ArrayIndexOutOfBoundsException e) {
//             System.out.println("ArrayIndexOutOfBoundsException occurred: " + e);
//         } catch (Exception e) {
//             System.out.println("General exception occurred: " + e);
//         }
//     }
// }
