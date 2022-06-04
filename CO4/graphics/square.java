package graphics;
interface squ{
	void area(int s);
}
public class square implements squ{
	public void area(int s) {
		System.out.println("Area of square :"+s*s);
	}
}
