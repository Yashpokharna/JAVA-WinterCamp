import java.util.Arrays;

public class sort {
    public static void main(String[] args) {
        int arr[] = {-10,-6,-7,-1,4,8,6};
        move(arr);
        for (int e : arr)
            System.out.print(e + " ");
    }
    public static void move(int[] arr){
        Arrays.sort(arr);
    }
}
