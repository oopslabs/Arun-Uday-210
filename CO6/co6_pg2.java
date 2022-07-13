import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
public class co6_pg2{
    public static void main(String[] args){
        try{
            FileWriter fw=new FileWriter("C:\\Users\\Arun\\eclipse-workspace\\hello\\src\\co6_pg2.txt");
            fw.write("Hello my name is arun");
            fw.close();
            FileReader fr=new FileReader("C:\\Users\\Arun\\eclipse-workspace\\hello\\src\\co6_pg2.txt");
            BufferedReader bf=new BufferedReader(fr);
            String line;
            while((line=bf.readLine())!=null){
                System.out.println(line);
            }
            fr.close();
        }
        catch(IOException e){
            System.out.println("Error occured");
        }
    }
}
