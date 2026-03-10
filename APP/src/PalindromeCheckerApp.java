public class PalindromeCheckerApp {
    public static boolean reverseMethod(String input) {
        String reversed = "";

        for (int i = input.length() - 1; i >= 0; i--) {
            reversed += input.charAt(i);
        }

        return input.equals(reversed);
    }

    // Method 2: Two Pointer
    public static boolean twoPointerMethod(String input) {

        int start = 0;
        int end = input.length() - 1;

        while (start < end) {

            if (input.charAt(start) != input.charAt(end)) {
                return false;
            }

            start++;
            end--;
        }

        return true;
    }

    // Method 3: Stack
    public static boolean stackMethod(String input) {

        Stack<Character> stack = new Stack<>();

        for (char c : input.toCharArray()) {
            stack.push(c);
        }

        for (char c : input.toCharArray()) {
            if (c != stack.pop()) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {

        String input = "madam";

        // Reverse Method
        long start1 = System.nanoTime();
        boolean r1 = reverseMethod(input);
        long end1 = System.nanoTime();

        // Two Pointer Method
        long start2 = System.nanoTime();
        boolean r2 = twoPointerMethod(input);
        long end2 = System.nanoTime();

        // Stack Method
        long start3 = System.nanoTime();
        boolean r3 = stackMethod(input);
        long end3 = System.nanoTime();

        System.out.println("Input text: " + input);

        System.out.println("\nReverse Method Result: " + r1);
        System.out.println("Execution Time: " + (end1 - start1) + " ns");

        System.out.println("\nTwo Pointer Method Result: " + r2);
        System.out.println("Execution Time: " + (end2 - start2) + " ns");

        System.out.println("\nStack Method Result: " + r3);
        System.out.println("Execution Time: " + (end3 - start3) + " ns");
    }
}
}
