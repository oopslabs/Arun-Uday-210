import java.net.*;
import java.io.*;

public class co6_pg6 {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds=new DatagramSocket(1234);
        byte[] byf=new byte[256];
        DatagramPacket dp=new DatagramPacket(byf, byf.length);
        ds.receive(dp);
        String reply =new String(dp.getData());
        System.out.println("Client says"+reply);
        ds.close();
    }
}
