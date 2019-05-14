import java.util.Scanner;

public class Stwo{
    public static void main(String args[])
    {
        int num;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter num");
        num=sc.nextInt();
        if(num%2==0)
        {
            if(num>20 && num<30)
            {
                System.out.println("Jerry");
            }
        }
        else
        {
            System.out.println("Tom");
        }

    }
}
