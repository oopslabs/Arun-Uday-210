package check;
import java.util.*;

class person{
	String name,gender,address;
	int age;
	person(String nam,String gend,String add,int age){
		this.name=nam;
		this.gender=gend;
		this.address=add;
		this.age=age;
	}
}
class employee extends person{
	int empid;
	double salary;
	String company_name,qualification;
	employee(String nam,String gend,String add,int age,int empid,double salary,String company_name,String qualification){
		super(nam,gend,add,age);
		this.empid=empid;
		this.salary=salary;
		this.company_name=company_name;
		this.qualification=qualification;
	}
}
class teacher extends employee{
	String subject,department;
	int t_id;
	teacher(String nam,String gend,String add,int age,int empid,double salary,String company_name,String qualification,String subject,String department,int t_id){
		super(nam,gend,add,age,empid,salary,company_name,qualification);
		this.subject=subject;
		this.department=department;
		this.t_id=t_id;
	}
	void display() {
		System.out.println("Employee ID : "+this.empid);
		System.out.println("Employee Name : "+this.name);
		System.out.println("Employee Gender : "+this.gender);
		System.out.println("Employee Address : "+this.address);
		System.out.println("Employee Age : "+this.age);
		System.out.println("Employee Salary : "+this.salary);
		System.out.println("Company Name : "+this.company_name);
		System.out.println("Employee Qualification : "+this.qualification);
		System.out.println("Employee Subject : "+this.subject);
		System.out.println("Employee Department : "+this.department);
		System.out.println("Employee Teacher ID : "+this.t_id);
	}
}
public class co3_pg3 {
	public static void main(String args[]) {
		String name,gender,address;
		int age;
		int empid;
		double salary;
		String subject,department;
		String company_name,qualification;
		int t_id;
		int n;
		int j=0;
		String sub[]=new String[10];
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of teachers:");
		n=in.nextInt();
		teacher[] obj=new teacher[n];
		while(j<n) {
			System.out.println("Enter the employee id :");
			empid=in.nextInt();
			in.nextLine();
			System.out.println("Enter the employee name :");
			name=in.nextLine();
			System.out.println("Enter the employee gender :");
			gender=in.nextLine();
			System.out.println("Enter the employee address :");
			address=in.nextLine();
			System.out.println("Enter the employee age :");
			age=in.nextInt();
			System.out.println("Enter the employee salary :");
			salary=in.nextDouble();
			in.nextLine();
			System.out.println("Enter the company name :");
			company_name=in.nextLine();
			System.out.println("Enter the employee qualification :");
			qualification=in.nextLine();
			System.out.println("Enter the employee subject :");
			subject=in.nextLine();
			System.out.println("Enter the employee department :");
			department=in.nextLine();
			System.out.println("Enter the employee teacher id :");
			t_id=in.nextInt();
			obj[j]=new teacher(name,gender,address,age,empid,salary,company_name,qualification,subject,department,t_id);
			j++;
		}
		j=0;
		while(j<n) {
			obj[j].display();
			j++;
		}
		
	}
}
