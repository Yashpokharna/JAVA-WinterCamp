import java.util.Scanner;
public class que4Ass3
{
        static void que4()
    {
        int n, temp;
        Scanner s = new Scanner(System.in);
        System.out.print("number of elements: ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] > a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.println("Third:"+a[n-3]);
        System.out.println("Smallest:"+a[0]);
    }
}
