package algorithms;
/**
 * Finding the 
 * @author shrikant
 *
 */
public class FindPairClosestToXMain {
	public static void main(String[] args) {
		int array[]={-40,-5,1,3,6,7,8,20};
		findPairWithClosestToXBruteForce(array,5);
	}

	private static void findPairWithClosestToXBruteForce(int[] array, int i) {
		int minSum = 0;
		for (int j = 0; j < array.length -1; j++) {
			int sum = array[j]+array[j+1];
			if(sum > minSum ) {
				
			}
		}
	}
	
	
}
