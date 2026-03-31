import java.util.*;

public class SecretNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        int attempts = 0, guessNumber = 0;
        int secretNumber = random.nextInt(50) + 1;

        System.out.println("I'm thinking of a number between 1 and 50...");

        while (guessNumber != secretNumber) {
            System.out.println("Enter your guess: ");
            guessNumber = sc.nextInt();
            attempts++;

            if (guessNumber > secretNumber) {
                System.out.println("Too high! try a low number");
            } else if (guessNumber < secretNumber) {
                System.out.println("Too low. Try a high number");
            } else {
                System.out.println("Congrats! you found the correct number in " + attempts + " attempts");
            }
        }
    }
}
