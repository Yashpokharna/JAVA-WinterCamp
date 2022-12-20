import java.util.Arrays;

public class que7Ass3 {
    static void que7() {
        int[] arr = {1,2,3};
        int k = arr[0];
        int i;
        for (i = 0; i < arr.length-1; i++) {
            arr[i] = arr[i+1];
        }
        arr[i] = k;
        System.out.println(Arrays.toString(arr));
    }
}
