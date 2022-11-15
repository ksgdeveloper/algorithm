package algorithms;

public class ConvertBinaryToDecimal {

	public static void main(String[] args) {
	    // binary number
	    String binaryNumber = "110110111";

	    // call method by passing the binary number
	    int decimal1 = convertBinaryToDecimal(binaryNumber);
	    int decimal2 = convertBinaryToDecimal(Long.parseLong(binaryNumber));

	    System.out.println("Binary to Decimal");
	    //method 1
	    System.out.println(binaryNumber + " = " + decimal1);
	    //method 2
	    System.out.println(binaryNumber + " = " + decimal2);
	    //method 3
	    System.out.println(binaryNumber +" = " + Integer.parseInt(binaryNumber,2));
	    //method 4
	    System.out.println(binaryNumber +" = " + convertBinaryToDecimalNew(binaryNumber));
	}

	private static int convertBinaryToDecimal(String binNum) {
		int decimalNumber = 0;
		
		for (int i = 0; i < binNum.length() ; i++) {
			try {
				double binDouble = Double.parseDouble(binNum.substring(i, i+1));
				decimalNumber += Math.pow(2, binDouble*(binNum.length() - i-1))*binDouble;
				System.out.println("[position "+i+", bit value "+(int)binDouble + ", decimalNumber " + decimalNumber+" ]");
			}
			catch(Exception e) {
				e.printStackTrace();
			}
			
		}
		return decimalNumber;
	}
	
	private static int convertBinaryToDecimalNew(String binNum) {
		int i = 0, len = binNum.length();
		int result = 0;
		int radix = 2;
		int limit = -Integer.MAX_VALUE;
		int multmin = limit / radix;
		while (i < len) {
            // Accumulating negatively avoids surprises near MAX_VALUE
            int digit = Character.digit(binNum.charAt(len-i-1), radix);
            result += digit*Math.pow(2, i);
            System.out.println("[position "+i+", bit value "+binNum.charAt(i) + ", decimalNumber " + result+" ]");
            i++;
        }
		
		return result;
	}

	
	public static int convertBinaryToDecimal(long num) {
	    int decimalNumber = 0, i = 0;
	    long remainder;
	    
	    while (num != 0) {
	      remainder = num % 10;
	      num /= 10;
	      decimalNumber += remainder * Math.pow(2, i);
	      System.out.println("[position "+i+ ", bit value " + remainder+ ", decimalNumber "+ decimalNumber +"]" );
	      ++i;
	    }
	    
	    return decimalNumber;
	  }
}
