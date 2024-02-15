package Product;
public class Product{
    private int pcode;
    private int price;
    private String pname;
    public Product(int pcode, String pname, int price){
        this.pcode = pcode;
        this.pname = pname;
        this.price = price; 
    }
    public String getName(){
        return pname;
    }
    public int getCode(){
        return pcode;
    }
    public int getPrice(){
        return price;
    }
    public void setName(String pname){
        this.pname = pname;
    }
    public void setPrice(int price){
        this.price = price;
    } 
}