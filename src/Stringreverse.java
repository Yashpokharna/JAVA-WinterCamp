public class Stringreverse {
    public static void main(String args[]) {
        String s[] = "My name is yash".split(" ");
        String ans = "";
        for (int i = s.length - 1; i >= 0; i--) {
            ans += s[i] + " ";
        }
        System.out.println("Reversed String: " + ans);
    }
}

