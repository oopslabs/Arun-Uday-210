package hello;
import java.util.*;
class employee{
	int empid;
	String name,address;
	double salary;
	employee(int id,String name,String add,double sal){
		empid=id;
		this.name=name;
		this.address=add;
		this.salary=sal;
	}
}
class teacher extends employee{
	String dep;
	int num;
	String subs[]=new String[10];
	teacher(int id,String name,String add,double sal,String dep,int n,String sub[]) {
		super(id,name,add,sal);
		this.dep=dep;
		int i=0;
		this.num=n;
		while(n>0) {
			this.subs[i]=sub[i];
			i++;
			n--;
		}
	}
	void display() {
		System.out.println("Employee ID : "+this.empid);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Address : "+this.address);
		System.out.println("Employee Salary : "+this.salary);
		System.out.println("Employee Department : "+this.dep);
		int i=0;
		System.out.print("Employee Subjects : ");
		while(num>0) {
			System.out.print(" "+this.subs[i]);
			i++;
			num--;
		}
	}
}
public class co3_pg2 {
	public static void main(String args[]) {
		int empid;
		String name,address;
		double salary;
		String dep;
		int num,temp,n;
		int i,j=0;
		String sub[]=new String[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of employees:");
		n=in.nextInt();
		teacher[] obj=new teacher[n];
		while(j<n) {
			i=0;
			System.out.println("Enter the employee id :");
			empid=in.nextInt();
			in.nextLine();
			System.out.println("Enter the employee name :");
			name=in.nextLine();
			System.out.println("Enter the employee address :");
			address=in.nextLine();
			System.out.println("Enter the employee salary :");
			salary=in.nextDouble();
			in.nextLine();
			System.out.println("Enter the employee department :");
			dep=in.nextLine();
			System.out.println("Enter the number of subjects taught by employee :");
			num=in.nextInt();
			System.out.print("Enter subjects : ");
			temp=num;
			in.nextLine();
			while(temp>0) {		
				sub[i]=in.nextLine();
				i++;
				temp--;
			}
			obj[j]=new teacher(empid,name,address,salary,dep,num,sub);
			j++;
		}
		j=0;
		while(j<n) {
			obj[j].display();
			System.out.println();
			j++;
		}
		
	}
		
}
