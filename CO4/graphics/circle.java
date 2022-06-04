package graphics;

interface cir{
	void area(int r);
}
public class circle implements cir {
	public void area(int r) {
		System.out.println("Area of circle :"+3.14*r*r);
	}
}
