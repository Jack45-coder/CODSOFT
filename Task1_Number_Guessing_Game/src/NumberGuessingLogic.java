import java.util.Random;
import java.util.Scanner;

public class NumberGuessingLogic {
    private int number;
    private int maxAttempts  = 7;

    public void startGame(){
        Scanner sc = new Scanner(System.in);
        Random random = new Random();

        number = random.nextInt(100) + 1;
        int attempts = 0;

        System.out.println("Guess the number between 1 and 100");

        while (attempts < maxAttempts){
            System.out.print("Enter your guess: ");
            int guess = sc.nextInt();
            attempts++;

            if(guess == number){
                System.out.println("Correct! You guessed in " + attempts + "attempts.");
            } else if (guess < number) {
                System.out.println("Too Low!");
            }else {
                System.out.println("Too High!");
            }
        }
        System.out.println("Out of attempts! Number was: " + number);
    }
}
