import java.util.*;
public class Rectangle {
	int l,b,area,perimeter;
	Rectangle(int length, int breadth){
		l = length;
		b = breadth;
	}
	int rectArea(){
		return l*b;
	}
	int rectPeri(){
		return 2*(l+b);
	}
	public static void main(String[] args){
		int l,b;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the length");
		l = in.nextInt();
		System.out.print("Enter the breadth");
		b = in.nextInt();
		Rectangle obj1 = new Rectangle(l,b);
		System.out.println("Area of the rectangle : "+obj1.rectArea());
		System.out.println("Perimeter of the rectangle : "+obj1.rectPeri());
		System.out.print("Enter the length");
		l = in.nextInt();
		System.out.print("Enter the breadth");
		b = in.nextInt();
		Rectangle obj2 = new Rectangle(l,b);
		System.out.println("Area of the rectangle : "+obj2.rectArea());
		System.out.println("Perimeter of the rectangle : "+obj2.rectPeri());
		
	}
}
