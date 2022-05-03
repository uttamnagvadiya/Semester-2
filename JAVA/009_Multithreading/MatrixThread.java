import java.util.*;
class Matrix {
	Matrix(){
		// Scanner input = new Scanner(System.in);
		// System.out.print("How many you got Row : ");
		// int m = input.nextInt();
		// System.out.print("How many you got Column : ");
		// int n = input.nextInt();


		int [][] mat = new int[3][3];

		for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
            	System.out.print("Elements [" + i + "][" + j + "] : ");
            	mat[i][j] = input.nextInt();
        	}
    	}
    	for(int i=0;i<m;i++){
        	for(int j=0;j<n;j++){
            	System.out.print(mat[i][j]+" ");
        	}
        	System.out.println();
    	}
	}
}
public class MatrixThread{
	public static void main(String[] args) {
		Matrix m1 = new Matrix();
	}
}