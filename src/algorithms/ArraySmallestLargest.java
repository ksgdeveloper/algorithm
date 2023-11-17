package algorithms;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * ArraySmallest Largest calculates the largest and smallest in the group of array
 * @author shrikant
 *
 */
public class ArraySmallestLargest {

	public static void main(String[] args) {
		int arr[] = new int[]{12,56,76,89,100,343,21,7,1,234};
		
		int smallest=0;
		int largest=0;
		
		for(int i=1;i< arr.length;i++) {
			//compare to the next number
			if(arr[largest]<arr[i]) {
				largest = i;
			}
			// compare to the next number 
			if(arr[smallest]>arr[i]) {
				smallest = i;
			}
			
		}
		System.out.println(arr[smallest]);
		System.out.println(arr[largest]);
		
		//find 2nd largest in the
		Optional<Integer> secondlargest = Arrays.stream(arr)
				.boxed()
				.sorted(Comparator.reverseOrder())
				.skip(1).findFirst();

		if(secondlargest.isPresent()){
			secondlargest.ifPresent(a -> System.out.println(a));
		}else{
			System.out.println("no record present");
		}

		//method that sorts the array
		Arrays.sort(arr);
		for(int a : arr) {
			System.out.print(a+",");
		}
		
		List<Integer> list = Arrays.stream(arr).boxed().collect(Collectors.toList());
		System.out.println("\n");
		list.stream().sorted(Comparator.reverseOrder()).forEach(e->System.out.print(e+" "));
		
		}
	

}

/*
arr[smallest] > arr[index]
  smallest = index
  
 arr[largest] < arr[index]
  largest = index 
  
*/