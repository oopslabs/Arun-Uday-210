import java.util.*;
public class co3_pg5 {
	public static void main(String[] args){
		Result obj=new Result();
		obj.display();
			
	}
}
interface Student{	
	String name="Amal";
	int python=100,java=80,c=30;
	
}


interface Sports{
	int sm=30;
	

}
class Result implements Student,Sports{
	
	void display(){	
		System.out.println("Name: "+name+"\nMark for Python: "+python+"\nMark for Java: "+java+"\nMark for C: "+c+"\nMark for Sports: "+sm);
	}
}


