public class MyQueueSim {
    public static void main(String[] args) {
        ArrayStack<String> s1 = new ArrayStack<>();
        ArrayStack<String> s2 = new ArrayStack<>();

        s1.push("Kim");
        s1.push("Lee");
        s1.push("Park");
        s1.push("Yoo");
        s1.push("Hong");

        while (s1.size() != 1) {
            s2.push(s1.pop());
        }

        String tmp = s1.pop();

        while (!s2.isEmpty()) {
            s1.push(s2.pop());
        }
        s1.push(tmp);

        System.out.println(s1.peek());
    }
}
