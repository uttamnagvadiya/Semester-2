import java.io.*;
public class Counter{
    public static void main(String[] args){
        try{
            int countChar=0, countWord=0, countLine=0, x=0;
            FileInputStream fis = new FileInputStream("count.txt");
            x = fis.read();
            while(x != -1){
                if(x==32){
                    countWord++;
                    countChar--;
                }
                else if(x==10){
                    countLine++;
                    countWord++;
                    countChar-=2;
                }
                countChar++;
                x = fis.read();     
            }
            countWord++;
            countLine++;
            System.out.println("No of Characters : "+countChar);
            System.out.println("No of Word : "+countWord);
            System.out.println("No of Line : "+countLine);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}