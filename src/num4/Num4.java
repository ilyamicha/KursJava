package num4;

import java.util.Arrays;
import java.util.Scanner;
import java.util.stream.Stream;

public class Num4 {

	public static void main(String[] args) {
		String [][] numberStar = {
				{" ***\r\n"	, " * *\r\n" , " * *\r\n" , " * *\r\n" , " *** ",
				 "   *\r\n" + "  **\r\n" + " * *\r\n" + "   *\r\n" + "   * ",
				 " ***\r\n" + "   *\r\n" + "  * \r\n" + " *  \r\n" + " *** ",
				 " ***\r\n" + "   *\r\n" + " ***\r\n" + "   *\r\n" + " *** ",
				 " * *\r\n" + " * *\r\n" + " ***\r\n" + "   *\r\n" + "   * ",
				 " ***\r\n" + " *  \r\n" + " ***\r\n" + "   *\r\n" + " *** ",
				 " ***\r\n" + " *  \r\n" + " ***\r\n" + " * *\r\n" + " *** ",
				 " ***\r\n" + "   *\r\n" + "  * \r\n" + " *  \r\n" + " *   ",
				 " ***\r\n" + " * *\r\n" + " ***\r\n" + " * *\r\n" + " *** ",
				 " ***\r\n" + " * *\r\n" + " ***\r\n" + "   *\r\n" + " *** "
				}
		};
		String [][] numberNum = {
				{" 000\r\n"	+ " 0 0\r\n" + " 0 0\r\n" + " 0 0\r\n" + " 000 ",
				 "   1\r\n" + "  11\r\n" + " 1 1\r\n" + "   1\r\n" + "   1 ",
				 " 222\r\n" + "   2\r\n" + "  2 \r\n" + " 2  \r\n" + " 222 ",
				 " 333\r\n" + "   3\r\n" + " 333\r\n" + "   3\r\n" + " 333 ",
				 " 4 4\r\n" + " 4 4\r\n" + " 444\r\n" + "   4\r\n" + "   4 ",
				 " 555\r\n" + " 5  \r\n" + " 555\r\n" + "   5\r\n" + " 555 ",
				 " 666\r\n" + " 6  \r\n" + " 666\r\n" + " 6 6\r\n" + " 666 ",
				 " 777\r\n" + "   7\r\n" + "  7 \r\n" + " 7  \r\n" + " 7   ",
				 " 888\r\n" + " 8 8\r\n" + " 888\r\n" + " 8 8\r\n" + " 888 ",
				 " 999\r\n" + " 9 9\r\n" + " 999\r\n" + "   9\r\n" + " 999 "
				}
		};
		Scanner in = new Scanner(System.in); 
		  int numEnter = 0;  
		  int max = 0; 
		  String reversed = ""; 
		  System.out.println("Enter number:"); 
		  numEnter = in.nextInt(); 
		  int numForCount = numEnter;
		  int numForMax = numEnter;
		  int count = (numForCount == 0) ? 1 : 0; 
		        while (numForCount != 0) { 
		            count++; 
		            numForCount /= 10; 
		        } 
		  String [][] numberOut = new String [1][count];
		  for (int i = 0; i<count; i++) {
			  numberOut[0][i]=" ";
		  }
		  reversed = String.valueOf(numEnter); 
		  StringBuffer sb = new StringBuffer(reversed); 
		     sb.reverse(); 
		     reversed = sb.toString(); 
		  while (numForMax > 0) { 
		   if (numForMax % 10 > max) {max = numForMax % 10;} 
		   		numForMax /= 10; 
		  } 
		  for (int i = 0; i < reversed.length(); i++) { 
			  char last = reversed.charAt(reversed.length() - 1-i); 
		      for (int z = 0; z < numberNum[0].length; z++) { 
		    	  if (numberNum[0][z].indexOf(last)!=-1) { 
		    		  int lastInt = Character.getNumericValue(last);
		    		  if (max == lastInt) numberOut[0][i] = numberNum[0][z];
		    		  else numberOut[0][i] = numberStar[0][z];
		          } 
		        } 
		  } 
		  for (String[] innerArray: numberOut) { 
			  for(String data: innerArray) { 
		          System.out.println( data +  "\n"); 
		      } 
		  }
	}
}
