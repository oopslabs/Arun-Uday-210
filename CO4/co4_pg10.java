import java.util.*;
public class co4_pg10 {
	public static void main(String args[]) {
		ArrayList<String>s=new ArrayList<>();
		s.add("my");
		s.add("name");
		s.add("is");
		s.add("Manu");
		System.out.println("Array List");
		for(String st:s) {
			System.out.print(st+" ");
		}
		s.remove("Manu");
		System.out.println();
		System.out.println("Array List after removing Manu");
		for(String st:s) {
			System.out.print(st+" ");
		}
		Collections.sort(s);
		System.out.println("Array List after sorting");
		for(String st:s) {
			System.out.print(st+" ");
		}
		s.clear();
		System.out.println();
		System.out.println("Array List after clearing"+s);
	}
}
