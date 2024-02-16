package Product;
public class productMain{
    public static void main(String args[]){
        Product p1 = new Product();
        Product p2 = new Product();
        Product p3 = new Product();
        p1.readData();
        p2.readData();
        p3.readData();
        if (p1.price > p2.price && p1.price > p3.price) {
            System.out.println(p1.pname + " has most cost.");
        } 
        else if(p2.price > p3.price){
            System.out.println(p2.pname + " has most cost.");
        }
        else{
            System.out.println(p3.pname + " has most cost.");
        }
    }
}