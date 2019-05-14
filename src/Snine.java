import java.util.Scanner;
public class Snine
{
    public static void main(String[] args)
    {
        System.out.println("Enter string to reverse:");

        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        String r = "";


        for(int i = str.length() - 1; i >= 0; i--)
        {
            r = r + str.charAt(i);
        }

        System.out.println("Reversed string is:");
        System.out.println(r);
    }
}