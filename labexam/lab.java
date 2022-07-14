import java.util.*;

public class oopslab {
	public static void main(String args[]){
		int a=0,b=0,ch=0;
		Scanner sc=new Scanner(System.in);
		System.out.println("1. Read values");
		System.out.println("2. Sum");
		System.out.println("3. Difference");
		System.out.println("4. Multiplication");
		System.out.println("5. Division");
		System.out.println("6. Exit");
		do{
			System.out.println("Enter your choice");
			ch=sc.nextInt();
			switch(ch){
				case 1:System.out.println("Enter two values");	
						a=sc.nextInt();
						b=sc.nextInt();
						break;
				case 2:System.out.println(a+"+"+b+"="+(a+b));
						break;
				case 3:System.out.println(a+"-"+b+"="+(a-b));
						break;
				case 4:System.out.println(a+"*"+b+"="+(a*b));
						break;
				case 5:System.out.println(a+"/"+b+"="+(a/b));
						break;
				case 6:System.out.println("Exiting...");
						break;
				default:System.out.println("Invalid choice");
			}
		}while(ch!=6);
	}
}
