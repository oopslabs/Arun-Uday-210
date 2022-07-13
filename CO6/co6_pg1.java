import java.io.File;
import java.io.*;

public class co6_pg1 {
    public static void main(String[] args) {
        File f=new File("C:\\Users\\Arun\\eclipse-workspace\\hello\\src");
        String list[]= f.list();
        for(String s: list){
            System.out.println(s);
        }
        System.out.println("Search");
        FilenameFilter fl=new FilenameFilter() {
            public boolean accept(File dir,String fname){
                return fname.startsWith("p");
            }
        };
        String[] search= f.list(fl);
        if(search==null){
            System.out.println("Not Found");
        }
        else{
            for(String s: search){
                System.out.println(s);
            }
        }
    }
}
