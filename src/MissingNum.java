// LEETCODE MISSING NUMBER
import java.util.Arrays;

public class MissingNum {
    static int missing(int[] nums){
        Arrays.sort(nums);
        int n = nums.length;
        int sum1 = (n*(n+1))/2;
        int sum2 = 0;
        for (int i = 0; i < n; i++) {
            sum2+=nums[i];
        }
        return sum1-sum2;
    }
    public static void main(String[] args) {
        int[] nums = {3,0,1};
        System.out.println(missing(nums));
    }
}
