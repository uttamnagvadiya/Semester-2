// class MyPoint{
//     double x, y;
//     MyPoint(){
//       x = 0;
//       y = 0;
//     }
//     MyPoint(double x, double y){
//         this.x = x;
//         this.y = y;
//     }
//     double distance(MyPoint a){
//         double D = Math.sqrt(Math.pow(this.x-a.x,2) + Math.pow(this.y-a.y,2));
//         return D;
//     }
//     // double distance(double x, double y){
//     //     double D = Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
//     //     return D;
//     // }
// }
// public class My2Points{
//     public static void main(String[] args){
//         MyPoint d1 = new MyPoint();
//         MyPoint d2 = new MyPoint(1,1);

//         System.out.println("Distance between two points is : " + d1.distance(d2));
//     }
// }



import java.util.Scanner;
class Mypoint{
    double x,y;

    Mypoint(){
        x=0;
        y=0;
    }
    Mypoint(double x,double y){
        this.x=x;
        this.y=y;
    }
    double distance(Mypoint a){
       double D = Math.sqrt(Math.pow(this.x-a.x,2)+Math.pow(this.y-a.y,2));
        return D;
    }
}

class InputXY{
    double x,y;
    Scanner input = new Scanner(System.in);

    public double getX() {
        System.out.print("Enter x : ");
        return x = input.nextDouble();
    }
    public double gety() {
        System.out.print("Enter y : ");
        return y = input.nextDouble();
    }
}

public class My2Points {
    public static void main(String[] args) {
        InputXY ab = new InputXY();
        Mypoint obj1 = new Mypoint();

        Mypoint obj2 = new Mypoint(ab.getX(), ab.gety());
        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ",obj1.x,obj1.y,obj2.x,obj2.y);
        System.out.println(obj1.distance(obj2));

        Mypoint obj3 = new Mypoint(ab.getX(), ab.gety());
        System.out.printf("distance (%.1f,%.1f) to (%.1f,%.1f) : ",obj2.x,obj2.y,obj3.x,obj3.y);
        System.out.println(obj2.distance(obj3));
    }
}
