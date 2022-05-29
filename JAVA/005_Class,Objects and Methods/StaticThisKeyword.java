class Counter{
	static int count = 0;
    static double u = 10;
	int a = 5;
	Counter(){
        count++;
	}
    Counter(double u){
        this.u = u;
    }
	static void display(){											
		System.out.println("Counter = " + count);
        System.out.println("u = " + u);						//static variable will work in static method
		//System.out.println("a = " + a);					//Non-static variable will not work in static method 
	} 
}
public class StaticThisKeyword{
	public static void main(String[] args){
		Counter c1 = new Counter();
		c1.display();
		Counter c2 = new Counter();
		c2.display();
		Counter c3 = new Counter();
		c3.display();
        System.out.println();
        double u = 0;
        Counter t1 = new Counter(u);
        t1.display(); 
	}
}