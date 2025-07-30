import java.util.Scanner;

public class SimpleVowelCheck {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  // Create Scanner object to read input

        System.out.print("Enter a character: ");
        char ch = sc.next().charAt(0);  // Read first character of user input. sc.next() reads a string (e.g. "b"), .charAt(0) picks the first character.

        // Check if the character is a vowel (either lowercase or uppercase)
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
            ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            
            System.out.println(ch + " is a Vowel");  // It's a vowel
        } else {
            System.out.println(ch + " is a Consonant");  // Otherwise, it's a consonant
        }

        sc.close();  // Close the Scanner
    }
}
