/* CalculateVolume.java
 * 2020-09-25
 * CC0 or 0-BSD
 * 
 * Calculates the volume of a cylinder with dimensions given by the user,
 * additionally the cost to fill this volume with a liquid at a fixed cost per volume is shown.
 * 
 * javac CalculateVolume.java
 * java CalculateVolume
 */

import java.util.Scanner;

public class CalculateVolume {
	
	public static void main(String[] args) {
		
		// constants
		double price = 10.60;
		
		// variables
		double diameter = 0.0, height = 0.0, volume = 0.0, cost = 0.0;
		
		// Scanner
		Scanner sc = new Scanner(System.in);
		
		// get user input
		System.out.print("Input the diameter in m : ");
		diameter = sc.nextDouble();
		System.out.print("Input the height in m : ");
		height = sc.nextDouble();
		
		// calculate volume of a cylinder with the given dimensions
		volume = height * Math.PI * Math.pow((diameter / 2.0), 2.0) * 1000.0;
		cost = volume * price;
		
		// print result
		System.out.println("Volume in l :\t\t\t" + volume);
		System.out.println("This amount would cost : \t" + cost);
		
		// close the Scanner
		sc.close();
	}

}
