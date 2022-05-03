class Odd extends Thread{
	public void run(){
		int i=1;
		while(i<=20){
			try{
				if (i%2 != 0){
					System.out.println("Odd Number: "+i);
					Thread.sleep(1000);
				}
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(e);
			}
			i++;
		}
	}
}
class Even extends Thread{
	public void run(){
		int i=1;
		while(i<=20){
			try{
				if (i%2 == 0){
					System.out.println("Even Number: "+i);
					Thread.sleep(2000);
				}
			}catch(Exception e){
				e.printStackTrace();
				System.out.println(e);
			}
			i++;
		}
	}
}
public class OddEvenThreads{
	public static void main(String[] args) {
		Odd o1 = new Odd();
		Even e1 = new Even();
		o1.start();
		e1.start(); 
	}
}