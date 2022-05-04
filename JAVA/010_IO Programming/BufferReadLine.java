import java.io.*;
public class BufferReadLine{
    public static void main(String[] args){
        try{
            FileReader fr = new FileReader("TXT Files/input.txt");
            BufferedReader br = new BufferedReader(fr);
            String temp = br.readLine();
            while(temp != null){
                System.out.println(temp);
                temp = br.readLine();
            }
            
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}