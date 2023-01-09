import java.util.ArrayList;
import java.util.LinkedList;
public class List {
    public static void main(String[] args) {
        ArrayList<Integer> num = new ArrayList<>();
        long start = System.nanoTime();
        num.add(1);
        num.add(2);
        num.add(3);
        num.add(4);
        System.out.println(num);
        long end = System.nanoTime();
        long execution = (end-start);
        System.out.println("Execution time is: "+execution+" nano seconds");

        LinkedList<String> ll = new LinkedList<>();
        long start1 = System.nanoTime();
        ll.add("Yash");
        ll.add("adarsh");
        ll.add("shivam");
        ll.add("utkarsh");

        System.out.println(ll);
        long end1 = System.nanoTime();
        long execution1 = (end1-start1);
        System.out.println("Execution time is: "+execution1+" nano seconds");
    }
}
