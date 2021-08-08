import java.util.Scanner;

public class StrinfVerti {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		System.out.println("The string printed vertically forwards and backwards is");
		char[] charArray = str.toCharArray();
		int length = str.length();
		for(int i=0;i<length;i++){
			System.out.println(charArray[i]+" "+charArray[length-i-1]);
		}

	}

}
