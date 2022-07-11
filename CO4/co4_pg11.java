import java.util.*;
public class co4_pg11 {
	public static void main(String args[]) {
		LinkedList<String>l1=new LinkedList<>();
		l1.add("My");
		l1.add("name");
		l1.add("is");
		l1.add("Amal");
		System.out.println("Linked List");
		Iterator<String> itr=l1.iterator(); 
	 	while(itr.hasNext()){ 
	 	 	  System.out.println(itr.next()); 
	 	} 
		l1.clear();
		System.out.println();
		System.out.println("Linked List after clearing"+l1);
	}
}
