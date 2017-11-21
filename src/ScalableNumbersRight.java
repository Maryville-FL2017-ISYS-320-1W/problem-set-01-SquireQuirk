/*
  	ISYS 320
  	Name(s):Patrick Quirk
  	Date: 11/20/17
*/

public class ScalableNumbersRight {

	public static final int total = 5;
	
	public static void main(String[] args) {
		
		
		for( int line = 1; line <= total; line++ ) {
			for( int spacesIndex = 1; spacesIndex <= total - line; spacesIndex++ ) {
				System.out.print(" ");
			}
			for( int numbersIndex = 1; numbersIndex <= line; numbersIndex++ ) {
				System.out.print( line );
			}
			System.out.println();
		}

	}

}
