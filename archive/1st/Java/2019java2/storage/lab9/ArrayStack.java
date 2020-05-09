
class ArrayStack {
	int max=5;
	int increment=5; // ?????? ??? ??? ???? ??? ?????
	int stack[]=new int[max];
	int tmpStack[];
	private int top;
	public ArrayStack(){
		top=-1;
	}
	public boolean stackFull(){
		if(top == max - 1) { 
			return true;
		} else { return false;}
	}
	void push(int x){
		top=top+1;
		if(top >= max){
			System.out.println("Stack Overflow. Resize");

			tmpStack = new int[max+increment];
			System.arraycopy(stack, 0, tmpStack, 0, max);
			max = max + increment;
			stack = tmpStack;
		}
        stack[top]=x;
	}
	int peek() {	//examine stack top element
		int y=0;
		if (top<0) {
			System.out.println("Stack is empty");
			return -1;
		} else {
			y = stack[top];
		}
		return y;
	}
	int pop() {
		int y=0;
		if (top<0) {
			System.out.println("Stack Underflow");
			return y;
		}
		else {
			y = stack[top];
			top=top-1;
			half();
		}
		return y;
	}
	void delete(){	//delete stack top element
		if (top<0) {
			System.out.println("Stack is empty");
		} else {
			top = top-1;
			half();
		}
	}
	boolean empty(){
		if(top<0){return true;}
		else return false;
	}
	void half() {
		if (top < max/2) {
			tmpStack = new int[max/2];
			System.arraycopy(stack,0,tmpStack,0, max/2);
			max = max/2;
			stack = tmpStack;
		}
	}
}
