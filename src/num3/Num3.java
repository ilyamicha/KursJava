package num3;

import java.util.Scanner;
import java.util.Arrays;
public class Num3 {
	
	public static int NumVowels (String a) {
		char[] vowels = {'�','�','�','�','�','�','�','�','�'};
		int numVowels = 0;	
		char [] compare = a.toCharArray();
		for (int j = 0; j < compare.length; j++) {
			for (int z = 0; z < vowels.length; z++) {
				if (compare[j] == vowels[z]) numVowels++;
			}
		}
		return numVowels;
	}
	public static String TopVowels (String a) {
		int flag = 0;
		char[] vowels = {'�','�','�','�','�','�','�','�','�'};
		char [] compare = a.toCharArray();
		for (int j = 0; j < compare.length; j++) {
			for (int z = 0; z < vowels.length; z++) {
				if (compare[j] == vowels[z] && flag == 0) {
					flag = 1;
					switch (compare[j]) {
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					case '�':
						compare[j]='�';
						break;
					}
					
					}
				}
		}
		String res = String.valueOf(compare);
		return res;
	}
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String str = "";
		boolean sorted = false;
		String temp;
		String[] subStr;
	    String delimeter = " "; 
		System.out.println("Enter string:");
		str = in.nextLine(); 
		subStr = str.split(delimeter);
		while(!sorted) { 
			 sorted = true; 
			 for (int i = 0; i < subStr.length - 1; i++) { 
				 if (NumVowels(subStr[i]) < NumVowels(subStr[i+1])) { 
					 temp = subStr[i]; 
					 subStr[i] = subStr[i+1]; 
					 subStr[i+1] = temp; 
					 sorted = false; 
				 } 
			 }
		}
		for (int i = 0; i < subStr.length; i++) {	
			subStr[i] = TopVowels(subStr[i]);
		}
		System.out.println(Arrays.toString(subStr));

	}
}
