import java.util.Stack;

class MyNode {
    public int id;
    public String name;
    public MyNode(int id, String name){
        this.id =id;
        this.name=name;
    }
    public MyNode() {

    }
    public void printMyNode() {
        System.out.println(id+name);
    }

}
public class MyGeneric {

    public static void main(String[] ar) {
        MyNode node1, node2;
        node1 = new MyNode();
        node1.id = 1;
        node1.name="Kim";
        Stack<MyNode> stack1 = new Stack<>();
        stack1.push(node1);
        node2=stack1.pop();
        System.out.println(node2.id+node2.name);
        node1 = new MyNode(2,"Lee");
        stack1.push(node1);
        node2=stack1.pop();
        node2.printMyNode();

    }
}