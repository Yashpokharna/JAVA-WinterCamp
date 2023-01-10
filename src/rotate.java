import java.util.Arrays;

public class rotate {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        int k = 2;
        int d = 2;
        if(d==1){
            Right(arr, k);
            return;
        }else{
            Left(arr,k);
            return;
        }
    }
    public static void reverse(int[] arr,int start,int end){
        while(start<end){
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }
    public static void Right(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k-1);
        reverse(arr,k,arr.length-1);
        System.out.println(Arrays.toString(arr));
    }
    //1 2 3 4 5
    //5 4 3 2 1
    //3 4 5 1 2
    public static void Left(int[] arr,int k){
        reverse(arr,0,arr.length-1);
        reverse(arr,0,k);
        reverse(arr,k+1,arr.length-1);

        System.out.println(Arrays.toString(arr));
    }
}

