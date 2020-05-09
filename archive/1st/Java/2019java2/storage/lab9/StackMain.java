
public class StackMain {
	
	public static void main(String arg[]){
	    //Array를 사용한 스택
		ArrayStack stack1 = new ArrayStack();
		stack1.push(10);
		stack1.push(30);
		stack1.push(80);
		stack1.push(200);
		stack1.push(70);
		stack1.push(250);
		stack1.push(277);
		stack1.push(999);
		stack1.delete();
		System.out.println(stack1.stackFull());
		System.out.println("peeked value " + stack1.peek());
		while(!stack1.empty()){
			System.out.print(stack1.pop()+", ");
		}
		System.out.println();
		if(stack1.empty()) { 
			System.out.println("Stack Empty");
		} else  { 
			System.out.println("Stack not empty");
		}

		// linkedList를 사용한 스택
		LinkStack stack2=new LinkStack();
		stack2.push(10);
		stack2.push(20);
		stack2.push(30);
		stack2.peek();	//30 20 10
		stack2.delete();	//20 10
		System.out.println(stack2.pop());	//print 20, 10
		System.out.println(stack2.pop());	//print 10, empty
		System.out.println(stack2.pop());
		System.out.println(stack2.pop());
	}
}
