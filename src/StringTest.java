public class StringTest {
    public static void main(String[] args) {
        final StringBuffer sb = new StringBuffer("Hello");
        sb.append("world");
        System.out.println(sb);
            //change hora hai kyuki final keyword jo hai wo variable pe kaam karta hai object par nahi
       final String s = "Yash";
       s.concat("pokharna");
        System.out.println(s);
        // yaha change nahi hua kyuki final keyword use kiya hai
    }
}
