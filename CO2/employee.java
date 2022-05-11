import java.util.*;
public class employee {
	int eno,eSalary;
	String eName;
	employee(int no,String name,int sal){
		eno = no;
		eName = name;
		eSalary = sal;
	}
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		String name;
		int no,sal,n,flag=0;
		System.out.print("Enter the number of employees : ");
		n = in.nextInt();
		employee obj[] = new employee[10];
		for(int i = 0;i < n;i++){
			System.out.print("Enter the employee id : ");
			no = in.nextInt();
			in.nextLine();
			System.out.print("Enter the employee name : ");
			name = in.nextLine();
			System.out.print("Enter the employee salary : ");
			sal = in.nextInt();
			obj[i] = new employee(no,name,sal);
		}
		System.out.print("Enter the employee id : ");
		no = in.nextInt();
		for(int i=0;i<n;i++){
			if(obj[i].eno == no){
				System.out.println("Employee id : "+ obj[i].eno);
				System.out.println("Employee name : "+ obj[i].eName);
				System.out.println("Employee salary : "+ obj[i].eSalary);
				flag=1;
			}
		}
		if(flag == 0){
			System.out.println("Employee not available");
		}
	}
}
