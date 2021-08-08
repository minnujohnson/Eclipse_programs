import java.util.Scanner;

public class counting {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int m = in.nextInt();
		int i;
		int j;
		int[][] stars = new int[n][m];
		int sum =0;
		for(i=0;i<n;i++){
			for(j=0;j<m;j++){
				stars[i][j] = in.nextInt();
			}
		}
		int numQuery = in.nextInt();
		int[][] query = new int[numQuery][4];
		for(i=0;i<numQuery;i++){
			for(j=0;j<4;j++){
				query[i][j] = in.nextInt();
			}
		}
		
		for(int k=0;k<numQuery;k++){
			for(i=query[k][0]-1;i<query[k][2];i++){
				for(j=query[k][1]-1;j<query[k][3];j++){
					sum = sum + stars[i][j];
				}
			}
			System.out.println(sum);
			sum = 0;
		}

	}

}
