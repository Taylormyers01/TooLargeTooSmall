/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int number =0, current = 0, previous = 0, guesses = 0;
        Scanner in = new Scanner(System.in);
        Random random = new Random();
        number = random.nextInt(11);
        while(current != number){
            System.out.print("Guess a number between 0 and 10: ");
            current = in.nextInt();
            if(current == previous){
                System.out.println("Please enter a new value");
                continue;
            }
            guesses++;
            String outcome = (current<number) ? "Too small" : "Too large";
            System.out.println(outcome);
            previous = current;
        }
        System.out.println("You guessed correctly in " + guesses + " guesses.");
    }
}
