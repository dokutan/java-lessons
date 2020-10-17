/* Colors.java
 * 2020-10-16
 * CC0 or 0-BSD
 *
 * Shows the different ANSI escape color palettes.
 */

import java.text.DecimalFormat;

public class Colors{

	public static final String escape_start = "\u001b[";
	public static final String escape_color256_start = "\u001b[48:5:";
	public static final String escape_end = "m";
	public static final String escape_reset = "\u001b[0m";
	
	public static void main( String[] args ){
		
		/// 3/4-bit indexed colors
		for( int color = 0; color < 8; color++ )
			System.out.print(escape_start + (40+color) + escape_end + " " + color + " ");
		System.out.println(escape_reset);
		for( int color = 0; color < 8; color++ )
			System.out.print(escape_start + (100+color) + escape_end + " " + color + " ");
		System.out.println(escape_reset);
		System.out.println();
		
		/// 8-bit indexed colors
		DecimalFormat df = new DecimalFormat("000");	
		int count = 0;
		for( int color = 0; color < 256; color++ ){
			System.out.print(escape_color256_start + color + escape_end + df.format(color));
			
			count++;
			if( count == 16 ){
				System.out.println(escape_reset);
				count = 0;
			}
		}

	}
}
