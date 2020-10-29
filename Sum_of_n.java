import java.util.Scanner;
public class  Sum_of_n
{
  public static void main(String[] args) {
    int n,sum=0;
    Scanner obj = new Scanner(System.in);
    n=obj.nextInt();
    for(i=n ; i >0 ; i--)
    {
      sum=sum+i;
    }
    System.out.println("Sum of "+n" numbers are "+sum );
  }
}
