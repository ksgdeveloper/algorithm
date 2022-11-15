package algorithms;

public class SubString {

	public static void main(String[] args) {
		
		String str = "abbc";
		
		for (int i = 1; i < str.length()+1; i++) {
			for (int j = 0; j < str.length()-i+1; j++) {
				System.out.print(str.substring(j, j+i)+",");
			}
		}
	}
}

/*

output a, b, b, c	
ab, bb, bc, abb, bbc, abbc

1 to 4
0 to 3
System.out.println(str.subSequence(0, 1));//1	0,1
System.out.println(str.subSequence(1, 2));//2 	1,2
System.out.println(str.subSequence(2, 3));//3	2,3

2 to 4
1 to 3
System.out.println(str.subSequence(0, 2));
System.out.println(str.subSequence(1, 3));

System.out.println(str.subSequence(0, 3));
		
*/