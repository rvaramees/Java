package Product;
import java.util.Scanner;
public class Compare {
    public static void main(String[] args) {
        String pro1,pro2;
        Scanner sc = new Scanner(System.in);
        Scanner s = new Scanner(System.in); 
        System.out.println("Enter the name of first product :");
        pro1 = sc.nextLine();
        System.out.println("Enter the price of "+pro1+" :");
        int price1 = sc.nextInt();
        System.out.println("Enter the name of second product :");
        pro2 = s.nextLine();
        System.out.println("Enter the price of "+pro2+" :");
        int price2 = sc.nextInt();
        Product p1 = new Product(1, pro1, price1);
        Product p2 = new Product(2, pro2, price2);
        String name1 = p1.getName();
        String name2 = p2.getName();
        int cost1 = p1.getPrice();
        int cost2 = p2.getPrice();
        sc.close();
        s.close();
        if(cost1 > cost2){
            System.out.println(name1+" is costlier than "+name2+".");
        }
        else if (cost1==cost2) {
            System.out.println(name1+" costs same as "+name2+".");
        }
        else{
            System.out.println(name2+" is costlier than "+name1+".");
        }
    }
}