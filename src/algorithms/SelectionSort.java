package algorithms;

import java.util.Arrays;

public class SelectionSort {

	final static int MaxNumbers = 10;
	
	public static void main(String[] args) {
		
		int [] nums = {9,2,1,3,4,5,6,0,8};
		int small;
		
		for(int i = 0; i < nums.length-1 ; i++) {
			small=i;
			Arrays.stream(nums).forEach(System.out::print);
			
			for(int j=i+1; j<nums.length; j++ ) {
				if(nums[small] > nums[j]) {
					small = j; 
				}
			}
			
			System.out.println("smallest value : "+nums[small]);
			
			if(i<small) {
				int temp = nums[i];
				nums[i] = nums[small];
				nums[small] = temp;
 			}
			Arrays.stream(nums).forEach(System.out::print);
			System.out.println("\n");
		}
		
	} 
}
