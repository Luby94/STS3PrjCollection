package collection02;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Objects;

class Student {
	
	private int     id;
	private String  name;

	public Student(int id, String name) {
		this.id = id;
		this.name = name;
	}
	
	// 동등객체판단 로직 추가 : hash - 메모리의 위치정보 (new될때 저장되는 곳=만들어지는 메모리의 위치)
	  // alt+shift+s -> Generate hashcode() and equals()
	  // id : int -> stack에 저장 , name : String -> heap에 저장
	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}
	
	@Override
	public boolean equals(Object obj) {
		/*
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
			// 위에 것들 없어도됨 -> 주석처리해도 결과 변함없음
		*/
		Student other = (Student) obj;
		return id == other.id && Objects.equals(name, other.name);
	}	

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + "]";
	}

	
}

public class TestSetStudent {

	public static void main(String[] args) {
		
		ArrayList<Student> studList = new ArrayList<>();
		
		/*
		Student s1 = new Student();
		s1.id = 1;
		s1.name = "가나";
		
		studList.add( s1 );
		*/
		
		/*
		Student s1 = new Student( 1, "가나" );
		studList.add( s1 );
		*/
		
		studList.add( new Student( 1, "가나" ) );
		studList.add( new Student( 2, "나나" ) );
		studList.add( new Student( 3, "다나" ) );
		studList.add( new Student( 1, "가나" ) );
		
		// System.out.println( studList );	-> .toString 생략 상태
		System.out.println( studList.toString() );   // size : 4
		System.out.println("================================");
		// class student에 toString 안만들 경우 hashcode출력

		HashSet<Student> studSet = new HashSet<>();
		studSet.add( new Student( 1, "가나" ) );
		studSet.add( new Student( 2, "나나" ) );
		studSet.add( new Student( 3, "다나" ) );
		studSet.add( new Student( 1, "가나" ) );
		
		System.out.println( studSet );

	}

}
