import java.util.Scanner;
import java.util.Random;
public class GuessGame {
    public static void main(String args[]){
		System.out.println("\nWelcome to the guessing game! Guess a number 1-100:");
		System.out.println("Enter input:");

  	  Random num = new Random();
  	  int x = num.nextInt(100);

		Scanner s = new Scanner(System.in);
		int guess = s.nextInt();
		int cnt = 1;
	
		while(guess > 0) {
	
			if (guess > x) {
				System.out.println("You guessed " + guess + ". That number is too high, try again!");
				System.out.println("Enter input:");
				guess = s.nextInt();
			} else if (guess < x) {
				System.out.println("You guessed " + guess + ". That number is too low, try again!");
				System.out.println("Enter input:");
				guess = s.nextInt();	
			}else {
				System.out.println("You win, you guessed " + guess + "! You guessed the number in " + cnt + " attempts!");
				break;
			}
			cnt++;
    	}
	}
}