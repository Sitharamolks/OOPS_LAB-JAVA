package graphics;
import java.util.Scanner;

public class triangle implements inter
{
    Scanner sc=new Scanner(System.in);	
    double h,b;
    public void area()
    {
        System.out.println("Enter the height : ");
        h=sc.nextDouble();
        System.out.println("Enter the breadth : ");
        b=sc.nextDouble();
        System.out.println("Area of triangle = "+0.5*h*b);
    }
}
