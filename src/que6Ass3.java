import java.util.Arrays;

public class que6Ass3 {
    static void que6() {
        int[] arr = {1,2,3,4,5,6,7};
        int n = arr.length;
        int[] newArr = new int[n+1];
        int value = 10;

        for (int i = 0; i < n; i++) {
            newArr[i] = arr[i];
        }
        newArr[n] = value;
        System.out.println(Arrays.toString(newArr));
    }
}
