import java.util.*;
public class co4_pg14 {
	public static void main(String[] args){
		Deque<Integer> dq=new LinkedList<>();
		dq.add(1);
		dq.add(2);
		dq.addFirst(3);
		dq.addLast(4);
		dq.push(5);
		dq.offer(6);
		dq.offerFirst(7);
		System.out.print("DEQUE:  "+dq+" ");
		
		dq.removeFirst();
		System.out.println("\nDEQUE after removing first element");
		System.out.print(dq+" ");
		
		dq.removeLast();
		System.out.println("\nDEQUE after removing last element");
		System.out.print(dq+" ");
		 
	}
}
