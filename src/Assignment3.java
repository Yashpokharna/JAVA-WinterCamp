import java.util.Arrays;
import java.util.Scanner;

public class Assignment3 {
    public static void main(String[] args) {
        int[] arr = {0,1,0,1,1,0,0,0,1,1,0};
        int[] ans = Arr0and1(arr);
        System.out.println(Arrays.toString(ans));
        que3(arr);
        max(arr);
        System.out.println("smallest: "+que3(arr));
        System.out.println("Largest: "+max(arr));
    }
    public static int[] Arr0and1(int[] arr) {
        int count = 0;
        for (int j : arr) {
            if (j == 0) {
                count++;
            }
        }
        for (int i = 0; i < count; i++) {
            arr[i] = 0;
        }
        for (int i = count; i < arr.length; i++) {
            arr[i] = 1;
        }
        return arr;
    }

    public static void reverse(int[] arr, int start, int end) {
        while (start <= end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void que2(String[] args) {
        int[] arr = {1, 2, 3, 4, 5, 6, 7};
        // 7 6 1 2 3 4 5
        int k = 2;
        reverse(arr, 0, arr.length - 1);
        reverse(arr, 0, k - 1);
        reverse(arr, k, arr.length - 1);

        System.out.println(Arrays.toString(arr));
    }

    static int que3(int[] arr) {
        int min = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) {
                min = arr[i];
            }
        }
        return min;
    }

    static int max(int[] arr) {
        int max = arr[0];
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
            }
        }
        return max;
    }

    static void que4() {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("number of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                if (a[i] > a[j]) {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Third:" + a[n - 3]);
        System.out.println("Smallest:" + a[0]);
    }

    static void minDist(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
            }
        }
    }
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