import java.util.Scanner;

public class co3_pg6 {
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		int ch;
		Inter I;
		Circle obj1= new Circle();
		
		Rect obj2=new Rect();
		System.out.println("Area of Circle");
		I=obj1;
		obj1.area();
		System.out.println("Perimeter of Circle");
		obj1.perimeter();
		System.out.println("Area of Rectangle");
		I=obj2;
		obj2.area();
		System.out.println("Perimeter of Rectangle");
		obj2.perimeter();		
		
	}
}

interface Inter{
	void area();
	void perimeter();

}

class Circle implements Inter{
	public void area(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt();
		System.out.println("Area of Circle= "+(3.14*r*r));
		
	}
	public void perimeter(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the radius");
		int r=s.nextInt();
		System.out.println("Perimeter of Circle= "+(2*3.14*r));
	}
}

class Rect implements Inter{
	public void area(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the l and b");
		int l=s.nextInt();
		int b=s.nextInt();
		System.out.println("Area of Rectangle= "+(l*b));
		
		
	}
	
	public void perimeter(){
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the l and b");
		int l=s.nextInt();
		int b=s.nextInt();
		System.out.println("Perimeter of Rectangle= "+(2*(l+b)));
	}
}
