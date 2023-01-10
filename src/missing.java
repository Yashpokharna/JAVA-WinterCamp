public class missing {

    public static void main(String[] args) {

        int[] arr={3,1,4};
        System.out.println("Missing number: "+missingNumber(arr));
    }
    public static int missingNumber(int[] arr)
    {
        int n=arr.length+1;
        int sum=n*(n+1)/2;
        int remainingSum=0;
        for (int i = 0; i < arr.length; i++) {
            remainingSum+=arr[i];
        }
        int missingNumber=sum-remainingSum;
        return missingNumber;
    }
}