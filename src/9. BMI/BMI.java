/* BMI.java
 * 2020-10-09
 * CC0 or 0-BSD
 * 
 * Calculates the Body Mass Index (BMI).
 *
 * javac BMI.java
 * java BMI
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class BMI {
	
	private static double bmi(double weight, double height){
		return weight / (height*height);
	}
	
	public static void main( String[] args ){
	
	// variables
	double weight = 0.0, height = 0.0;
	
	// user input
	if( args.length >= 2 ){
		weight = Double.valueOf(args[0]);
		height = Double.valueOf(args[1]);
	} else {
		Scanner sc = new Scanner(System.in);
		System.out.print("Body weight in kg: ");
		weight = sc.nextDouble();
		System.out.print("Body height in m: ");
		height = sc.nextDouble();
	}
	
	// calculate and show BMI
	DecimalFormat df = new DecimalFormat("0.0");
	System.out.println("BMI: " + df.format( bmi(weight, height) ));
	
	}
	
}
