import java.util.*;

class Stack <T>{
	ArrayList<T> S;
	int top=-1,size;
	Stack(int s){
		this.size=s;
		this.S=new ArrayList<T>(size);
	}
	void push(T newData) {
		if(top+1 == size) {
			System.out.println("Stack overflow");
		}
		else {
			top++;
			if(S.size()>top) {
				S.set(top,newData);
			}
			else {
				S.add(newData);
			}
		}
	}
	void pop() {
		if(top==-1) {
			System.out.println("Stack Underflow");
		}
		else {
			top--;
		}
	}
	void display() {
		for(int i=0;i<=top;i++) {
			System.out.println(S.get(i));
		}
	}
	T top() {
		if(top==-1) {
			System.out.println("Stack Underflow");
			return null;
		}
		else {
			return S.get(top);
		}
	}
}
public class co4_pg8 {
	public static void main(String args[]) {
		Stack<Integer> obj=new Stack<>(5);
		obj.push(10);
		obj.push(20);
		obj.push(30);
		obj.push(40);
		obj.push(50);
		System.out.println("After Push");
		obj.display();
		obj.pop();
		obj.pop();
		obj.pop();
		System.out.println("After Pop");
		obj.display();
		System.out.println("Top");
		System.out.println(obj.top());
	}
}
