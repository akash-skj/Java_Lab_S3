import java.util.Scanner;
public class Prime
{
  public static void main(String[] args)
  {
    int n,flag=0;
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
    for(int i=2; i<=n/2 ; i++)
    {
      if(n%i==0)
      {
        flag=1;
        break;
      }
    }
    if(flag==0)
    System.out.println("The number is prime");
    else
    System.out.println("The number is not prime");
  }
}
