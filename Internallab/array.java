import java.util.*;

public class array {

	public static void main(String[] args) {
		ArrayList<String> a1=new ArrayList<>(10);
		Scanner sc=new Scanner(System.in);
		int c;
		do {
			System.out.println("1.Add at end\n2.Insert at Specific\n3.Search\n4.List String\n5.Exit");
			c=sc.nextInt();
			sc.nextLine();
			switch(c) {
			case 1:System.out.println("Enter the data");
					String data=sc.nextLine();
					a1.add(data);
					System.out.println(a1);
					break;
			case 2:System.out.println("Enter the data");
					String data1=sc.nextLine();
					System.out.println("Enter the index");
					int ind=sc.nextInt();
					a1.set(ind, data1);
					System.out.println(a1);
					break;
			case 3:System.out.println("Enter the data to search");
					String data2=sc.nextLine();
					int i=0;
					for(String s:a1) {
						if(s.compareTo(data2)==0) {
							System.out.println(i+" "+s);
						}
						i++;
					}
					break;
			case 4:System.out.println("Enter the letter:");
					String data3=sc.nextLine();
					for(String s:a1) {
						if(s.charAt(0)==data3.charAt(0)) {
							System.out.println(s);
						}
					}
					break;
			case 5:System.out.println("Exiting");
			}
		}while(c!=5);
	}

}
