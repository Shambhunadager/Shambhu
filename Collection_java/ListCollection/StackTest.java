package ListCollection;

import java.util.Stack;

public class StackTest {

	public static void main(String[] args) {
	
		Stack stack=new Stack();
		stack.push('a');
		stack.push('b');
		stack.push('c');
		stack.push('d');
		stack.pop();
		
		
		System.out.println(stack.peek());
		System.out.println(stack);
		
		
	}

}
