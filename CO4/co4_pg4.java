package check;
import java.util.*;

class inputException extends Exception{
	public inputException(String msg) {
		super(msg);
	}
}
public class co4_pg4 {
	public static void main(String args[]) {
		int num,i,n,sum=0;
		float avg;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size");
		n=sc.nextInt();
		for(i=0;i<n;i++) {
			try {
					System.out.println("Enter the number");
					num=sc.nextInt();
					if(num<0) {
						i--;
						throw new inputException("Only positive numbers");
					}
					sum=sum+num;
			}
			catch(inputException e) {
				System.out.println("Exception caught :"+e.getMessage());
			}
		}
		avg=sum/n;
		System.out.println("Average :"+avg);
	}
}
