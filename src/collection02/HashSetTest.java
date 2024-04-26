package collection02;

import java.util.HashSet;
import java.util.Iterator;

import javax.swing.JFormattedTextField;

public class HashSetTest {

	public static void main(String[] args) {
		
		// Set set1 = new Set(); -> error: Set cannot be resolved to a type
		// interface는 new 할 수 없다(코딩없기때문) -> class만 new 할 수 있다
		// Set set1 = new Set() { //코드를 넣으면 };  // new 가능
		
		// 중복 자료 저장 불가
		HashSet<String> set = new HashSet<String>();
		
		System.out.println( set.size() );  // 0
		set.add("Java");
		set.add("Python");
		set.add("Oracle");
		set.add("Java");
		set.add("Spring");
		System.out.println( set.size() );  // 4 , "Java" 중복
		System.out.println("=========================");
		System.out.println( set.toString() );
		System.out.println("=========================");
	
			// Iterator : 반복
		for (Iterator iterator = set.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			System.out.println(string);
		}		
		System.out.println("=========================");

		Iterator iterator = set.iterator();		
		while ( iterator.hasNext() ) {
			String string = (String) iterator.next();
			System.out.println(string);			
		}
		System.out.println("=========================");

		for (Iterator iterator2 = set.iterator(); iterator2.hasNext();) {
			String string = (String) iterator2.next();
		System.out.println(string);
		}
		System.out.println("=========================");
		
		Iterator iterator2 = set.iterator();
		while( iterator2.hasNext() ) {
			String string = (String) iterator2.next();
			System.out.println(string);
		}

	}

}





