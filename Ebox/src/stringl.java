import java.util.Scanner;

public class stringl {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.nextLine();
		String newStr = "";
		String[] strArray = str.split(" ");
		for(int i=2;i<strArray.length;i++){
			newStr = newStr + strArray[i] + " ";
		}
		newStr = newStr + strArray[0] + " " + strArray[1];
		System.out.println(newStr);

	}

}
