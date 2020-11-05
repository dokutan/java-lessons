/* Rectangles.java
 * 2020-11-02
 * Asks for the corners of rectangles and calculates the height, width and area.
 */

import java.util.Scanner;

public class  Rectangles {
	public static void main( String[] args ){
		
		int x1, y1, x2, y2;
		int width, height, area;
		Scanner sc = new Scanner( System.in );

		while( true ){
			
			System.out.print( "x1: " );
			x1 = sc.nextInt();
			System.out.print( "y1: " );
			y1 = sc.nextInt();
			System.out.print( "x2: " );
			x2 = sc.nextInt();
			System.out.print( "y2: " );
			y2 = sc.nextInt();

			width = Math.abs( x1 - x2 );
			height = Math.abs( y1 - y2 );
			area = width * height;
			
			if( width == 0 || height ==  0 )
				break;

			System.out.println( "width: " + width + "\theight: " + height + "\tarea: " + area );

		}

		sc.close();
	}
}
