//we need to import the Random class
import java.util.Random;
public class randomNumbers {
    public static void main(String[] args){

        Random random = new Random();

        int number1;
        int number2;
        int number3;
        double number4;
        boolean isHeads;

        number1 = random.nextInt();// generates a very large number between 1 and 2 billion
        number2 = random.nextInt(1, 6);
        number3 = random.nextInt(1, 7);
        number4 = random.nextDouble(); // generates a number between 0 and 1
        isHeads = random.nextBoolean();

        System.out.println(number1);
        System.out.println(number2);
        System.out.println(number3);
        System.out.println(number4);
        System.out.println(isHeads); // random if its head or tail

    }
}
