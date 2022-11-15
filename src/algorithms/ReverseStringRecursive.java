package algorithms;

public class ReverseStringRecursive {

	public static void main(String[] args) {
		String myStr = "Hello";

		String reversed = reverseString(myStr);
		System.out.println("The reversed string is: " + reversed);
	}

	private static String reverseString(String myStr) {
		if (myStr.isEmpty()) {
			System.out.println("String in now Empty");
			return myStr;
		}
		// Calling Function Recursively
		System.out.println("String to be passed in Recursive Function: " + myStr.substring(1));
		return  reverseString(myStr.substring(1)) + myStr.charAt(0) ;
	}
}
