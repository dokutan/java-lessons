/* 2020-11-16
 * Arrays2.java
 */

import java.util.Scanner;

public class Arrays2 {
	public static void main(String[] args){
		
		// part 1	
		String[] weekdays = {
			"Monday",
			"Tuesday",
			"Wednesday",
			"Thursday",
			"Friday",
			"Saturday",
			"Sunday"
		};

		for( int i = 0; i < weekdays.length; i++ )
			System.out.println( weekdays[i] );

		for( var weekday : weekdays )
			System.out.println( weekday );
		
		
		// part 2
		System.out.println();
		Scanner sc = new Scanner( System.in );	

		while( true ){
			
			// get size of array
			System.out.print( "Size of array: " );
			int size = sc.nextInt();
			
			// get array content from user
			int[] intArray = new int[size];
			for( int i = 0; i < intArray.length; i++ ){
				System.out.print( i + ": " );
				intArray[i] = sc.nextInt();
			}
		
			// find maximum
			int posMax = 0;
			for( int i = 0; i < intArray.length; i++ ){
				if( intArray[i] > intArray[posMax] )
					posMax = i;
			}
			System.out.println( "Maximum: " + intArray[posMax] + " at position " + posMax );
			
			// repeat?
			System.out.print( "Repeat [y/n] ? " );
			if( !sc.next().matches( "y.*" ) )
				break;
			
		}
	}
}
