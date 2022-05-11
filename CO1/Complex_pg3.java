import java.util.*;
public class Complex_pg3 {
	int real,img;
    Scanner in = new Scanner(System.in);
    void getData(){
    	System.out.println("Enter the real part of complex number :");
	    real=in.nextInt();
	    System.out.println("Enter the imaginary part of complex number :");
	    img=in.nextInt();
    }
    void putData(){
    	System.out.println("Complex number : "+real+"+"+img+"i");
    }
	public static void main(String[] args){
		Complex_pg3 obj1 = new Complex_pg3();
		obj1.getData();
		obj1.putData();
		Complex_pg3 obj2 = new Complex_pg3();
		obj2.getData();
		obj2.putData();
		int nreal,nimg;
		nreal = obj1.real+obj2.real;
		nimg = obj1.img+obj2.img;
		System.out.println("Complex number : "+nreal+"+"+nimg+"i");
		
	}
}
