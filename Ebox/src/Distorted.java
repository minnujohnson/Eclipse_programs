import java.util.Scanner;

public class Distorted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		str = str.replaceAll("iiing", "th");
		System.out.println(str);

	}

}
