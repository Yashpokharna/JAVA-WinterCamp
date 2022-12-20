import java.util.Arrays;
public class que1Ass3 {
    public static int[] Arr0and1(int arr[])
    {
        int count=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==0)
            {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i]=0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i]=1;
        }
        return arr;
    }
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,0,0,1,1,0};
        int[] ans = Arr0and1(arr);
        System.out.println(Arrays.toString(ans));
    }
}
