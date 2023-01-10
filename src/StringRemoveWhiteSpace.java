public class StringRemoveWhiteSpace {
    public static void main(String[] args) {
        String str = "My name is Yash Pokharna";
        str = str.replaceAll("\\s+", "");
        System.out.println(str);
    }
}
