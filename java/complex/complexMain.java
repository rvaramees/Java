package complex;

public class complexMain {
    public static Complex addComplex(Complex a,Complex b){
        Complex c = new Complex();
        c.real = a.real + b.real;
        c.imag = a.imag + b.imag;
        return c;
    }
    public static void main(String args[]){
        Complex a = new Complex();
        Complex b = new Complex();
        a.readComplex();
        b.readComplex();
        Complex c = addComplex(a, b);
        System.out.println("First Complex number : ");
        a.printComplex();
        System.out.println("Second Complex number : ");
        b.printComplex();
        System.out.println("Sum of the two Complex numbers : ");
        c.printComplex();
    }
}
