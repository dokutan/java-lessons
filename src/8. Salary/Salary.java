/* Salary.java
 * 2020-10-09
 * CC0 or 0-BSD
 * 
 * Takes a monthly salary as input and calculates the amount of taxes.
 *
 * javac Salary.java
 * java Salary
 */

import java.util.Scanner;
import java.text.DecimalFormat;

public class Salary {

	public static final double taxes[] = { 0.2, 0.04, 0.0975, 0.073, 0.0325, 0.008 };
	
	public static void main( String[] args ){
		
		// get monthly salary
		double salary = 0.0;
		Scanner sc = new Scanner(System.in);
		System.out.print("Monthly salary: ");
		salary = sc.nextDouble();
		sc.close();
		
		// calculate the tax amounts
		int num_taxes = 6;
		double tax_amounts[] = new double[num_taxes];
		for( int i = 0; i < num_taxes; i++ ){
			tax_amounts[i] = salary * taxes[i];
		}
		
		// calculate what is left of the salary
		double left = salary;
		for( int i = 0; i < num_taxes; i++ ){
			left -= tax_amounts[i];
		}
		
		// show results
		DecimalFormat df = new DecimalFormat("#0.00");
		for( int i = 0; i < num_taxes; i++ ){
			System.out.println("Tax " + (i+1) + " (" + df.format(taxes[i]*100) + "%):\t" + df.format(tax_amounts[i]));
		}
		System.out.println("Salary - Taxes:\t" + df.format(left));
		
	}
}
