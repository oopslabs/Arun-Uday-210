import java.util.*;
class publisher {
	String name,author;
	publisher(String name,String author){
		this.name=name;
		this.author=author;
	}
}
class book extends publisher{
	String b_name;
	int isbn,price;
	book(String name,String author,String b_name,int isbn,int price){
		super(name,author);
		this.b_name=b_name;
		this.isbn=isbn;
		this.price=price;
	}
}
class literature extends book{
	String literature="This is literature",cat,fiction="fiction";
	literature(String name,String author,String b_name,int isbn,int price,String cat){
		super(name,author,b_name,isbn,price);
		this.cat=cat;
	}
	void display(){
		if(this.cat.equals(fiction))
		{
			System.out.println();
		}
		else{
			System.out.println("ISBN : "+isbn);
			System.out.println("Book name : "+b_name);
			System.out.println("Book author : "+author);
			System.out.println("Book publisher : "+name);
			System.out.println("Book price : "+price);
		}
	}
}
class fiction extends literature{
	String fiction="This is fiction";
	fiction(String name,String author,String b_name,int isbn,int price,String cat){
		super(name,author,b_name,isbn,price,cat);
	}
	void display(){
		System.out.println("ISBN : "+isbn);
		System.out.println("Book name : "+b_name);
		System.out.println("Book author : "+author);
		System.out.println("Book publisher : "+name);
		System.out.println("Book price : "+price);
	}
}
public class co3_pg4 {
	public static void main(String args[]){
		Scanner in = new Scanner(System.in);
		int num,i,j,k,isbn,price;
		String name,author,b_name,cat,subcat,literature="literature",fiction="fiction";
		System.out.println("Enter the number of books");
		num=in.nextInt();
		fiction fobj[] = new fiction[num];
		literature lobj[] = new literature[num];
		j=0;
		k=0;
		for(i=0;i<num;i++){
			System.out.println("Enter the details of book no :"+(i+1));
			System.out.println("Enter the book isbn");
			isbn=in.nextInt();
			in.nextLine();
			System.out.println("Enter the book name");
			b_name=in.nextLine();
			System.out.println("Enter the book author");
			author=in.nextLine();
			System.out.println("Enter the book publisher");
			name=in.nextLine();
			System.out.println("Enter the book price");
			price=in.nextInt();
			in.nextLine();
			System.out.println("Enter the book category");
			cat=in.nextLine();
			System.out.println("Enter the book sub category");
			subcat=in.nextLine();
			if(cat.equals(literature) && subcat.equals(fiction)){
				fobj[j]=new fiction(name,author,b_name,isbn,price,subcat);
				j++;
			}
			else{
				if(cat.equals(literature)){
					lobj[k]=new literature(name,author,b_name,isbn,price,subcat);
					k++;
				}
				else{
					System.out.println("category not available");
					i--;
				}
			}
				
		}
		i=0;
		System.out.println(fiction);
		while(j>0){
			fobj[i].display();
			i++;
			j--;
			
		}
		i=0;
		System.out.println(literature);
		while(k>0){
			lobj[i].display();
			i++;
			k--;
			
		}
	}
}
