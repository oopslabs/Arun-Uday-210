import java.net.*;
import java.io.*;

public class co6_pg5 {
    public static void main(String[] args) throws IOException {
        ServerSocket ss=new ServerSocket(1234);
        System.out.println("SERVER IS WAITING FOR THE CLIENT.....");
        Socket s=ss.accept();
        System.out.println("CONNECTION ESTABLISHED !!!");
        InputStreamReader isr=new InputStreamReader(s.getInputStream());
        BufferedReader br=new BufferedReader(isr);
        String st=br.readLine();
        System.out.println("MESSAGE FROM CLIENT: "+st);
        PrintWriter pw=new PrintWriter(s.getOutputStream(),true);
        pw.write("Hai client");
        pw.close();
        ss.close();
    }
}
