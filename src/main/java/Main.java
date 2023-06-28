/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
    Random random = new Random();

    Scanner scanner = new Scanner(System.in);
    int x = random.nextInt(11);
    int z = 0;
        while (true) {
            System.out.println("Guess a number! ");
            int y = scanner.nextInt();

           if (y < x) {
               System.out.println("too small");
               z++;
           } else if (y > x) {
               System.out.println("too big");
               z++;
           } else if (y == x) {
               System.out.println("correct guess");
               z++;
               System.out.println("You guess " + z + " times!");

               break;
           }

        }

    }
}
