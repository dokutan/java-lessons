/* 2020-12-02
 *
 */

public class LiteralTester {
	
	public static void main(String[] args) {
		
		String str1 = "Bo";
		String str2 = "Bo";
		String str3 = new String("Fred");
		String str4 = new String("Fred");
		
		System.out.println(str1.getClass().getName());
		System.out.println(str3.getClass().getName());

		System.out.println( str1 == str2 ? "str1 == str2" : "str1 != str2" );
		System.out.println( str3 == str4 ? "str3 == str4" : "str3 != str4" );
		System.out.println( str3.equals(str4) ? "str3 == str4" : "str3 != str4" );

	}

}
