import java.util.Scanner;

public class Magic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		int temp = num;
		String str = Integer.toString(num);
		int flag = 0;
		int i = 1;
		int count = 0;
		while (flag == 0 && temp != 0) {
			if (temp % 10 == 4) {
				num = num + (3 * i);
				flag = 1;
			} else if (temp % 10 == 7) {
				num = num - (3 * i);
				i *= 10;
				temp = temp / 10;
			}
			count++;
		}
		if (count == str.length() && flag == 0) {
			num = num + 4 * i;
		}
		System.out.println(num);

	}

}
