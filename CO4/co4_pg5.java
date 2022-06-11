package check;
import java.util.*;

class t1 extends Thread{
	public synchronized void run() {
			System.out.println("Multiplication table    Prime numbers");
			for(int i=1;i<=5;i++) {
				System.out.println(i+" * "+5+" = "+i*5);
			}
	}
}
class t2 extends Thread{
	int n;
	t2(int n){
		this.n=n;
	}
	public synchronized void run() {
			for(int i=1;i<=n;i++) {
				int c=0;
				for(int j=i;j>=1;j--) {
					if(i%j==0) {
						c=c+1;
					}
				}
				if(c==2) {
					System.out.println("                           "+i);
				}
			}
	}
}
public class co4_pg5 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n;
		System.out.println("Enter the limit");
		n=sc.nextInt();
		t1 obj1=new t1();
		t2 obj2=new t2(n);
		obj1.start();
		obj2.start();
	}
}
