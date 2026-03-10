public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Hardcoded input string
        String input = "madam";

        // Create Deque
        Deque<Character> deque = new ArrayDeque<>();

        // Insert characters into deque
        for (int i = 0; i < input.length(); i++) {
            deque.addLast(input.charAt(i));
        }

        boolean isPalindrome = true;

        // Compare front and rear characters
        while (deque.size() > 1) {

            char front = deque.removeFirst();
            char rear = deque.removeLast();

            if (front != rear) {
                isPalindrome = false;
                break;
            }
        }

        // Print input
        System.out.println("Input text: " + input);

        // Print result
        if (isPalindrome) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }
    }
}
