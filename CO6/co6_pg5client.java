import java.io.*;
import java.net.*;

public class co6_pg5client {
    public static void main(String[] args) throws  IOException{
        Socket s=new Socket("localhost",1234);
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        pw.println("Hello server");
        InputStreamReader isr=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(isr);
        String st=br.readLine();
        System.out.println("MESSAGE FROM SERVER: "+st);
        pw.close();
        s.close();
    }
}
