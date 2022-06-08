
import java.util.Scanner;
import graphics.inter;
import graphics.rectangle;
import graphics.square;
import graphics.triangle;
import graphics.circle;


public class packagenew
{

public static void main(String args[])
{
int ch;
Scanner sc=new Scanner(System.in);
do
{
System.out.println("-------------------------------------------------------------");
System.out.println("MENU \n 1.circle\n2.rectangle\n 3.triangle\n4.square\n5.EXIT");
System.out.println("ENTER YOUR CHOICE");
 ch=sc.nextInt();
switch(ch)
{
case 1:	
	{
	circle c=new circle();
	c.area();
    break;
	}
case 2:
	{
	rectangle b=new rectangle();
	b.area();
	break;
	}

case 3:
	{
	triangle v=new triangle();
	v.area();
	break;
	}
case 4:
	{
	square z=new square();
	z.area();
	break;
	}
default:
	System.out.println("invalid choice");
	break;
}
}
while(ch!=5);
}
}