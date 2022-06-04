package arithmetic;

interface cal{
	void add(int n1,int n2);
	void sub(int n1,int n2);
	void mul(int n1,int n2);
	void div(int n1,int n2);
	
}
public class calculate implements cal{
	public void add(int n1,int n2) {
		System.out.println("Addition :"+(n1+n2));
	}
	public void sub(int n1,int n2) {
		System.out.println("Subtraction :"+(n1-n2));
	}
	public void mul(int n1,int n2) {
		System.out.println("Multiplication :"+(n1*n2));
	}
	public void div(int n1,int n2) {
		System.out.println("Division :"+(float)(n1/n2));
	}
}
