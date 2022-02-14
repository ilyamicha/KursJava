package num5;

import java.util.Scanner;

public class Num5 {

	public static void main(String[] args) {
		int[] weights = { 5, 2, 1 };
		int[] values = { 2000, 4500, 3000 };
		Scanner in = new Scanner(System.in);
		int maxCapacity = 0; 
		System.out.println("Enter number:");
		maxCapacity = in.nextInt(); 
		int[][] arr = new int[weights.length+ 1] [maxCapacity + 1];
	    for (int i = 0; i <= weights.length; i++)
	    {
	        for (int j = 0; j <= maxCapacity; j++)
	        {
	            if (i == 0 || j == 0)  arr[i][j] = 0;
	            else
	            {   
	                if (weights[i - 1] > j) arr[i][j] = arr[i - 1][j];
	                else
	                {
	                    int prev = arr[i - 1][j];
	                    int byFormula = values[i - 1] + arr[i - 1][j - weights[i - 1]];
	                    arr[i][j] = Math.max(prev, byFormula);
	                }
	            }
	        }
	    }
	    System.out.println(arr[weights.length] [maxCapacity]);
	}
}
