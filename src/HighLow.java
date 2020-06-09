import java.util.Scanner;
public class HighLow {
    public static void main(String[] args) {
        int min = 0;
        int max = 100;
        long gameRandom;
        gameRandom = (long) (Math.random() * (max - min + 1) + min);
        Scanner input = new Scanner(System.in);
        System.out.println(gameRandom);
        int userGuess;
        System.out.println("Guess the number!");
            do {
                userGuess = input.nextInt();
                if (userGuess > gameRandom) {
                    System.out.println("LOWER");
                } else if (userGuess < gameRandom) {
                    System.out.println("HIGHER");
                } else {
                    System.out.println("Good guess!");
                }
            } while (gameRandom != userGuess);
    }
}
