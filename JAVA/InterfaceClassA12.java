interface A{
	public void print();
}
interface A1 extends A{
	public void run();
}
interface A2 extends A{
	public void display();
}
abstract class A12 implements A1, A2{
	abstract void demo();
}
class B extends A12{
	public void print(){
		System.out.println("B print");
	}
	public void run(){
		System.out.println("B run");
	}
	public void display(){
		System.out.println("B display");
	}
	public void demo(){
		System.out.println("B demo");
	}
}

public class InterfaceClassA12{
	public static void main(String[] args){
		B n1 = new B();
		n1. print();
		n1.demo();
	}
}