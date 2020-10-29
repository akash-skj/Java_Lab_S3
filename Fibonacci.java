import java.util.Scanner;
public class Fibonacci
{
  public static void main(String[] args) {
    int n , f = 0, s = 1 , sum=0;
    Scanner obj= new Scanner(System.in);
    n=obj.nextInt();
    System.out.print("First " + n + " terms: ");
    for (int i = 1; i <= n; i++)
       {
           System.out.print(f+" ");

           sum = f + s;
           f = s;
           s = sum;
       }
  }
}
