import java.util.Stack;
public class MyStringCheck {

    public static void main(String[] ar){

        Stack<Character> stack1 = new Stack<>();
        Stack<Character> stack2 = new Stack<>();
        Stack<Character> stack3 = new Stack<>();
        String exp="aaabbbbbbccc";
        for (int i = 0; i < exp.length(); i++) {
            char c = exp.charAt(i);
            if (c == 'a') {
                stack1.push(c);
            }
            if (c == 'b') {
                stack2.push(c);
            }
            if (c == 'c') {
                stack3.push(c);
            }
        }
        if ((stack1.size() == stack3.size()) && (stack2.size() == stack1.size()*2)) {
            System.out.println("check was successful");
        } else {
            System.out.println("check was not successful");
        }

    }
}


