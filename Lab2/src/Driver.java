import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input text:");
        String userInput = scanner.nextLine();

        Counter wordProcessor = new WordProcessor();  // Data type is 'Counter' now

        // Call the methods and display results
        System.out.println("Number of words: " + wordProcessor.countWords(userInput));
        System.out.println("Number of letters: " + wordProcessor.countLetters(userInput));
        System.out.println("Length of the sentence: " + wordProcessor.getLength(userInput));

        // Close the scanner
        scanner.close();
    }
}

