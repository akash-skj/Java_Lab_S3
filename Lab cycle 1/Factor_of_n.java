import java.util.Scanner;
public class Factor_of_n
{
  public static void main(String[] args) {
    int n;
    Scanner obj = new Scanner(System.in);
    n=obj.nextInt();
    System.out.println("The factors of "+n+" are : ");
    for(int i= 1; i<=n ; i++)
    {
      if(n%i==0)
        System.out.println(i);
    }
  }
}
