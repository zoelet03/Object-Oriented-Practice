import java.util.Arrays;

/**
 * 
 *
 *
 *
 */
public class Stats {
    /** Array to hold integer values */
    private int[] numbers;

    /** Number of elements added to the array */
    private int count;

    /**
     * Constructor that initializes the array with a specified capacity.
     *
     * @param capacity the number of elements the array can hold
     */
    public Stats(int capacity) {
        numbers = new int[capacity];
        count = 0;
    }

    /**
     *
     * @param value the integer value to be added to the array
     */
    public void addValue(int value) {
        // Adds a new value to the array and increments the count
        numbers[count] = value;
        count++;
    }

    /**
     * Gets the number of elements currently stored in the array.
     *
     * @return the number of elements stored/
     */
    public int getCount() {
        return count;
    }

    /**
     * Finds and returns the maximum value in the array.
     *
     * @return the maximum value in the array
     */
    public int getMaxValue() {
        // Initialize max as the first element
        int max = numbers[0];

        // Iterate through the array to find the max value
        for (int i = 1; i < count; i++) {
            if (numbers[i] > max) {
                max = numbers[i];
            }
        }
        return max;
    }

    /**
     * Finds and returns the minimum value in the array.
     *
     * @return the minimum value in the array
     */
    public int getMinValue() {
        // Initialize min as the first element
        int min = numbers[0];

        // Iterate through the array to find the min value
        for (int i = 1; i < count; i++) {
            if (numbers[i] < min) {
                min = numbers[i];
            }
        }
        return min;
    }

    /**
     * Calculates and returns the sum of all values in the array.
     *
     * @return the sum of all values in the array
     */
    public int getTotalSum() {
        int total = 0;

        // Sum all values in the array
        for (int i = 0; i < count; i++) {
            total += numbers[i];
        }
        return total;
    }

    /**
     * Calculates and returns the average of the values in the array.
     *
     * @return the average of the values in the array as a double
     */
    public double getAverage() {
        int sum = 0;

        // Sum all values in the array
        for (int i = 0; i < count; i++) {
            sum += numbers[i];
        }

        // Calculate average by dividing sum by the number of elements
        return (double) sum / count;
    }

    /**
     * Returns a string representation of the array.
     *
     * @return the string representation of the array
     */
    @Override
    public String toString() {
        // Display the array as a string
        return Arrays.toString(Arrays.copyOf(numbers, count));
    }
}
