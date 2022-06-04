package graphics;

interface rect{
	public void area(int len,int bre);
}
public class rectangle implements rect {
	public void area(int leng,int bre) {
		System.out.println("Area of rectangle :"+leng*bre);
	}
}
