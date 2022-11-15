package algorithms;

public class StringLength {
	public static void main   (String[] args)  {
		String str = "This is a test";
		
		try {
			stringLength(str);
		} catch (StringIndexOutOfBoundException e) {
			// TODO Auto-generated catch block
			System.out.println(e);
			e.printStackTrace();
		}
		
	}
	public static void stringLength(String s) throws StringIndexOutOfBoundException {
		int length= 0;
		try {
			for(int i=0; ; i++) {
				char c = s.charAt(i);
				length++;
			}
		}catch(Exception e){
			System.out.println("length " + length);
		}
		
			
	}
}
