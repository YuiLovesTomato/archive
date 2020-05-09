public class InfixMain {
    public static void main(String[] args) {
        String exp = "1*(3-2)+((6-2)/4)";

        String expModified;

        expModified = InfixToPostfix.calc(exp);
        System.out.println(expModified);

        System.out.println("Postfix Evaluation : " + ArrayEvalPostfix.calc(expModified));
        expModified = InfixToPostfix.calc(exp);
        System.out.println("Postfix Evaluation : " + ListEvalPostfix.calc(expModified));
        expModified = InfixToPostfix.calc(exp);
        System.out.println("Postfix Evaluation : " + UtilStack.calc(expModified));
    }
}
