import java.util.Scanner;

public class chess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int order[][] = new int[2][n];
		for (int i = 0; i < n; i++) {
			order[0][i] = in.nextInt();
			order[1][i] = in.nextInt();
		}
		boolean flag = false;
		for (int i = 0; i < n - 1 && flag == false; i++) {
			for (int k = i + 1; k < n && flag == false; k++) {
				if ((order[0][i] == order[0][k])|| (order[1][i] == order[1][k])) {
					flag = true;
				}
			}
		}
		if (flag == true) {
			System.out.println("NOT SAFE");
		} else {
			System.out.println("SAFE");
		}

	}

}
