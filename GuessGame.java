import java.util.*;

public class GuessGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();

        int number = rand.nextInt(100) + 1;
        int attempts = 5;

        System.out.println("Guess number between 1-100");

        while (attempts > 0) {
            System.out.print("Enter guess: ");
            int guess = sc.nextInt();

            if (guess == number) {
                System.out.println("Correct! You win 🎉");
                return;
            } else if (guess > number) {
                System.out.println("Too High!");
            } else {
                System.out.println("Too Low!");
            }

            attempts--;
            System.out.println("Attempts left: " + attempts);
        }

        System.out.println("Game Over! Number was: " + number);
    }
} 
    

