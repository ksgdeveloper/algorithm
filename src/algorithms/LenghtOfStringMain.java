package algorithms;

public class LenghtOfStringMain {
	public static void main(String[] args) {
		String str = "this is hello world";
		
		System.out.println("String length "+ getLengthOfString(str));
	}

	private static int getLengthOfString(String str) {
		
		String theStr = str;
		int i=0;
		try {
			for(i=0; ; i++) 
				theStr.charAt(i);
			
		} catch (StringIndexOutOfBoundsException | ArithmeticException e) {
			// TODO: handle exception
		}
		
		return i;
	}
}
