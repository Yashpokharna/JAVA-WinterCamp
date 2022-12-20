import java.util.Scanner;

public class que3Ass2 {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter the string: ");
        String word = keyboard.next();
        while (!word.equals("done"))
        {
            if (word.charAt(0)==word.charAt(word.length()- 1)) {
                System.out.println("First and last letter are equal: ");
            } else {
                System.out.println("First and last letter are not equal: ");
            }
            word = keyboard.next();
        }
    }
}
