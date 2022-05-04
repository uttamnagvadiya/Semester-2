class Thread1 implements Runnable{
	public void run(){
		int i=0;
		while(i<=15){
			System.out.println("Good Morning...");
			try{
				Thread.sleep(1000);
			}catch(Exception e){
				e.printStackTrace();
			}
			i++;
		}
	}
}
class Thread2 implements Runnable{
	public void run(){
		int i=0;
		while(i<=15){
			System.out.println("Good Afternoon...");
			try{
				Thread.sleep(3000);
			}catch(Exception e){
				e.printStackTrace();
			}
			i++;
		}
	}
}
public class TwoMultithread{
	public static void main(String[] args) {
		Thread1 m1 = new Thread1();
		Thread2 m2 = new Thread2();

		Thread t1 = new Thread(m1);
		Thread t2 = new Thread(m2);

		t1.start();
		t2.start();

	}
}