package algorithms.chapter1;

import java.util.ArrayList;
import java.util.List;

public class FizzBuzz {
	public static void main(String[] args) {
		List<String> fizzbuzz = new ArrayList<>();
		fizzbuzz.add("FIZZ");
		fizzbuzz.add("BUZZ");
		int count = 20;
		
		for(int i=1 ; i<=count ; i++) {
			if(i%5 == 0 && i%3 == 0 ) {
				System.out.print(fizzbuzz.get(0)+fizzbuzz.get(1)+",");
			} else if(i%3 == 0) {
				System.out.print(fizzbuzz.get(0)+",");
			}else if(i%5 == 0) {
				System.out.print(fizzbuzz.get(1)+",");
			}else {
				System.out.print(i+",");
			}
		}
		
 	}
}	
