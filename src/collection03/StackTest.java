package collection03;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
		Stack<String>  stack = new Stack<>();
		stack.push("A");
		stack.push("B");
		stack.push("C");
		System.out.println( stack );
		System.out.println("--------------------");
		
		/*
		String s1 = stack.pop();
		System.out.println(s1);
		String s2 = stack.pop();
		System.out.println(s2);
		String s3 = stack.pop();
		System.out.println(s3);
		*/
		
		String s1 = stack.pop();	// .pop() : stack 마지막 값 제거 및 반환
		System.out.println( stack );
		System.out.println(s1);
		System.out.println("--------------------");
		
		String s2 = stack.pop();
		System.out.println( stack );
		System.out.println(s2);
		System.out.println("--------------------");
		
		String s3 = stack.pop();
		System.out.println( stack );		
		System.out.println(s3);

	}

}
