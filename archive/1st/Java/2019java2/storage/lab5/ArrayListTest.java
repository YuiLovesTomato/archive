import java.util.ArrayList;

public class ArrayListTest {

    public static void main(String[] args) {
        ArrayList<String> alist = new ArrayList<String>();

        //insert 10 strings
        alist.add("A");
        alist.add("B");
        alist.add("C");
        alist.add("D");
        alist.add("E");
        alist.add("F");
        alist.add("G");
        alist.add("H");
        alist.add("I");
        alist.add("J");

        //printing alist
        System.out.println("<alist>");
        System.out.println(alist);

        //printing fifth element
        System.out.println("<printing 5th element>");
        System.out.println(alist.get(4));

        //removing fifth element
        System.out.println("<5th element removed>");
        alist.remove(5);
        System.out.println(alist);

        //printing number of elements
        System.out.println("<number of elements>");
        System.out.println(alist.size());

        //printing -3rd element
        System.out.println("<printing size-3rd element>");
        System.out.println(alist.get(alist.size()-3));

        //printing every elements
        System.out.println("<printing every elements>");
        for (String str:alist) {
            System.out.println(str);
        }

        //check is there "Kim"
        System.out.println("<checking if there's element 'Kim'>");
        if (alist.indexOf("Kim") != -1) {
            System.out.println(alist.indexOf("Kim"));
        } else {
            System.out.println("cannot found");
        }
    }
}
