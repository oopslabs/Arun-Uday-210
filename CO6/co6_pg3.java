import java.util.*;
import java.io.*;

public class co6_pg3 {
    public static void main(String[] args) throws Exception {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the first file");
        String f1=sc.nextLine();
        System.out.println("Enter the second file");
        String f2=sc.nextLine();
        FileReader fl1=new FileReader(f1);
        FileWriter fl2=new FileWriter(f2,true);
        int c;
        while((c=fl1.read())!=-1){
            fl2.write(c);
        }
        System.out.println("Copied");
        fl1.close();
        fl2.close();
    }
}
