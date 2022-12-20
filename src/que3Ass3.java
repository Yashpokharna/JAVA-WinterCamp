public class que3Ass3 {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7};
        small(arr);
        max(arr);
        System.out.println("smallest: "+small(arr));
        System.out.println("Largest: "+max(arr));
    }
    static int small(int[] arr){
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]<min){
               min = arr[i];
            }
        }return min;
    }
    static int max(int[] arr){
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max){
                max = arr[i];
            }
        }return max;
    }
}
