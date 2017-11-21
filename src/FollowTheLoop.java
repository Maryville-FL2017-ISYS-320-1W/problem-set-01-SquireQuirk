/*
  	ISYS 320
  	Name(s): Patrick Quirk
  	Date: 11/20/17
*/

/*

1. Fill out the table for the loop below

| ITERATION 		 | COUNT	 |Product	 | Number |
| initialization	 |	4		 |			 | 0      | 
| 1					 |	4	     |7			 |	7	  | 
| 2					 |	3	     |5			 |	12	  | 
| 3					 |	2	     |3			 |	15	  | 
| 4					 |	1	     |1			 |	16	  |


*/

public class FollowTheLoop {

	   public static final int MAX = 4;
	   public static void loopDeDoop() {
	      int number = 0;
	      for( int count = MAX; count >= 1; count-- ) {
	         int product = count * 2 - 1;
	         number = number + product;
	      }
	      System.out.println("The result is: " + number);
	   }

	   public static void main( String[] args ) {
		   loopDeDoop();
	   }

}
