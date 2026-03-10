public class PalindromeCheckerApp {
    public static void main(String[] args) {

        // Original string
        String input = "madam";

        // Variable to store reversed string
        String reversed = "";

        // Reverse the string using loop
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed = reversed + input.charAt(i);
        }

        // Display input
        System.out.println("Input text: " + input);

        // Compare original and reversed
        if (input.equals(reversed)) {
            System.out.println("Is it a Palindrome? : true");
        } else {
            System.out.println("Is it a Palindrome? : false");
        }
    }
}
