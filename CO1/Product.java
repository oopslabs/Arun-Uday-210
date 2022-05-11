import java.util.*;
public class Product {
	int pcode,price;
	String pname;
	    void read(){
		Scanner sc= new Scanner(System.in);
		System.out.println("enter the pcode:");
		pcode=sc.nextInt();
		sc.nextLine();
		System.out.println("\nenter the pname:");
		pname=sc.nextLine();
		System.out.println("\nenter the price:");
		price=sc.nextInt();
		
	    }
	    void display(){
	    	System.out.println("\nThe pcode is:"+pcode);
	    	System.out.println("\nThe pname is:"+pname);
	    	System.out.println("\nThe price is:"+price);
	    	}
		
		public static void main(String[] args){
			Product ob1=new Product();
			ob1.read();
			ob1.display();
			Product ob2=new Product();
			ob2.read();
			ob2.display();
			Product ob3=new Product();
			ob3.read();
			ob3.display();
			if((ob1.price<ob2.price)&&(ob1.price<ob3.price))
			{
				System.out.println("\nThe product" +ob1.pname+ "has the lowest price");
			}
			if((ob2.price<ob1.price)&&(ob2.price<ob3.price))
			{
				System.out.println("\nThe product" +ob2.pname+ "has the lowest price");
			}
			else{
				System.out.println("\nThe product" +ob3.pname+ "has the lowest price");
			}
}
}