import java.util.*;

public class cpu_pg5 {
	class Processor{
		int core;
		String manu;
		Processor(int cores,String manus){
			core = cores;
			manu = manus;
		}
		void out(){
			System.out.println("No of cores : "+core);
			System.out.println("Manufacturer : "+manu);
		}
	}
	static class RAM{
		static String mem,ram_manu;
		RAM(String mems,String ram_manus){
			mem = mems;
			ram_manu = ram_manus;
		}
		void output(){
			System.out.println("Memory : "+mem);
			System.out.println("Manufacturer : "+ram_manu);
		}
	}
	public static void main(String[] args){
		int price,core;
		String manu,mem,ram_manu;
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the CPU details");
		System.out.println("Enter the processor details");
		System.out.print("Enter the no of cores");
		core = in.nextInt();
		in.nextLine();
		System.out.print("Enter the manufacturer");
		manu = in.nextLine();
		System.out.println("Enter the RAM details");
		System.out.print("Enter the memory capacity");
		mem = in.nextLine();
		System.out.print("Enter the manufacturer");
		ram_manu = in.nextLine();
		System.out.print("Enter the CPU price");
		price = in.nextInt();
		cpu_pg5 obj1 = new cpu_pg5();
		cpu_pg5.Processor obj2 = obj1.new Processor(core,manu);
		cpu_pg5.RAM obj3 = new cpu_pg5.RAM(mem,ram_manu);
		obj2.out();
		obj3.output();
		System.out.println("Price of the CPU "+price);		
	}
}
