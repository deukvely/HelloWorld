package co.yedam.collect;

import java.util.Stack;

public class StackExe {
	public static void main(String[] args) {
		Stack<String> stack = new Stack<>();
		stack.push("홍길동");
		stack.push("김길동");
		stack.push("박길동"); // 홍길동 push 김 박 순으로 들어갔고
		
		System.out.println(stack.pop()); // 나오는 순서는 역순
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		
		while (!stack.isEmpty()) { // ! 또 다시 역순
			System.out.println(stack.pop());
		}
	}
}
