package stack;

import java.util.Stack;

public class BalancedParenthesisCheck {

	public static void main(String[] args) {
		String inputString = "{()}[]";
		System.out.println(balancedParenthesisCheck(inputString));
	}
	public static boolean checkIfBracesArePair(char input1,char input2 ){
		if(input1=='('&&input2==')')
			return true;
		if(input1=='{'&&input2=='}')
			return true;
		if(input1=='['&&input2==']')
			return true;
		return false;
	}
	public static boolean balancedParenthesisCheck(String input){
		Stack<Character> helperStack = new Stack<Character>();
		for(char c : input.toCharArray()){
			if('('==c||'{'==c||'['==c){
				helperStack.push(c);
			}
			else{
				if(')'==c||'}'==c||']'==c){
					if(helperStack.isEmpty())
						return false;
					else if(!checkIfBracesArePair(helperStack.pop(), c)){
						return false;
					}
				}
			}
		}
		if(helperStack.isEmpty())
			return true;
		else return false;
	}
}

