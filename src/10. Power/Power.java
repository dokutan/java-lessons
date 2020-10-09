/* Power.java
 * 2020-10-09
 * CC0 or 0-BSD
 * 
 * Calculates the power used by a cyclist.
 *
 * javac Power.java
 * java Power
 */

import java.util.Scanner;
// import java.text.DecimalFormat;

public class Power {
	
	public final static double g = 9.81; // m/s²

	public static double cyclist_power(double mass, double elevation_difference, double time){
		return (g * mass * elevation_difference) / time;
	}

	public static void main( String[] args ){
		
		// variables
		double mass_person = 0.0;
		double mass_bike = 0.0;
		double elevation_start = 0.0;
		double elevation_goal = 0.0;
		double time = 0.0;

		// user input
		Scanner sc = new Scanner(System.in);
		System.out.print("Mass of the cyclist (kg): ");
		mass_person = sc.nextDouble();
		System.out.print("Mass of the bike (kg): ");
		mass_bike = sc.nextDouble();
		System.out.print("Elevation of the start (m): ");
		elevation_start = sc.nextDouble();
		System.out.print("Elevation of the goal (m): ");
		elevation_goal = sc.nextDouble();
		System.out.print("Time to reach the goal (s): ");
		time = sc.nextDouble();
		
		// print result
		System.out.printf("Power of the Cyclist: %.2f W\n", cyclist_power(mass_person+mass_bike, elevation_goal-elevation_start, time));

	}
	
}
