import java.io.*;
public class OutputStream{
    public static void main(String[] args){
        try{
            FileOutputStream fos = new FileOutputStream("output.txt");
            byte [] out = "Life is Great.".getBytes();
            fos.write(out);
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}