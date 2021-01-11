import java.util.Scanner;
public class AreaOL {
    
    void area(double l, double b){
        double a= l*b;
        System.out.println("Area of rectangle is "+a);
    }
    void area(double rad){
        double a=2*3.14*rad*rad;
        System.out.println("Area of circle is "+a);
        
    }

    public static void main(String[] args) {
        float l, b, rad ;
        Scanner myObj = new Scanner(System.in);
        AreaOL circle = new AreaOL();
        AreaOL rectangle = new AreaOL();
        System.out.println("Enter the length and breadth of the rectangle :");
        l=myObj.nextFloat();
        b=myObj.nextFloat();
        rectangle.area(l,b);
        System.out.println("Enter the radius of the circle :");
        rad=myObj.nextFloat();
        circle.area(rad);
        
    }
}