package trycatch01;

public class TryCatchTest {

	public static void main(String[] args) {
		
		int v1 = 7;
		int v2 = 0;		
		int v;
		
		// v = v1 / v2;  // 실행 시 오류 -> exception
		System.out.println(1);
		
		// 예외처리 
		try{		// if와 동격
			v = v1 / v2;
			// v = v1 / 3;
			// System.out.println( v );
		} catch ( ArithmeticException e) {		// Arithmetic : 계산, catch -> 에러
			e.printStackTrace();		
			System.out.println( "계산문제발생" + e.getMessage() );
		} catch ( Exception e) {
			System.out.println("문제발생" + e.getMessage()	);
		} finally {		// exception 발생여부 상관없이 무조건 실행
			System.out.println("여기가 끝");
		}
		
	}

}







