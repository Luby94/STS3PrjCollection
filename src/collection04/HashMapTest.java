package collection04;

import java.util.HashMap;

public class HashMapTest {

	public static void main(String[] args) {
		HashMap<String, Object>  map = new  HashMap<String, Object>();
		
		map.put("num", 1);
		map.put("name", "송중기");
		map.put("kor", 90);
		map.put("eng", 95);
		map.put("mat", 92);		
		map.put("val", "9012");		
		System.out.println(map.size());  // 6
		System.out.println("=======================");
		
		int     num  =   (int) map.get("num");
		// String  name =  (String) map.get("name");  <- 이렇게 쓰지말고 아래것으로 사용
		String  name =  String.valueOf( map.get("name") );
		int     kor  =  (int) map.get("kor");
		int     eng  =  (int) map.get("eng");
		int     mat  =  (int) map.get("mat");
		// String  val  =  (String) map.get("val");
		String  val  =  String.valueOf( map.get("val") );
		int     ival =  Integer.parseInt(val);
		
		System.out.println( num );
		System.out.println( name );
		System.out.println( kor );
		System.out.println( eng );
		System.out.println( mat );
		System.out.println( ival );

	}

}








