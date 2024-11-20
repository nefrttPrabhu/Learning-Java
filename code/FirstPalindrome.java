import java.util.Scanner;

public class FirstPalindrome {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        String palindrome = findFirstPalindrome(input);

        if (palindrome != null) {
            System.out.println("First palindrome found: " + palindrome);
        } else {
            System.out.println("No palindrome found in the input string.");
        }

        scanner.close();
    }

    public static String findFirstPalindrome(String input) {
        for (int i = 0; i < input.length(); i++) {
            for (int j = i + 1; j <= input.length(); j++) {
                String substring = input.substring(i, j);
                if (isPalindrome(substring)) {
                    return substring;
                }
            }
        }
        return null;
    }

    public static boolean isPalindrome(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
