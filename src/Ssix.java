import java.util.Scanner;
public class Ssix {
    public static void main(String args[])
    {
        char ch;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the character");
        ch=sc.next().charAt(0);
        if(ch>='a'&& ch<='z')
        {
            System.out.println("Small letter");
        }
        else if(ch>='A' && ch<='Z')
        {
            System.out.println("Capital letter");
        }
        else if(ch>='0' && ch<='9')
        {
            System.out.println("Digits");
        }
        else
        {
            System.out.println("Special symbol");
        }
    }
}
