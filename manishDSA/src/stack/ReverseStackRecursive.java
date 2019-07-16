/**
 * 
 */
package stack;

import java.util.Stack;

/**
 * @author Manish
 *
 */
public class ReverseStackRecursive {
	static Stack<Integer> stack = new Stack<Integer>();
	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		stack.push(5);
		stack.push(4);
		stack.push(3);
		stack.push(2);
		stack.push(1);
		System.out.println(stack);
		reverseStack(stack);
		System.out.println(stack);
	}

	private static void reverseStack(Stack<Integer> stack) {
		if(!stack.isEmpty()){
			int temp = stack.peek();
			stack.pop();
			reverseStack(stack);
			insertInStack(temp);
		}
		
	}

	private static void insertInStack(int temp) {
		if(stack.isEmpty()){
			stack.push(temp);
		}else{
			int temp1 = stack.peek();
			stack.pop();
			insertInStack(temp);
			stack.push(temp1);
		}
		
	}

}
