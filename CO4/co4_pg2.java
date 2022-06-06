
import java.util.*;

import arithmetic.calculate;

public class co4_pg2 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		calculate calculate = new calculate();
		int i,j;
		System.out.println("Enter the two numbers");
		i=sc.nextInt();
		j=sc.nextInt();
		calculate.add(i,j);
		calculate.sub(i,j);
		calculate.mul(i,j);
		calculate.div(i,j);
	}
}
