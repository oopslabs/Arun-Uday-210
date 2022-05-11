import java.util.*;
public class String_manu {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		System.out.print("Enter string : ");
		String sc = in.nextLine();
		System.out.print("Enter the position : ");
		int n = in.nextInt();
		System.out.println("Character at position "+n+" is "+sc.charAt(n));
		System.out.println("Unicode of the character at position "+n+" is "+sc.codePointAt(n));
		in.nextLine();
		System.out.print("Enter string : ");
		String sd = in.nextLine();
		System.out.println("Strings are equal"+sc.compareTo(sd));
		System.out.println("Concatenation "+sc.concat(sd));
		System.out.println("Check if the strings are equal "+sc.equals(sd));
		System.out.println("Length of string "+sc+" "+sc.length());
		String se[] = sc.split(" ");
		for(int i=0;i<se.length;i++){
			System.out.println("Spliting the string "+se[i]);
		}
		System.out.println("Uppercase the string "+sc.toUpperCase());
		System.out.println("Lowercase the string "+sc.toLowerCase());
	}
}
