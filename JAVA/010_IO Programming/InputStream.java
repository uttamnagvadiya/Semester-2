import java.io.*;
public class InputStream{
    public static void main(String[] args){
        try{
            FileInputStream fis = new FileInputStream("TXT Files/bg.jpg");
            int x = 0;
            x = fis.read();
            while(x!=-1){
                System.out.print((char)x);
                x = fis.read();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}