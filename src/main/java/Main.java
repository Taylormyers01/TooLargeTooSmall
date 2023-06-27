/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Random;
import java.util.Scanner;
public class Main {

    public static void main(String[] args){
        int number = 0;
        int current = 0;
        int previous = 999;
        int guesses = 0;
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
            if(current < number){
                System.out.println("Too small");
            }
            if(current > number){
                System.out.println("Too large");
            }
            previous = current;
        }
        System.out.println("You guessed correctly in " + guesses + " guesses.");
    }
}
