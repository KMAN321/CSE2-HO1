public class h7 {
    public static void main(String[] args) {
        try {
            int[] numbers = {1, 2, 3};
            System.out.println("Accessing element at index 5: " + numbers[5]); // Will throw ArrayIndexOutOfBoundsException
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Exception caught: Array index out of bounds!");
            System.out.println("Error message: " + e.getMessage());
        } finally {
            System.out.println("This block always executes, regardless of exceptions.");
        }

        // Other try-catch blocks for different exceptions
        try {
            int result = 10 / 0; // Will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Exception caught: Division by zero!");
        }

        System.out.println("Program continues after handling exceptions.");
    }
}
