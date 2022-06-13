import java.util.*;
public class co4_pg17 {
	public static void main(String args[]) {
		Map<Integer,String> map = new HashMap<>();
		map.put(2,"Arun");
		map.put(1,"Abhi");
		map.put(3,"Akhil");
		map.put(5,"Manu");
		for(Map.Entry<Integer,String> e:map.entrySet()) {
			System.out.println(e.getKey()+"  :  "+e.getValue());
		}
	}
}
