/* ScannerTest.java
 * 2020-09-25
 * CC0 or 0-BSD
 *
 * javac ScannerTest.java
 * java ScannerTest
 */

import java.util.Scanner;

public class ScannerTest {

	public static void main(String[] args) {
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// get input with next*()
		System.out.println("Type an integer:");
		int Integer = sc.nextInt();
		System.out.println("Type a double:");
		double Double = sc.nextDouble();
				
		// print input
		System.out.println("You typed: " + Integer + " and " + Double);
		
	}

}
