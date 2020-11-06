/* 2020-11-04
 * Calculates the factorial of a given number
 */

public class Factorial {

	public static long factorial_do_while( long n ){
		
		long result = 1;
		
		if( n == 0 )
			return 1;

		do{
			result *= n;
			n--;
		}while( n > 0 );

		return result;
	}

	public static long factorial_while( long n ){
		
		long result = 1;
		
		while( n > 0 ){
			result *= n;
			n--;
		}

		return result;
	}

	public static long factorial_for( long n ){
		
		long result = 1;
		
		for( ; n > 0; n-- )
			result *= n;
		
		return result;
	}

	public static long factorial_recursion( long n ){
		
		if( n == 0 )
			return 1;

		return n * factorial_recursion( n-1 );
	}

	public static void main( String[] args ) {
		
		// check args
		if( args.length != 2 ) {
			System.err.println("2 Arguments required:\nnumber d|w|f|r|b");
			System.exit(1);
		}

		// variable
		int n = Integer.valueOf( args[0] );
		
		if( args[1].matches( "d.*" ) ) // do while
			System.out.println( factorial_do_while( n ) );

		else if( args[1].matches( "w.*" ) ) // while
			System.out.println( factorial_while( n ) );

		else if( args[1].matches( "f.*" ) ) // for
			System.out.println( factorial_for( n ) );

		else if( args[1].matches( "r.*" ) ) // recursion
			System.out.println( factorial_recursion( n ) );

		else if( args[1].matches( "b.*" ) ){ // benchmark
			
			long start, end;	
			
			start = System.currentTimeMillis();
			for( int i = 0; i < n; i++ )
			       factorial_do_while( i );
			end = System.currentTimeMillis();
			System.out.println( "do-while:\t" + (end-start)	+ " ms" );

			start = System.currentTimeMillis();
			for( int i = 0; i < n; i++ )
			       factorial_while( i );
			end = System.currentTimeMillis();
			System.out.println( "while:\t\t" + (end-start) + " ms" );
			
			start = System.currentTimeMillis();
			for( int i = 0; i < n; i++ )
			       factorial_for( i );
			end = System.currentTimeMillis();
			System.out.println( "for:\t\t" + (end-start) + " ms" );

			start = System.currentTimeMillis();
			for( int i = 0; i < n; i++ )
			       factorial_recursion( i );
			end = System.currentTimeMillis();
			System.out.println( "recursion:\t" + (end-start) + " ms" );
		}
	}
}
