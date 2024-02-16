package complex;

import java.util.Scanner;

public class Complex {
    int real;
    int imag;
    public void readComplex(){
        Scanner s = new Scanner(System.in);
        System.out.println("Enter real part of the complex number : ");
        this.real = s.nextInt();
        System.out.println("Enter imaginary part of the complex number : ");
        this.imag = s.nextInt();
    }
    public void printComplex(){
        System.out.println(this.real+" + "+this.imag+"i");
    }
}
