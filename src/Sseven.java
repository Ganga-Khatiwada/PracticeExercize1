import java.util.Scanner;
public class Sseven
{
    public static void main(String[] args)
    {
        int n, temp, sum = 0;
        Scanner s = new Scanner(System.in);
        System.out.print("Enter number of elements you want : ");
        n = s.nextInt();
        int a[] = new int[n];
        System.out.println("Enter all the elements:");
        for (int i = 0; i < n; i++)
        {
            a[i] = s.nextInt();
        }
        for (int i = 0; i < n; i++)
        {
            for (int j = i + 1; j < n; j++)
            {
                if (a[i] < a[j])
                {
                    temp = a[i];
                    a[i] = a[j];
                    a[j] = temp;
                }
            }
        }
        System.out.print("Sorted number in non-increasing order:");
        for (int i = 0; i < n; i++)
        {
            System.out.print(a[i]);
            if (a[i] % 2 == 0)
            {
                sum = sum + a[i];
            }
        }
        System.out.println("\nSum of even numbers:"+sum);
        if (sum > 15)
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
    }
}