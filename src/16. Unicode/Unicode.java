/* 2020-11-06
 * Converts a range of unicde codepoints to their visual representation.
 * Compare Plan 9 unicode(1).
 */

public class Unicode {

	public static void main(String[] args){
		
		if( args.length != 2 ){
			System.out.println("Usage: Unicode start end");
			System.exit(1);
		}

		// variables
		int start = Integer.valueOf( args[0] );
		int end = Integer.valueOf( args[1] );
		
		for( int i = start; i <= end; i++ ){
			if( Character.isDefined(i) && !Character.isISOControl(i) )
				System.out.println( i + "\t" + Character.toString(i) );
			else
				System.out.println( i + "\t" + "�" );
		}
	}
}
