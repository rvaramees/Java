public class Hello {

  static void nokkNaye(int age){
    if(age<18){
        throw new ArithmeticException("Podaa naaye");
    }
    else{
        System.out.println("Kayichilaayi Monne");
    }
  }
  public static void main(String[] args) {
    nokkNaye(187);
}
  }