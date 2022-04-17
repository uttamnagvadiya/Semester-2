import java.util.Scanner;
public class CircleArea{
    public static void main(String[] args){
        double r, a;
       
        Scanner input = new Scanner(System.in);
        System.out.print("Radius of Circle : ");
        r = input.nextDouble();
        
        a = 3.14 * r * r;

        System.out.println("Area of Circle : " + a);
    }
}