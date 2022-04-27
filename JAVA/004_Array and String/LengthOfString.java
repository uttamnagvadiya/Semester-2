public class LengthOfString{
    public static void main(String[] args){
        String str = "Life is Great";
        
        System.out.println("Length of String : " + str.length());

        int length = str.length() / 2;
        System.out.println("Half String : " + str.substring(length));
    }
}