
public class StackGenericMain {

	public static void main(String[] ar){
		ArrayStackGeneric<String> stack = new ArrayStackGeneric();
		stack.push("apple");
		stack.push(stack.pop());
		stack.push("banana");
		stack.push("orange");
		
		stack.peek();
		stack.printStack();
		
		ArrayStackGeneric<String> stack1 = new ArrayStackGeneric();
		/// dequeue();
		while(!stack.isEmpty()) {
			stack1.push(stack.pop());
		}
		System.out.println("stack1 print");
		stack1.printStack();
		System.out.println(stack1.pop());
		while(!stack1.isEmpty()) {
			stack.push(stack1.pop());
		}
		stack.printStack();
		
		
		

	}
	 
}
