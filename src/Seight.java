import java.util.Scanner;
public class Seight
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        int target=75;
            for(int i=1;i<100;i++)
            {
                while (i==1)
                {
                    System.out.println("Enter the number to be guessed");
                    int n=sc.nextInt();
                    if (n > target)
                    {
                        System.out.println("Number guessed is more than original number");
                    }
                    else if (n < target)
                    {
                        System.out.println("Number guessed is less than original number");
                    }
                    else
                    {
                        System.out.println("Number guessed matches the original number");

                    }
                }
            }
    }
}
