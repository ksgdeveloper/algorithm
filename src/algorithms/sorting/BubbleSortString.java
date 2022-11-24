package algorithms.sorting;

import java.util.Arrays;

public class BubbleSortString {
	
	
	public static void main(String[] args) {
		String[] str = {
				"Now", "is", "the", "time", "for", "all", "good", "men", 
				"to", "come", "to", "the", "aid", "of", "their", "country" };
		
		for(int i=0; i< str.length ; i++) 
			for (int j = 0; j < i; j++) {
				if(str[i].compareTo(str[j]) < 0) {
					String t = str[i];
					str[i] = str[j];
					str[j] = t; 
				}
				
			}
		
		System.out.println(Arrays.toString(str));
		Arrays.sort(str);
		System.out.println(Arrays.toString(str)); 
	}
}
