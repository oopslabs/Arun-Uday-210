package hello;
import java.util.*;
public class co3_pg1 {
	int length,breadth,r;
	int area(int l,int b) {
		this.length=l;
		this.breadth=b;
		return l*b;
	}
	int area(int ra) {
		this.r=ra;
		return r*r;
	}
	double area(double pi,int ra) {
		return (double)pi*ra*ra;
	}
	public static void main(String args[]) {
		Scanner in= new Scanner(System.in);
		System.out.println("Enter the length of rectangle");
		int length=in.nextInt();
		System.out.println("Enter the breadth of rectangle");
		int breadth=in.nextInt();
		System.out.println("Enter the radius of circle");
		int radius=in.nextInt();
		System.out.println("Enter the side of square");
		int s=in.nextInt();
		co3_pg1 obj=new co3_pg1();
		System.out.println("Area of the rectangle : "+obj.area(length,breadth));
		System.out.println("Area of the circle : "+obj.area(radius));
		System.out.println("Area of the square : "+obj.area(3.14,s));
		
	}
}
