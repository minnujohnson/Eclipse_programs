import java.util.Scanner;

public class cheer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the size of matrix:");
		int n = in.nextInt();
		char[][] matrix = new char[n][n];
		for(int i= 0;i<n;i++){
			for(int j=0;j<n;j++){
				if(i==j || ((i + j) == (n-1))){
					matrix[i][j] = 'M';
				}
				else if((i==0 || i == n-1) || j == 0 || j == n-1){
					matrix[i][j] = 'F';
				}
				else{
					matrix[i][j] = 'C';
				}
			}
		}
		for(int i = 0;i<n;i++){
			for(int j=0;j<n;j++){
				System.out.print(matrix[i][j]+" ");
			}
			System.out.println();
		}

	}

}
