/* 2020-10-02
 * CC0 or 0-BSD
 *
 * javac Types.java
 * java Types 
 */
import java.util.Scanner;

public class Types {

	public static void main(String[] args) {
		
		// keyword final to declare constant variables
		final short Number1 = 32;
		System.out.println("A short: " + Number1);
		
		final double Number2 = 32.0;
		System.out.println("A double: " + Number2);
		
		// e^x → Infinity
		exp(Number2);
		
		// get user input, call atm()
		Scanner sc = new Scanner(System.in);
		System.out.print("Input an integer: ");
		atm(sc.nextInt());
		sc.close();
		
	}
	
	// calculate e to the power of x until Infinity
	public static void exp(double x) {
		while(true) {
			double result = Math.exp(x);
			System.out.println("e ^ " + x + " = " + result);
			
			// break if result is Infinity
			if(Double.isInfinite(result))
				break;
			
			x++;
		}
	}
	
	// ATM, splits input into multiples of 50,20,10,5
	public static void atm(int amount) {
		
		// vars
		int amount50 = 0, amount20 = 0, amount10 = 0, amount5 = 0;
		
		// calculate
		amount50 = amount / 50;
		amount20 = (amount % 50) / 20;
		amount10 = ((amount % 50) % 20 ) / 10;
		amount5 = (((amount % 50) % 20 ) % 10 )/ 5;
		
		// output
		System.out.print( amount50 != 0 ? amount50 + " × 50\n" : "");
		System.out.print( amount20 != 0 ? amount20 + " × 20\n" : "");
		System.out.print( amount10 != 0 ? amount10 + " × 10\n" : "");
		System.out.print( amount5 != 0 ? amount5 + " × 5\n" : "");
		
	}
}
