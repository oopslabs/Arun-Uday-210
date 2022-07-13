import java.io.*;

public class co6_pg4 {
    public static void main(String[] args) throws IOException{
        FileInputStream fi=new FileInputStream("C:\\Users\\Arun\\eclipse-workspace\\hello\\src\\co6_pg4.txt");
        FileOutputStream fo1=new FileOutputStream("C:\\Users\\Arun\\eclipse-workspace\\hello\\src\\even.txt",true);
        FileOutputStream fo2=new FileOutputStream("C:\\Users\\Arun\\eclipse-workspace\\hello\\src\\odd.txt",true);
        int i;
        while((i=fi.read())!=-1){
            if(i%2==0){
                fo1.write(i);
            }
            else{
                fo2.write(i);
            }
        }
        fi.close();
        fo1.close();
        fo2.close();
    }
}
