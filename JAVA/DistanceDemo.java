import java.util.*;
class Distance{
    int kilometer, meter, centimeter;
    Distance(){
        kilometer = 0; meter = 0; centimeter = 0;
    }
    void setDistance(){
        Scanner input = new Scanner(System.in);
        System.out.print("Kilometer : ");
        kilometer = input.nextInt();
        System.out.print("Meter : ");
        meter = input.nextInt();
        System.out.print("Centimeter : ");
        centimeter = input.nextInt();
    }
    void displayDistance(){
        System.out.println();
        System.out.println("Distance is = " + kilometer + " km : " + meter + " m : " + centimeter + " cm");
    }
    Distance convertDistance(){
        Distance temp = new Distance();
        temp.centimeter = centimeter;
        temp.meter = meter + (temp.centimeter/100);
        temp.centimeter = (temp.centimeter%100);
        temp.kilometer = kilometer + (temp.meter/1000);
        temp.meter = (temp.meter%1000);
        return temp;
    }
}
public class DistanceDemo{
    public static void main(String[] args){
        Distance d1 = new Distance();
        d1.setDistance();
        Distance convert = new Distance();
        convert = d1.convertDistance();
        convert.displayDistance();
    }
}
