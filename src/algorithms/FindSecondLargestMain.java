package algorithms;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 * Program calculates the second highest number in the unsorted array of numbers
 * It uses Stream API for getting the stream passing array in stream to sort the Collection in reverse order 
 * and retrieving the second highest element
 * 
 * @author shrikant
 *
 */
public class FindSecondLargestMain {
	public static void main(String[] args) {
		
		Integer[] arr1={7,5,6,1,4,2};
		//1 Using List 
		System.out.println("***** USING LIST *****");
		List<Integer> listDescendingOrder = Arrays.asList(arr1)
													.stream()
														.sorted(Collections.reverseOrder())
															.collect(Collectors.toList());
		
		System.out.println("List in Descending Order" + listDescendingOrder);
		System.out.println("Second highest Element: " +listDescendingOrder.get(1));
		
		
		System.out.println("***** USING LIST AGAIN *****");
		Arrays.asList(arr1).stream().sorted().forEach(e-> System.out.print(e+" "));
	 	
		
		System.out.println("***** USING SET *****");
		Set<Integer> setAscendingOrder = Arrays.asList(arr1)
												.stream()
													.sorted()
														.collect(Collectors.toSet());
		
		System.out.print("List in Ascending Order" + setAscendingOrder);

	
	}
}
