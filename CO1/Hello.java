
import java.util.*;

public class Hello{
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.print("Enter the name : ");
        String name = sc.nextLine();
        System.out.print("Enter the rollno : ");
        int rollno = sc.nextInt();
        System.out.print("Enter the mark : ");
        int mark = sc.nextInt();
        System.out.println("Name is : "+name);
        System.out.println("Roll No is : "+rollno);
        System.out.println("Mark is : "+mark);
        sc.close();
    }
}