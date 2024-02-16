package Product;
import java.util.Scanner;
public class Product {
    int pcode;
    String pname;
    double price;
    public void readData(){
        Scanner s = new Scanner(System.in);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the product code : ");
        this.pcode = s.nextInt();
        System.out.println("Enter the product name : ");
        this.pname = sc.nextLine();
        System.out.println("Enter the price of product : ");
        this.price = s.nextDouble();
    }
} 
    
