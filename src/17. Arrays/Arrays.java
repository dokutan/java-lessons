/* 2020-11-13
 */

import java.util.ArrayList;
import java.util.stream.IntStream;

public class Arrays{
	
	public static void main(String[] args){
		
		// part 1
			
		// declare and initialise array
		int[] a = IntStream.rangeClosed(0, 31).toArray();

		// iterate over array
		for( var i : a ) System.out.print( (i % 3 == 0) ? i + "\n" : "" ); 
		

		// part 2
		double[] time = { 11, 12, 13, 14, 15, 16 };
		double[] temp = { 15, 16, 17, 16, 16, 13 };
		
		for( int i = 0; i < time.length; i++ )
			System.out.printf("%.2f: %.0f\n", time[i], temp[i] );
		
		// part 3
		ArrayList<Integer> arraylist = new ArrayList();
		for( int i = 0; i < 31; i++ )
			arraylist.add(i);
		arraylist.forEach( (n) -> { if(n % 3 == 0){ System.out.println(n); } } );
		
		// part 4
		String[] strings = {"a", "b", "c", "d", "e", "f", "g", "h", "i", "j"};
		int[] ints = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
		
		int sum = 0, avg;
		for( var i : ints ) sum += i;
		avg = sum / ints.length;

		for( int i = 0; i < strings.length; i++ )
			System.out.printf( "%s\t%d\t%s\n", strings[i], ints[i], ints[i] == avg ? "average" : ints[i] > avg ? ">" : "<" );
	}

}
