import java.util.Scanner;
import java.math.*;

public class AreaTriangle {
    
    public AreaTriangle() {
        int s1=3,s2=4,s3=5;
        double area;
        double peri=s1+s2+s3;
        double perihalf= peri/2;

        area= Math.sqrt(perihalf*(perihalf-s1)*(perihalf-s2)*(perihalf-s3));

        System.out.println("Area of the triangle is : "+area+"\nperimeter of the triangle is :"+peri);

    }

    public static void main(String[] args) {
        AreaTriangle obj = new AreaTriangle();
    }
}
