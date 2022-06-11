package check;
import java.util.*;

class th1 implements Runnable{
	int n,a=0,b=1,sum;
	th1(int n){
		this.n=n;
	}
	public synchronized void run() {
			System.out.println("Fibonacci series    Even numbers");
			System.out.println(a+" "+b);
			for(int i=1;i<=10;i++) {
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
			}
	}
}
class th2 implements Runnable{
	int n;
	th2(int n){
		this.n=n;
	}
	public synchronized void run() {
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println("                           "+i);
				}
			}
	}
}
public class co4_pg6 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		th1 obj1=new th1(n);
		Thread o1=new Thread(obj1);
		th2 obj2=new th2(n);
		Thread o2=new Thread(obj2);
		o1.start();
		o2.start();
	}
}
