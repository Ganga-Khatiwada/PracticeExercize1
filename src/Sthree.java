import java.util.Scanner;

public class Sthree {
    public static void main(String args[])
    {
        String str;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a word");
        str=sc.nextLine();
        int n=str.length();
        for(int i=0;i<=n;i++)
        {
            char c=str.charAt(i);
            if(c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u')
            {
                System.out.println(c+"-vowel");
            }
            else if(c>='a' && c<='z')
            {
                System.out.println(c+"-consonant");
            }
            else
            {
                System.out.println("error");
            }
        }
    }
}