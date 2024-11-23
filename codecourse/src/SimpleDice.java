import java.util.Random;
public class SimpleDice {

    public static void main(String[] args) {
        int min = 1;
        int max = 6;

        Random coolNumber = new Random();
        int x = coolNumber.nextInt((max - min) + 1) + min;

        System.out.println("You rolled a:" + x);
    }

}
