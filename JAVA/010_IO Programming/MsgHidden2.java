import java.io.*;
class ReadImage{
    FileInputStream fis;
    ReadImage(){
        try{
            fis = new FileInputStream("utam33.jpg");
        }catch(Exception e){
            e.printStackTrace();
        } 
    }
    void read(int skip, int stl){
        try{
            int x=0;
            fis.skip(skip);
            for (int i=0; i<stl; i++){
                x = fis.read();
                System.out.print((char)x);
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        System.out.println();
    }
}
class WriteImage{
    FileInputStream fis3;
    FileOutputStream fos3;
    String str = "I am Uttam Nagvadiya";
    String str2 = "I am Software Engineer";
    String str3 = "I am Study in Darshan University";
    WriteImage(){
        try{
            fis3 = new FileInputStream("utam.jpg");
            fos3 = new FileOutputStream("utam33.jpg");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    void write(String str, int z){
        try{
            for(int i=0; i<str.length(); i++){
                fos3.write((char)str.charAt(i));
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    void writeDemo(){
        try{
            int j=1;
            int x=0;
            x = fis3.read();
            while(x != -1){
                fos3.write(x);
                x = fis3.read();
                if(j==79){
                    write(str, str.length());
                }
                if(j==179){
                    write(str2, str2.length());
                }
                if(j==256){
                    write(str3, str3.length());
                }
                j++;
            }
        }catch(Exception e){
            e.printStackTrace();
        }
    }
    void readDemo(){
        System.out.println("----------------------->> MESSAGE IS <<-----------------------");
        ReadImage read = new ReadImage();
        read.read(79, str.length());
        read.read(100, str2.length());
        read.read(77, str3.length());
    }
}
public class MsgHidden2{
    public static void main(String[] args){
        WriteImage write = new WriteImage();
        write.writeDemo();
        write.readDemo();
    }
}   