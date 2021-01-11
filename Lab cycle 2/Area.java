import java.util.Scanner;

public class Area{
	double area;
	Area(double l, double b)
	{
		area=l*b;
	}
	Double returnArea()
	{
		return this.area;
	}
	public static void main(String[] args) {
		Scanner myObj= new Scanner(System.in);
		System.out.println("Enter the length and breadth of the rectangle : ");
		double l= myObj.nextDouble();
		double b= myObj.nextDouble();
		Area obj = new Area(l,b);
		double area;
		area= obj.returnArea();
		System.out.println("Area = "+ area);
	}
}