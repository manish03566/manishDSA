package stack;

import java.util.Stack;

public class MinLeft {

	public static void main(String[] args) {
		int arr[] = {3, 2, 6, 1, 8};
		arr = getMinElementOnLeft(arr);
		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}

	private static int[] getMinElementOnLeft(int[] arr) {
		Stack<Integer> helperStack = new Stack<Integer>();
		int arrResult[] = new int[arr.length];
		for(int i=0;i<arr.length;i++){
			while(!helperStack.isEmpty()&&helperStack.peek()>=arr[i])
				helperStack.pop();
			if(helperStack.isEmpty())
				arrResult[i] = -1;
			else
				arrResult[i] = helperStack.peek();
			helperStack.push(arr[i]);
		}
		return arrResult;
	}

}
