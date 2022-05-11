import java.util.*;
public class sort_pg1 {
	public static void main(String[] args){
		String a;
		String temp;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the strings : ");
		a=in.nextLine();
		String sc[] = a.split(" ");
		for(int i = 0;i < sc.length;i++){
			for(int j = 0;j < sc.length;j++){
				if(sc[i].compareTo(sc[j])<0){
					temp = sc[i];
					sc[i]=sc[j];
					sc[j]=temp;
				}
			}
		}
		for(int i = 0;i < sc.length;i++){
			System.out.println(sc[i]);
		}
		
		
	}
}
