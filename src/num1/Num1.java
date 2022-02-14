package num1;

import java.util.Scanner;

public class Num1 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = ""; 
		int numFromStr = 0;
		System.out.println("Enter string:");
		str = in.nextLine(); 
		str = str.replaceAll("[^0-9]", ""); 
		if (str.isEmpty()) {
			System.out.println("Sum of number is "+ numFromStr);
		}
		else { 
			numFromStr = Integer.parseInt (str);
			int sumNum = 0; 
			while (numFromStr > 0) {
				sumNum = sumNum + numFromStr % 10;
				numFromStr /= 10;
			}
			System.out.println("Sum of number is " + sumNum);
		}
	}

}
