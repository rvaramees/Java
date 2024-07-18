public class even {
    public static void main(String args[]){
        Fibonacci fib = new Fibonacci();
        Thread t = new Thread(fib);
        t.start();
        
        int start = 15;
        int end = 30;
        System.out.println("Even Numbers between "+start+" and "+end+" : ");
        for(int i = start; i < end; i++){
            if (i % 2 ==0) {
                System.out.println(i);
            }
        }
    }
}
class Fibonacci implements Runnable{
    public void run(){
        int n1 = 0, n2 = 1, n3;
        System.out.println("Fibonacci Series : ");
        for(int i = 0; i<=10; i++){
            System.out.println(n1+" ");
            n3 = n1 + n2;
            n1 = n2;
            n2 = n3;
        }
    }
}