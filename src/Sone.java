import java.util.Scanner;
public class Sone{
    public static void main(String args[])
    {
        int num,rev=0,r,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter a number");
        num= sc.nextInt();
        int i= num;
        while (i>0)
        {
            r=i%10;
            if (r%2==0)
            {
                sum=sum+r;
            }
            rev=rev*10+r;
            i=i/10;
        }
        if (rev==num)
        {
            if (sum>25)
            {
                System.out.println(num +" is palindrome and the sum is greater than 25");
            }
            else
            {
                System.out.println(num + " is palindrome and sum is less than 25");
            }
        }
        else
            {
                System.out.println(num + " is not palindrome");
            }
    }
}