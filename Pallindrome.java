import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        int n, rev= 0, rem, comp;
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt();
        comp = n;
        while( n != 0 )
        {
            rem = n % 10;
            rev = rev * 10 + rem;
            n = n/10;
        }
        if(rev==comp)
            System.out.println(comp + " is palindrome");
        else
            System.out.println(comp + " is not palindrome");
    }
}
