import java.util.LinkedList;
public class Main{
    public static void main(String[] args){
        LinkedList<String> cars = new LinkedList<String>();
        cars.add("Maruti");
        cars.add("Maserati");
        cars.add("Ford");
        cars.addFirst("Chevrolet");
        System.out.println(cars); 
        cars.removeFirst();
        String car = cars.getFirst();
        System.out.println(cars);
        System.out.println(car);
    }
}