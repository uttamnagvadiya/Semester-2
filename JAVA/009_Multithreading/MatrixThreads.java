import java.util.*;
class Matrix extends Thread{
	public void run(){
		Scanner input = new Scanner(System.in);
        
		// System.out.print("How many you got Row : ");
		// int m = input.nextInt();
		// System.out.print("How many you got Column : ");
		// int n = input.nextInt();


		int [][] mat = new int[3][3];

		for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
            	System.out.format("Element [%d][%d] : ",(i+1),(j+1));
            	mat[i][j] = input.nextInt();
        	}
    	}
    	for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
            	System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
    	}

		int sum = 0;
		for(int i=0;i<3;i++){
        	for(int j=0;j<3;j++){
            	sum = sum + mat[i][j];
        	}
        	System.out.format("Addition is Elements of %d Row : %d\n",(i+1),sum);
        	sum = 0;
    	}
	}
}

public class MatrixThreads{
	public static void main(String[] args) {
		Matrix m1 = new Matrix();
		m1.start();
	}
}
