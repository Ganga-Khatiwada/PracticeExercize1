import java.util.Scanner;
public class Sten
{
        public static void main(String args[])
        {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter the string:");
            String s=sc.next();
            System.out.println("Enter the number");
            int n=sc.nextInt();
            int i=s.length();
            String s1="";
            for(int j=i-1;j>=i-n;j--)
            {
                s1 = s.charAt(j)+s1;
            }
            System.out.print(s);
            while (n!=0)
            {
                System.out.print(s1);
                n--;
            }
        }
}
