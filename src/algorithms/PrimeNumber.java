package algorithms;

public class PrimeNumber {

	public static void main(String[] args) {
		int flag = 0;
		
		//Display Prime Numbers 
		for(int i=3; i<1000; i++) {
			flag = 0;//flag it set to show the results at the end 1 means composite, 0 means prime
			int theNumber = i;
			if(theNumber%2 ==0) {
				flag=1;
				continue;//immediately skips the loop for the next iteration
			}
			// traverses through the numbers to check the divisibility 
			for(int j=2; j <= Math.sqrt(theNumber); j++) {
				//System.out.println(theNumber+ " % " +j);
				if(theNumber%j == 0) {
					flag=1;
					break; //breaks the loop for the next iteration
				}
			}
			if(flag == 0) {
				System.out.println("Prime Number " + theNumber);
			}
			
		}
	}
}
