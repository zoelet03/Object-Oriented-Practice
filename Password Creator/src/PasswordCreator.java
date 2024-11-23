import java.util.Random;
import java.util.Scanner;

public class PasswordCreator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        // Character pools
        String lowerCase = "abcdefghijklmnopqrstuvwxyz";
        String upperCase = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String numbers = "0123456789";
        String symbols = "!@#$%^&*()-_=+[]{}|;:',.<>?/";

        // Prompt user for password preferences
        System.out.println("Welcome to the Password Generator!");
        System.out.print("Enter the desired password length: ");
        int length = scanner.nextInt();

        System.out.print("Include uppercase letters? (y/n): ");
        boolean includeUpperCase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include lowercase letters? (y/n): ");
        boolean includeLowerCase = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include numbers? (y/n): ");
        boolean includeNumbers = scanner.next().equalsIgnoreCase("y");

        System.out.print("Include symbols? (y/n): ");
        boolean includeSymbols = scanner.next().equalsIgnoreCase("y");

        // Validate at least one character set is chosen
        if (!includeUpperCase && !includeLowerCase && !includeNumbers && !includeSymbols) {
            System.out.println("You must select at least one character type!");
            return;
        }

        // Build the character pool
        String characterPool = "";
        if (includeUpperCase) {
            characterPool += upperCase;
        }
        if (includeLowerCase) {
            characterPool += lowerCase;
        }
        if (includeNumbers) {
            characterPool += numbers;
        }
        if (includeSymbols) {
            characterPool += symbols;
        }

        // Generate the password
        StringBuilder password = new StringBuilder();
        for (int i = 0; i < length; i++) {
            int index = random.nextInt(characterPool.length());
            password.append(characterPool.charAt(index));
        }

        // Output the generated password
        System.out.println("Your generated password is: " + password);
    }
}
