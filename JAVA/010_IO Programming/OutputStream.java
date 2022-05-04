import java.io.*;
public class OutputStream{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("TXT Files/bg.jpg");
            FileOutputStream fos = new FileOutputStream("TXT Files/bg456.jpg");
            // byte [] out = FileInputStream.getBytes();
            int x=0;
            x = fis.read();
            while(x != -1){
                fos.write(x);
                System.out.print((char)x);
                x = fis.read(); 
            }
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
