import java.util.Scanner;
public class Odd_or_eve
{
  public static void main(String[] args) {
    int n;
    Scanner obj = new Scanner(System.in);
    n=obj.nextInt();
    if(n%2==0)
      System.out.println("The Number is Even");
    else
      System.out.println("The number is odd");
  }
}
