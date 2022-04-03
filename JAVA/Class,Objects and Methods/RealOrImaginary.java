class ComplexNumber{
    double real;
    double imaginary;
    ComplexNumber(double real, double imaginary){
        this.real = real;
        this.imaginary = imaginary;
    }
    void printAddition(ComplexNumber c){
        double i = this.real + c.real;
        double r = this.imaginary + c.imaginary;
        System.out.println(r + " + i " + i);
    }
}
public class RealOrImaginary{
    public static void main(String[] args){
        ComplexNumber c1 = new ComplexNumber(5,2);
        ComplexNumber c2 = new ComplexNumber(2,5);
        c1.printAddition(c2);
    }
}