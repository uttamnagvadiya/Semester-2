class MyHeadPhone{
    static int stock = 5;
    public void producer(){
        while (true) {
            stock++;
            System.out.println("Produce = " + stock);
            try{
                Thread.sleep(250);
                    if(stock > 5){
                        Thread.sleep(800);
                    }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
    public void consumer() {
        while (true) {
            stock--;
            System.out.println("Consumer = " + stock);
            try{
                Thread.sleep(200);
                    if(stock < 1){
                        Thread.sleep(1800);
                    }
            }catch(Exception e){
                e.printStackTrace();
            }
        }
    }
}

class MyProducer extends Thread{
    MyHeadPhone hp = new MyHeadPhone();
    public void run(){
        try {
            hp.producer();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

class MyConsumer extends Thread{
    MyHeadPhone hp = new MyHeadPhone();
    public void run(){
        try {
            hp.consumer();

        }catch (Exception e){
            e.printStackTrace();
        }
    }
}

public class Headphone {
    public static void main(String[] args) {
        MyProducer hp1 = new MyProducer();
        MyConsumer hp2 = new MyConsumer();
        hp1.start();
        hp2.start();
    }
}