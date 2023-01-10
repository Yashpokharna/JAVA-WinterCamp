class Greater {
    static void nextgreatest(int arr[], int n)
    {
        int next, i, j;
        for (i = 0; i < n; i++) {
            next = -1;
            for (j = i + 1; j < n; j++) {
                if (arr[i] < arr[j]) {
                    next = arr[j];
                    break;
                }
            }
            System.out.println(next);
        }
    }
    public static void main(String args[])
    {
        int arr[] = { 7,12,4,6,13,5 };
        int n = arr.length;
        nextgreatest(arr, n);
    }
}
