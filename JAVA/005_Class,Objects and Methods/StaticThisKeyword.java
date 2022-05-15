class Counter{
	static int count = 0;
    static double u = 10;
	Counter(){
        count++;
	}
    Counter(double u){
        this.u = u;
    }
	static void display(){
		System.out.println("Counter = " + count);
        System.out.println("u = " + u);
	} 
}
public class StaticThisKeyword{
	public static void main(String[] args){
		// Counter c1 = new Counter();
		// c1.display();
		// Counter c2 = new Counter();
		// c2.display();
		// Counter c3 = new Counter();
		// c3.display();
        // System.out.println();
        double u = 0;
        Counter o1 = new Counter(u);
        o1.display(); 
	}
}