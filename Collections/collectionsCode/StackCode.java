package collectionsCode;

import java.util.Stack;

// push(), 
// pop()- removes top element 
// peek()-returns top element
// empty()-returns boolean 
// search()-returns offset else -1

public class StackCode {
	public static void main(String[] args) {
		Stack s = new Stack<>();
		s.push("a");
		s.push(1);
		s.push("apple");
		s.push(null);
		System.out.println(s);
		s.add("A");
		System.out.println(s);
		System.out.println(s.search(1));
		System.out.println(s.peek());
		System.out.println(s.empty());
		s.pop();
		System.out.println(s);
		
		
	}
}
