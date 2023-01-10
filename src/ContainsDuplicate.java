import java.util.Arrays;

public class ContainsDuplicate {
    static boolean containsDuplicate(int[] arr){
        Arrays.sort(arr);
        for(int i=0;i<=arr.length;i++){
            for(int j=1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] arr = {1 ,2, 3};
        boolean ans = containsDuplicate(arr);
        System.out.println(ans);
    }
}
