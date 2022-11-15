package algorithms;

import java.util.Scanner;

public class ReverseStringChars {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String str= in.nextLine();
		StringBuilder rev = new StringBuilder();
		
		for(int i=0; i < str.length()-1; i++) {
			char c = str.charAt(str.length()-i-1);
			rev.append(c);
		}
		System.out.println(rev.toString());
		
		rev = new StringBuilder(str);
		System.out.println("Method 2" + rev.reverse());
	}
}
