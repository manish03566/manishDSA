package stack;

public class DynamicStack {
	private int stackArray[];
	public int top = -1;
	public int size;
	public static final int  DEFAULT_SIZE=2;
	public DynamicStack() {
		this.size = DEFAULT_SIZE;
		stackArray = new int[size];
	}
	public DynamicStack(int size) {
		this.size = size;
		stackArray = new int[size];
	}
	public void push(int pushedElement){
		if(isFull()){
			resizeStack();
		}
		top = top+1;
		stackArray[top] =  pushedElement;
	}
	public int pop() throws Exception{
		if(isEmpty()) {
			throw new Exception("There is no element on stack to pop out");
		}
		top = top-1;
		return stackArray[top];
	}
	public int peek() {
		return stackArray[top];
	}
	public boolean isEmpty() {
		if(top==-1)
			return true;
		else return false;
	}
	private void resizeStack() {
		int helperArray[] = new int[size*2];
		for(int i =0;i<size;i++){
			helperArray[i]=stackArray[i];
		}
		stackArray=helperArray;
		size=size*2;
	}
	public boolean isFull(){
		if(top==stackArray.length-1)
			return true;
		else 
			return false;
		
	}
	public void printStackElements() {
		if(isEmpty()) {
			System.out.println("There is no element in stack to print");
		}
		for(int i=top;i>=0;i--) {
			System.out.println(stackArray[i]);
		}
	}
	
}
