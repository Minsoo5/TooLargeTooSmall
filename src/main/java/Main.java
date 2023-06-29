/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    Random random = new Random();
    Scanner scanner = new Scanner(System.in);

    int randomNum = random.nextInt(11);
    int numOfGuess = 0;
    int previousGuess = 0;
    int guess = 0;

        while (randomNum != guess) {
            System.out.println("Guess a number! ");
            guess = scanner.nextInt();

           if (guess < randomNum) {
               System.out.println("too small!");
               if (previousGuess == guess) {
                   System.out.println("and you just guessed that, try a different number!");
                   numOfGuess += 0;
               } else numOfGuess ++;
               previousGuess = guess;
           }

            else if (guess > randomNum) {
            System.out.println("too big!");
              if (previousGuess == guess) {
                  System.out.println("and you just guessed that, try a different number!");
                numOfGuess += 0;
            } else numOfGuess ++;
              previousGuess = guess;


           }
            else if (guess == randomNum) {
               System.out.println("correct guess");
               numOfGuess++;
               System.out.println("You guess " + numOfGuess + " times!");

               break;
           }

        }

    }
}
