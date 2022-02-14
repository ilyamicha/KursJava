package num2;

import java.util.Scanner;

public class Num2 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		float numFloat = 0; 
		System.out.println("Enter number:");
		numFloat = in.nextFloat(); 
		
		if (numFloat % 1 == 0) {
			int numInt = (int) numFloat;
			int div = 2;
			System.out.print(numInt + " = 1");
			while(numInt > 1) {
				while (numInt % div == 0) {
					System.out.print(" * " + div);
					numInt = numInt / div;
				}
				div++;
			}
		}
		else System.out.println("Wrong number!");
	}

}
