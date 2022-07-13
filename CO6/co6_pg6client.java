import java.net.*;
import java.io.*;

public class co6_pg6client {
    public static void main(String[] args) throws IOException{
        DatagramSocket ds=new DatagramSocket();
        InetAddress add=InetAddress.getByName("localhost");
        String st="Hello server";
        byte[] byf=st.getBytes();
        DatagramPacket dp=new DatagramPacket(byf, byf.length,add,1234);
        ds.send(dp);
        ds.close();
    }
}
