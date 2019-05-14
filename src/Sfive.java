import java.util.Scanner;
public class Sfive {
    public static void main(String args[])
    {
        int num,sum=0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the number");
        num=sc.nextInt();
        System.out.println("Enter the number elements");
        for(int i=1;i<=num;i++)
        {
            int a=sc.nextInt();
            sum=sum+a;
        }
        System.out.println(sum);
    }
}
