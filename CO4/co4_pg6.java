package check;
import java.util.*;

class th1 implements Runnable{
	int n,a=0,b=1,sum;
	th1(int n){
		this.n=n;
	}
	public synchronized void run() {
		try {
			System.out.println("Fibonacci series    Even numbers");
			System.out.println(a+" "+b);
			for(int i=1;i<=10;i++) {
				sum=a+b;
				System.out.println(sum);
				a=b;
				b=sum;
				Thread.sleep(500);
			}
		}
		catch(InterruptedException e) {
			System.out.println("Exception caught : "+e.getMessage());
		}
	}
}
class th2 implements Runnable{
	int n;
	th2(int n){
		this.n=n;
	}
	public synchronized void run() {
		try {
			for(int i=1;i<=n;i++) {
				if(i%2==0) {
					System.out.println("                           "+i);
					Thread.sleep(500);
				}
			}
		}
		catch(InterruptedException e) {
			System.out.println("Second thread end "+e.getMessage());
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
		o1.start();
		th2 obj2=new th2(n);
		Thread o2=new Thread(obj2);
		o2.start();
	}
}
