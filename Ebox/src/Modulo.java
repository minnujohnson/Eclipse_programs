import java.util.Arrays;
import java.util.Scanner;

public class Modulo {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		int[] num = new int[10];
		int[] rem = new int[10];
		int count = 0;
		int i;
		for (i = 0; i < 10; i++) {
		num[i] = in.nextInt();
		rem[i] = num[i] % 42;
		}
		Arrays.sort(rem);
		for (i = 0; i <rem.length - 1; i++) {
		if (rem[i] != rem[i + 1]) {
		count++;
		}
		}
		count++;
		System.out.println(count);// TODO Auto-generated method stub

	}

}
