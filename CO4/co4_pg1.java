
import java.util.*;
import graphics.rectangle;
import graphics.triangle;
import graphics.circle;
import graphics.square;

public class co4_pg1 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int s,l,b,r;
		rectangle rectangle = new rectangle();
		triangle triangle = new triangle();
		circle circle = new circle();
		square square = new square();
		
		
		System.out.println("Enter the length of the rectangle :");
		l=sc.nextInt();
		System.out.println("Enter the breadth of the rectangle :");
		b=sc.nextInt();
		rectangle.area(l,b);
		System.out.println("Enter the height of the triangle :");
		l=sc.nextInt();
		System.out.println("Enter the base of the triangle :");
		b=sc.nextInt();
		triangle.area(l,b);
		System.out.println("Enter the side of square :");
		s=sc.nextInt();
		square.area(s);
		System.out.println("Enter the radius of circle :");
		r=sc.nextInt();
		circle.area(r);
	}
}
