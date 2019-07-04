package stack;

import java.util.Stack;

public class StockSpan {

	public static void main(String[] args) {
		int price[] = { 10, 4, 5, 90, 120, 80 }; 
        int n = price.length; 
        int S[] = new int[n]; 
        calculateSpan(price, n, S); 
        for(int i : S){
        	System.out.println(i);
        }
	}

	private static void calculateSpan(int[] price, int n, int[] s) {
		Stack<Integer> helperStack = new Stack<Integer>();
		helperStack.push(0);
		s[0]=1;
		for(int i=1;i<price.length;i++){
			while(!helperStack.isEmpty()&&price[helperStack.peek()]<=price[i]){
				helperStack.pop();
			}
			s[i] = helperStack.isEmpty()?i+1:i-helperStack.peek();	
			helperStack.push(i);
		}
	}

}
