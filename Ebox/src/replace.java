import java.util.Scanner;

public class replace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the content of the document");
		String str = in.nextLine();
		System.out.println("Enter the old name of the company");
		String oldStr = in.nextLine();
		System.out.println("Enter the new name of the company");
		String newStr = in.nextLine();
		System.out.println("The content of the modified document is");
		str = str.replaceAll(oldStr, newStr);
		System.out.println(str);

	}

}
