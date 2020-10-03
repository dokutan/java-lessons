/* FreeFall.java
 * 2020-10-02
 * CC0 or 0-BSD
 * 
 * Calculates the distance travelled and the speed of an object in free fall.
 *
 * javac FreeFall.java
 * java FreeFall
 */

import java.util.Scanner;

public class FreeFall {

	// constants
	final static public double g = 9.81; // m/s²

	public static void main( String[] args ){
		
		// variables
		double t = 0.0; // time in seconds
		double s = 0.0; // distance in meters
		double v = 0.0; // velocity in m/s

		// user input (t): args or stdin
		if( args.length >= 1 ){
			t = Double.parseDouble(args[0]);
		} else{
			Scanner sc = new Scanner(System.in);
			System.out.print("Time t in seconds: ");
			t = sc.nextDouble();
			sc.close();
		}

		// calculation
		s = g * t;
		v = 0.5 * g * t * t;

		// output
		System.out.printf("Distance s in meters:\t%.4f\n", s);
		System.out.printf("Velocity v in m/s:\t%.4f\n", v);

	}
}
