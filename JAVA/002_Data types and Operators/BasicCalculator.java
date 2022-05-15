import java.util.*;
public class BasicCalculator{
    public static void main(String[] args){
        double x, y;
        String operation;
        Scanner input = new Scanner(System.in);
        System.out.print("x = ");
        x = input.nextDouble();
        System.out.print("y = ");
        y = input.nextDouble();
        System.out.print("Operation = ");
        operation = input.next();

        switch(operation){
            case "+":
            System.out.println("Sum = " + (x+y));
            break;

            case "-":
            System.out.println("Sub = " + (x-y));
            break;

            case "*":
            System.out.println("Multi = " + (x*y));
            break;

            case "/":
            System.out.println("Div = " + (x/y));
            break;

            default : 
            System.out.println("--->> Please enter the valid Operation. <<---");
        }
    }
}