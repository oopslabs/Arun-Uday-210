
import java.util.*;
import java.util.Date;
public class co3_pg7{
	public static void main(String args[]){
		Scanner in=new Scanner(System.in);
		create obj[]=new create[100];
		Date d;
		int i=0,j=0,k=0,n,id,qty,oid=0,uprice,u_total,net_amount=0;
		String name;
		System.out.println("######BILL#######");
		do {
			System.out.println("1. Add an item \n2. Generate Bill \n3. Exit");
			n=in.nextInt();
			switch(n) {
			case 1: System.out.println("Enter order no");
					oid=in.nextInt();
					do {
						System.out.println("Enter product id");
						id=in.nextInt();
						System.out.println("Enter the product name");
						in.nextLine();
						name=in.nextLine();
						System.out.println("Enter product quantity");
						qty=in.nextInt();
						System.out.println("Enter product unit price");
						uprice=in.nextInt();
						System.out.println("Continue (Enter 0)");
						k=in.nextInt();
						u_total=qty*uprice;
						net_amount=net_amount+u_total;
						obj[i]=new create(id,name,qty,uprice,u_total);
						i++;
					}while(k==0);
					break;
			case 2: d=new Date();
					System.out.println("Order No: "+oid);
					System.out.println("Date :"+d.toString());
					System.out.println("Product Id  Name  Quantity   Unit Price  Total");
					System.out.println("______________________________________________");
					while(j<i) {
					obj[j].call_bill();
					j++;
				}
					System.out.println("______________________________________________");
					System.out.println("                       Net Amount        "+net_amount);
					break;
			case 3: System.out.println("Exiting.......");
					break;
			}
		}while(n!=3);
	}
}
interface bill{
	void call_bill();
}
class create implements bill{
	int id,qty,uprice,u_total;
	String name;
	create(int id,String name,int qty,int uprice,int u_total){
		this.id=id;
		this.name=name;
		this.qty=qty;
		this.uprice=uprice;
		this.u_total=u_total;
	}
	public void call_bill() {
		System.out.printf("%5s%9s%8s%11s%11s\n",this.id,this.name,this.qty,this.uprice,this.u_total);
	}
}
