package collection01;

import java.util.ArrayList;

public class ArrayListTest2 {

	public static void main(String[] args) {
		
		ArrayList al = new ArrayList();
		al.add(10);       // [0]
		al.add(20);       // [1]
		al.add(30);       // [2]
		al.add("40");     // [3]
		al.add("anc");    // [4]
		al.add(0.00004);  // [5]
			
		System.out.println("al= " + al);
		System.out.println("-----------------------");
		
		int    num1 =  (int) al.get(0);
		System.out.println( "num1= " + num1 );
		String s1   =  (String) al.get(4);
		System.out.println( "s1= " + s1 );
		String s2   =  (String) al.get(3);
		System.out.println( "s2= " + s2 );
		System.out.println("-----------------------");
		
		// int    num2 =  (int) al.get(3);		// 에러
		// String   s3   = (String) al.get(3);
		String   s3   = String.valueOf( al.get(3) );
		int      num2 = Integer.parseInt( s3 );
		System.out.println( num2 + 10);

	}

}








