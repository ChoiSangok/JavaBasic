package java10_collection;

import java.util.Stack;

public class Collection07_Stack {

	public static void main(String[] args) {
		
		//스택 push 랑 pop을 이용해서 반복
		
		Stack stack=new Stack();
		
		stack.push("Apple");
		stack.push("Banana");
		stack.push("Cherry");
		
		System.out.println(stack);
		
		System.out.println("------");
		
		System.out.println(stack.pop()); 
		System.out.println(stack.pop());
		
		System.out.println("-------------");
		
		System.out.println(stack);
		System.out.println(stack.size());
		
		System.out.println(stack.empty());		// 
//		System.out.println(stack.isEmpty());	// 
		
		System.out.println("--------------");
		
		stack.push("Grape");
		stack.push("Orange");
		stack.push("Peach");
		
		
		// stack 비어있지 않으면 반복한다
		// stack 에 데이터가 있으면 반복한다
		while(!stack.empty()) {
			System.out.println(stack.pop());
		}
		
		
		
		
	}

}
