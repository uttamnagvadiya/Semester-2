class MyPoint{
    double x, y;
    MyPoint(){
      x = 0;
      y = 0;
    }
    MyPoint(double x, double y){
        this.x = x;
        this.y = y;
    }
    double distance(MyPoint a){
        double D = Math.sqrt(Math.pow(this.x-a.x,2) + Math.pow(this.y-a.y,2));
        return D;
    }
    double distance(double x, double y){
        double D = Math.sqrt(Math.pow(this.x-x,2) + Math.pow(this.y-y,2));
        return D;
    }
}
public class My2Points{
    public static void main(String[] args){
        MyPoint a1 = new MyPoint();
        MyPoint a2 = new MyPoint(1,1);

        System.out.println("Distance between two points is : " + a1.distance(a2));
    }
}