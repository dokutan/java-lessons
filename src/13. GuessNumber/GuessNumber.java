/* GuessNumber.java
 * 2020-10-19
 *
 * Asks the user to guess a number.
 */

import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class GuessNumber {
	
	// bounds for the random number
	public static final int lower = 0;
	public static final int upper = 50;

	public static void main(String[] args){
		
		// variables
		int my_number = ThreadLocalRandom.current().nextInt(lower, upper+1);
		int guess = 0;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess a number between " + lower + " and " + upper);
		
		// main loop: get user input and compare it with my_number
		do{
			System.out.print("Your guess: ");
			guess = sc.nextInt();

			if( guess < lower || guess > upper ){
				System.out.println("Guess out of bounds");
			} else if( guess == my_number ){
				System.out.println("Correct");
			} else if( guess > my_number ){
				System.out.println("Too large");
			} else if( guess < my_number ){
				System.out.println("Too small");
			}

		} while( guess != my_number );
	
		sc.close();
	}
}
