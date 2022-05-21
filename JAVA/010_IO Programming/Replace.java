import java.io.*;
public class Replace{
    public static void main(String[]args){
        try{
            FileInputStream fis = new FileInputStream("TXT Files/input.txt");
            FileOutputStream fos = new FileOutputStream("TXT Files/ReplaceInput.txt");
            int x = 0;
            String y;
            x = fis.read();
            while(x != -1){
                fis = fis.replace("Uttam","Kishan");
                fos.write(x);
                x = fis.read();
            }
            fos.close();
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
/*import java.io.*;
public class Replace{
	public static void main(String [] args) throws IOException {
		FileReader f1=new FileReader("TXT Files/input.txt");
		BufferedReader bf=new BufferedReader(f1);
		FileWriter f2=new FileWriter("TXT Files/ReplaceInput.txt");
		String word1,word2;
		BufferedReader bf2=new BufferedReader(new InputStreamReader(System.in));
		System.out.println("Enter  word you want to replace: ");
		word1=bf2.readLine();
		System.out.println("Enter  word you want to replace with: ");
		word2=bf2.readLine();
		String x="",msg="";
		int y =0;
		while((x=bf.readLine())!=null) {
			String[] str = x.split(" ");
			for(String b : str){
				if(b.equals(word1)){
					y++;
				}
			}
			x=x.replaceAll(word1,word2);
			f2.write(x);
			f2.write("\n");
		}
		f2.close();
		f1.close();
		System.out.println("no of replacement : "+y);
		
	}
}*/