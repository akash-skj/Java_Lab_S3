import java.util.Scanner;
public class Amstrong {
    public static void main(String[] args) {
        int n, res = 0, rem ,comp;
        Scanner obj = new Scanner(System.in);
        n=obj.nextInt();
        comp=n;
        while( n != 0 )
        {
            rem = n % 10;
            res = res+(rem*rem*rem);
            n = n/10;
        }
        if(res==comp)
            System.out.println(comp + " is amstrong "+res);
        else
            System.out.println(comp + " is not amstrong "+res);
    }
}
