import java.util.*;

public class Product_pg1 {
    int pcode;
    String pname;
    float price;
    void getData(){
        Scanner i = new Scanner(System.in);
        System.out.print("Enter the product code : ");
        pcode = i.nextInt();
        i.nextLine();
        System.out.print("Enter the product name : ");
        pname = i.nextLine();
        System.out.print("Enter the product price : ");
        price = i.nextFloat();
    }
    void outData(){
        System.out.println("Product code : "+pcode);
        System.out.println("Product name : "+pname);
        System.out.println("Product price : "+price);
    }
    public static void main(String[] args) {
        Product_pg1 obj1 = new Product_pg1();
        obj1.getData();
        obj1.outData();
        Product_pg1 obj2 = new Product_pg1();
        obj2.getData();
        obj2.outData();
        Product_pg1 obj3 = new Product_pg1();
        obj3.getData();
        obj3.outData();
        System.out.println();
        if((obj1.price<obj2.price)&&(obj1.price<obj3.price)){
            System.out.println(obj1.pname+" has the lowest price :"+obj1.price);
        }
        else if((obj2.price<obj1.price)&&(obj2.price<obj3.price)){
            System.out.println(obj2.pname+" has the lowest price :"+obj2.price);
        }
        else{
            System.out.println(obj3.pname+" has the lowest price :"+obj3.price);
        }
    }
}
