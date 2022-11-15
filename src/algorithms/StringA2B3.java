package algorithms;

public class StringA2B3 {

	public static void main(String[] args) {
		String str = "3d5y10r";
		
		String [] letters = str.split("[0-9]+");
		
		String [] numbers = str.split("[a-z]+");
		
		for(int i=1; i<letters.length; i++) {
			//System.out.print(letters[i]);
			for(int j=0; j< Integer.parseInt(numbers[i-1]); j++) {
				System.out.print(letters[i]);
			}
		}
		
	}

}
