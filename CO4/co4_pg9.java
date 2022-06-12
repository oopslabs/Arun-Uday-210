import java.util.Arrays;
import java.util.Scanner;
public class co4_pg9 {
	public static void main(String args[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the number of elements");
		int n=sc.nextInt();
		System.out.println("Enter the integer array");
		Integer array[]=new Integer[n];
		for(int i=0;i<n;i++) {
			array[i]=sc.nextInt();
		}
		Bubble<Integer> obj=new Bubble<>(array);
		Integer arraySort[]=obj.sort();
		System.out.println(Arrays.toString(arraySort));
		
		
		//string
		System.out.println("Enter the String array");
		sc.nextLine();
		String array2[]=new String[n];
		for(int i=0;i<n;i++) {
			array2[i]=sc.nextLine();
		}
		Bubble<String> obj2=new Bubble<>(array2);
		String arraySort2[]=obj2.sort();
		System.out.println(Arrays.toString(arraySort2));
	}
}

class Bubble<T extends Comparable<? super T>>{
	T array[];
	Bubble(T array[]){
		this.array=array;
	}
	T[] sort() {
		for(int i=0;i<array.length;i++) {
			for(int j=0;j<(array.length)-1;j++) {
				if(array[j].compareTo(array[j+1])>0) {
					T temp=array[j];
					array[j]=array[j+1];
					array[j+1]=temp;
				}
			}
		}
		return array;
	}
}
