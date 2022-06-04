package check;
import java.util.*;

class unameException extends Exception{
	public unameException(String msg) {
		super(msg);
	}
}
class passException extends Exception{
	public passException(String msg) {
		super(msg);
	}
}
public class co4_pg3 {
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		String uname,pass;
		System.out.println("Enter the username:");
		uname=sc.nextLine();
		System.out.println("Enter the password:");
		pass=sc.nextLine();
		try {
			if(uname.length()<6) {
				throw new unameException("Invalid username min 6 letters");
			}
			if(!pass.equals("myname")) {
				throw new passException("Invalid password");
			}
			else {
				System.out.println("Logged in......");
			}
		}
		catch(unameException e) {
			System.out.println("Exception occured :"+e.getMessage());
		}
		catch(passException e) {
			System.out.println("Exception occured :"+e.getMessage());
		}
	}
}
