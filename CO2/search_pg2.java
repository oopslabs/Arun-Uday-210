import java.util.*;
public class search_pg2 {
	public static void main(String[] args){
		int a[],m,n,k = 0,flag = 0;
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the size of array :");
		m = in.nextInt();
		a = new int[m];
		System.out.println("Enter the array");
		for(int i = 0;i < m;i++){
			a[i] = in.nextInt();
		}
		System.out.print("Enter the data to search :");
		n = in.nextInt();
		for(int i = 0;i < m;i++){
			k++;
			if(a[i] == n){
				System.out.println("Data "+n+" found at position : "+k);
				flag=1;
				break;
			}
		}
		if(flag == 0){
			System.out.println("Data not found");
		}
	}
}
