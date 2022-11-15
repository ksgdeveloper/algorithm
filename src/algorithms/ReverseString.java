package algorithms;

import java.util.Scanner;

public class ReverseString {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		
		String str = in.nextLine();
		StringBuilder sb = new StringBuilder();
		int length= str.length();
		for(int i=0; i<str.length();i++) {
			sb.append(str.substring(length-i-1, length-i));
		}
		str=sb.toString();
		System.out.println(str);
		System.out.println(sb.reverse());
	}

}
