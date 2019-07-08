package stack;

import java.util.Stack;

public class RedundantBraces {

public static void main(String[] args) {
	String input = "(a + (a + b))";
	char[] inputArr = input.toCharArray();
	boolean output =  isRedundandantBraces(inputArr);
	System.out.println("Is the input having redundant braces : "+output);
}
	private static boolean isRedundandantBraces(char[] inputArr) {
		Stack<Character> helperStack = new Stack<Character>();
		for(int i=0;i<inputArr.length;i++){
			if(inputArr[i]==')'){
				boolean helperFlag = true;
				char top = helperStack.peek();
				helperStack.pop();
				while(top!='('){
					if(top=='+'||top=='-'||top=='*'||top=='/'){
						helperFlag=false;
					}
					top = helperStack.peek();
					helperStack.pop();
				}
				if(helperFlag)
					return true;
			}else{
				helperStack.push(inputArr[i]);
			}
		}
		return false;
	}

}
