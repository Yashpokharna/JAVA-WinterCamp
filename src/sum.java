import java.io.*;
public class sum {
//    public static void main(String[] args) {
//        int[][] arr = {
//                { 1 , 2 , 3 , 4},
//                { 5 ,6 , 7 , 8 },
//        };
//        for (int i = 0; i < arr.length; i++) {
//            for (int j = 0; j < arr.length; j++) {
//
//            }
//        }
//    }
//}

    static int M = 4;
    static int N = 4;
    static int sum(int arr[][])
    {
        int i, j;
        int sum = 0;
        for (i = 0; i < M; ++i) {
            for (j = 0; j < N; ++j) {
                sum = sum + arr[i][j];
            }
        }
        return sum;
    }
    public static void main (String[] args)
    {
        int i, j;
        int arr[][]= new int[M][N];
        int x = 1;
        for (i = 0; i < M; i++)
            for (j = 0; j < N; j++)
                arr[i][j] = x++;
        System.out.println(sum(arr));
    }
}

