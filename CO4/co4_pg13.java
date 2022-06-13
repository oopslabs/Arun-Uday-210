import java.util.*;
public class co4_pg13 {
	public static void main(String[] args) {
		int n;
		String str;
		PriorityQueue<String> pqueue=new PriorityQueue<>();
		System.out.println("Total count");
		Scanner sc=new Scanner(System.in);
		n=sc.nextInt();
		sc.nextLine();
		System.out.println("Enter data");
		for(int i=0;i<n;i++){
			str=sc.nextLine();
			pqueue.add(str);
		}
		System.out.println("Peek: "+pqueue.peek());
		System.out.println("Queue");
		Iterator<String> itr1=pqueue.iterator();  
		while(itr1.hasNext()){  
		System.out.println(itr1.next());  
		}
		
		System.out.println("Polling: "+pqueue.poll());
		
		System.out.println("After polling data in Queue");
		Iterator<String> itr2=pqueue.iterator();  
		while(itr2.hasNext()){  
		System.out.println(itr2.next()); 
		}   
	}
}
