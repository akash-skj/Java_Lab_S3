import java.util.Scanner;
public class Factorial_of_n
{
  public static void main(String[] args) {
    int n, fact=1;
    Scanner obj = new Scanner(System.in);
    n = obj.nextInt();
    for(int i = n ; i>0 ; i--)
    {
      fact= fact*i;
    }
    System.out.println("The Factorial of "+n+" is "+fact);
  }
}
