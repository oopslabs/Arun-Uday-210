import java.util.*;

interface Shape{
	void area(int i,int j);
	void perimeter(int i,int j,int k);
}
class Triangle implements Shape{
	public void area(int i,int j) {
		System.out.println("Area of triangle:"+(0.5*i*j));
	}
	public void perimeter(int i,int j,int k) {
		System.out.println("Perimeter of triangle:"+(i+j+k));
	}
}
class Circle1 implements Shape{
	public void area(int i,int j) {
		System.out.println("Area of Circle:"+(3.14*i*i));
	}
	public void perimeter(int i,int j,int k) {
		System.out.println("Perimeter of circle:"+(2*(3.14*i)));
	}
}
public class lab1 {
	public static void main(String args[]) {
		Scanner sc =new Scanner(System.in);
		Triangle tri=new Triangle();
		Circle1 cir=new Circle1();
		System.out.println("Enter the side of triangle :");
		int s1=sc.nextInt();
		System.out.println("Enter the base of triangle :");
		int s2=sc.nextInt();
		System.out.println("Enter the height of triangle :");
		int s3=sc.nextInt();
		tri.area(s2,s3);
		tri.perimeter(s1,s2,s3);
		System.out.println("Enter the radius of circle :");
		int r=sc.nextInt();
		cir.area(r,s1);
		cir.perimeter(r,s1,s2);
		
	}
}
