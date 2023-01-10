public class StringMethods {
    public static void main(String[] args) {
        String s = "Yash";
        String s1 = "My name is yash pokharna.";
        System.out.println(s.startsWith("Y"));
        System.out.println(s.endsWith("h"));

        System.out.println(s.charAt(0));
        System.out.println(s.charAt(3));

        System.out.println(s.length());

        String replace = s1.replace("yash", "adarsh");
        System.out.println(replace);
    }
}
