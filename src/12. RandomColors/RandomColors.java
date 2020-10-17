/* Colors.java
 * 2020-10-16
 * CC0 or 0-BSD
 *
 * Fills the terminal with random colors
 */

import java.util.Random;

public class RandomColors{

	public static final String escape_start = "\u001b[48:5:";
	public static final String escape_end = "m";
	// public static final String escape_reset = "\u001b[0m";
	
	public static void main( String[] args ){
		
		Random r = new Random();

		while( true ){
			System.out.print(escape_start + r.nextInt(255) + escape_end + "  ");
		}	
	}
}
