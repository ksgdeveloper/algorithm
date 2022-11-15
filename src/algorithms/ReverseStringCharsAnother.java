package algorithms;

import java.util.Scanner;

public class ReverseStringCharsAnother {
	public static void main(String[] args) {
		Scanner in = new Scanner (System.in);
		
		String str= in.nextLine();
		StringBuilder sb = new StringBuilder();
		int length = str.length();
		for(int i=length-1; i > 0; i--) {
			char c = str.charAt(i);
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
}
