import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Enter string: ");
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine() ;
        for (int i = 0; i < str.length(); i++) {
            System.out.println(str.charAt(i));
        }

    }
}
//given sentence and reverse the sting
//remove duplicate
//remove white space
//replace character with its number of occourences
//longest substring without repeated character
//print all permutation of string in java
//string is thread safe or not
