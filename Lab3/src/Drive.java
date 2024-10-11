

import java.util.Random;

/**
 * This class demonstrates the use of the Stats class to store random values and calculate
 * statistics such as maximum, minimum, total, average, and count.
 */

    public class Drive {

    /**
     * The main method of the Driver class, which initializes a Stats object, adds random values,
     * and prints out various statistical information.
     **/
        public static void main(String[] args) {
            final int VALUES = 10;

            Stats stats = new Stats(VALUES);

            Random random = new Random();

            for (int i = 0; i < VALUES; i++) {

                stats.addValue(random.nextInt(100));
            }

            System.out.println("Numbers stored : ");
            System.out.println(stats);

            System.out.println("Average = " + stats.getAverage());
            System.out.println("Count = " + stats.getCount());
            System.out.println("Total = " + stats.getTotalSum());
            System.out.println("Minimum value = " + stats.getMaxValue());
            System.out.println("Maximum value = " + stats.getMinValue());
        }
    }
