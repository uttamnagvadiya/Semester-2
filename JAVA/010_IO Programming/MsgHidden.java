import java.io.*;
public class MsgHidden{
    public static void main(String[] args){
        int j=1;
        String str = "First Bomb Blast in Pakistan.";
        String str2 = "Second Bomb Blast in Taliban.";
        try{
            FileInputStream fis = new FileInputStream("bg.jpg");
            FileOutputStream fos = new FileOutputStream("bg22.jpg");
            int x=0;
            x = fis.read();
            while(x != -1){
                fos.write(x);
                x = fis.read(); 
                if (j==79){
                    for(int i=0; i<str.length(); i++){
                        fos.write(str.charAt(i));
                    }
                }
                if (j==179){
                    for(int i=0; i<str2.length(); i++){
                        fos.write(str2.charAt(i));
                    }
                }
                j++;
            }
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
            System.out.print("hello");
        }

        System.out.println("------------------------->> MESSAGE IS <<----------------------------");

        try{
            FileInputStream fis2 = new FileInputStream("bg22.jpg");
            int x=0;
            fis2.skip(79);
            for (int k=0; k<str.length(); k++){
                x = fis2.read();
                System.out.println(x);
            }
            System.out.println("");
            fis2.skip(100);
            for (int k=0; k<str2.length(); k++){
                x = fis2.read();
                System.out.print((char)x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}