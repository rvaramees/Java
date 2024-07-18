public class prime {
    public static void main(String args[]){        
        int n = 30;
        System.out.println("Even numbers from 0 to 30 : ");
        for(int i = 0; i < n;i=i+2){
            System.out.println(i);
        }
        threadPrime th = new threadPrime();
        th.start();    
    }
}

class threadPrime extends Thread{
    public static boolean isPrime(int n){
        if(n==0 || n==1) return false;
        for(int i = 2; i<n; i++){
            if(n%i==0){
                return false;
            }
        }
        return true;
    }
    public void run(){
        int m = 40;
        for(int i=1; i<=m;i++){
            if(isPrime(i)){
                System.out.println(i);
            }
        }
    }    
} 
