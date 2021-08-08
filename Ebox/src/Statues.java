import java.util.Scanner;

public class Statues {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int n = in.nextInt();
		int room[] = new int[n];
		int count = 0;
		int sum = 0;
		for (int i = 0; i < n; i++) {
			room[i] = in.nextInt();
			sum += room[i];
		}
		sum /= n;
		for (int i = 0; i < room.length; i++) {
			if (room[i] - sum > 0) {
				count += (room[i] - sum);
			}
		}
		System.out.println(count);

	}

}
