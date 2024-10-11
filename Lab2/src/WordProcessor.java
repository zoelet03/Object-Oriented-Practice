/**
 * A class that implements the Counter interface.
 */
public class WordProcessor implements Counter {

    @Override
    public int countWords(String sentence) {
        // Split the sentence by spaces (or more whitespace characters) and count the parts
        if (sentence == null || sentence.isEmpty()) {
            return 0;
        }
        // Split by whitespace and count the words
        String[] words = sentence.trim().split("\\s+");
        return words.length;
    }

    @Override
    public int countLetters(String sentence) {
        int letters = 0;
        // Loop through the sentence and count alphabetic characters
        for (int i = 0; i < sentence.length(); i++) {
            if (Character.isLetter(sentence.charAt(i))) {
                letters++;
            }
        }
        return letters;
    }

    @Override
    public int getLength(String sentence) {
        // Return the length of the sentence including spaces
        return sentence.length();
    }
}


