import java.util.*;
public class co4_pg15 {
	public static void main(String args[]) {
		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		System.out.println("Adding Elements to the linkedHashSet : ");
		l1.add("Hai");
		l1.add("my");
		l1.add("life");
		for(String i :l1 ) {
			System.out.print(i+" ");
		}
		System.out.println("\nRemoving Elements: ");
		l1.remove("my");
		System.out.println(l1);
		System.out.println("Life :  "+ l1.contains("life"));
	}
}
