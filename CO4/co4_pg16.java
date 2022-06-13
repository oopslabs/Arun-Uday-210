import java.util.LinkedHashSet;
public class co4_pg16 {
	public static void main(String args[]) {
		LinkedHashSet<String> l1 = new LinkedHashSet<>();
		l1.add("Hai");
		l1.add("my");
		l1.add("life");
		for(String i :l1 ) {
			System.out.print(i+" ");
		}
		LinkedHashSet<String> l2 = new LinkedHashSet<>();
		l2.add("Hai");
		l2.add("m");
		l2.add("life");
		System.out.println();
		for(String i :l2 ) {
			System.out.print(i+" ");
		}
		System.out.println("\nCompare :  "+ l1.equals(l2));
	}
}
