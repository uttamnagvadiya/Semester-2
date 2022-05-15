import java.util.*;
public class Temperature{
    public static void main(String[] args){
        //Convert Temperature Fahrenhit to Celsius.

        double f, c;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter temp in °F : ");
        f = input.nextDouble();

        c = (f - 32)*5/9;

        System.out.println("Temp in Celsius : " + c +"°C");
    }
}