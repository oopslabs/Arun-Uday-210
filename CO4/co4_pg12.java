package hello;
import java.util.*;
public class co4_pg12 {
	public static void main(String[] args){
		Stack<String> st=new Stack<>();
		Scanner sc=new Scanner(System.in);
		String str;
		System.out.println("Enter the number of items");
		int n=sc.nextInt(); 
		sc.nextLine();	
		System.out.println("Enter the elements");
		for(int i=0;i<n;i++){
			str=sc.nextLine();
			st.push(str);
		}	
		
		System.out.println(st);
		
		System.out.println("Enter the position of element to be deleted");
		int sp=sc.nextInt();
		st.remove(sp);
		System.out.println(st);
	}
}
