package algorithms;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

/**
 * 
 * @author shrikant
 * Print 1..100 without using for, do while, while or other flow controls
 */
public class PrintSeriesDemo {

	public static void main(String[] args) {
		
		//Method 1 using recursive
		System.out.println("1. Method using recursive ");
		printNum(1);
		
		// Method 2 using IntStream
		System.out.println();
		System.out.println("2. Method using Int range method ");
		IntStream.range(1, 101).forEach(e -> System.out.print(e+" "));
		
		//Method 3 using Arrays.fill
		System.out.println("\n3. Using Object Arrays method ");
		Object obj [] = new Object[100];
		Arrays.fill(obj, new Object() {
			int count = 0;
			@Override
			public String toString() {
				return Integer.toString(++count);
			}
		});
		Stream.of(obj).forEach(e -> System.out.print(e+" "));
		
	}

	public static void printNum(int num) {
		System.out.print(num+" ");
		
		if(num >100) {
			return;
		}else {
			printNum(num+1);
		}
	}
}
