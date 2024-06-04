public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        // (a) Multiple catch blocks
        try {
            int result = divide(10, 0);
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e.getMessage());
        } catch (Exception e) {
            System.out.println("General Exception: " + e.getMessage());
        }

        // (b) try-catch-finally combination
        try {
            int[] arr = new int[5];
            System.out.println("Accessing out of bounds element: " + arr[10]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Finally block executed.");
        }

        // (c) try-finally combination
        int result;
        try {
            result = divide(15, 3);
        } finally {
            System.out.println("Finally block executed in try-finally combination.");
        }

        // (d) Nested try blocks
        try {
            System.out.println("Outer try block");
            try {
                System.out.println("Nested try block");
                throw new RuntimeException("Nested exception");
            } catch (RuntimeException e) {
                System.out.println("Caught nested exception: " + e.getMessage());
                throw e; // Re-throwing the exception
            }
        } catch (Exception e) {
            System.out.println("Caught re-thrown exception: " + e.getMessage());
        }

        // Demonstrating throws keyword
        try {
            performOperation();
        } catch (CustomException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    private static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Division by zero");
        }
        return a / b;
    }

    private static void performOperation() throws CustomException {
        throw new CustomException("Custom exception occurred");
    }
}

class CustomException extends Exception {
    public CustomException(String message) {
        super(message);
    }
}
