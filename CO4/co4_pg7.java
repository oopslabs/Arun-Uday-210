import java.util.ArrayList;

class Producer1 implements Runnable{
	ArrayList<Integer>l;
	int i=0;
	Producer1(ArrayList<Integer> l){
		this.l=l;
	}
	public void run() {
		try {
			while(true) {
				produce1(i++);
				if((i)==20) {
					break;
				}
			}
		}
		catch(Exception e) {
			System.out.println(e.getMessage());
		}
	}
	public void produce1(int i) throws Exception {
		synchronized(l)
		{
			System.out.println("produced:"+i);
			l.add(i);
			l.notify();
		}
		synchronized(l) {
			while(l.size()==5) {
				System.out.println("Production Full");
				l.wait();
			}
		}
	}
	
}
class Consumer1 implements Runnable{
	ArrayList<Integer>l;
	Consumer1(ArrayList<Integer>l)
	{
	this.l=l;
	}
	public void run() {
		while(true)
		{
			try
			{
				consume1();
			}
			catch (Exception e)
			{
				System.out.println(e.getMessage());
			}
		}
	}
	public void consume1() throws Exception
	{
		synchronized(l)
		{
			while(l.isEmpty())
			{
				System.out.println("fully Consumed");
				l.notify();
				Thread.sleep(500);
				l.wait();
			}
		}
		synchronized(l)
		{
			Thread.sleep(500);
			System.out.println("Consumed"+l.remove(0));
			
		}
	}
}
public class co4_pg7{
	public static void main(String args[]) {
		ArrayList<Integer>l=new ArrayList<>();
		Producer1 obj=new Producer1(l);
		Thread t1=new Thread(obj);
		Consumer1 obj2=new Consumer1(l);
		Thread t2=new Thread(obj2);
		t1.start();
		t2.start();
	}
}
