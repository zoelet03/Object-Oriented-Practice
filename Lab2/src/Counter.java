/**
 * Provides methods to count words, letters, and get the length of a given sentence.
 */
public interface Counter {

    /**
     * Counts the number of words in a given sentence.
     */
    int countWords(String sentence);

    /**
     * Counts the number of letters (alphabetic characters) in a given sentence.
     *
     */
    int countLetters(String sentence);

    /**
     * Returns the total length of the sentence, including spaces and punctuation.
     *

     */
    int getLength(String sentence);
}

