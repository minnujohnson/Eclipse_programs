import java.util.Scanner;

public class capit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		String[] strArray = str.split(" ");
		String strNew = "";
		for(int i=0;i<strArray.length;i++){
			strArray[i] = strArray[i].toUpperCase().substring(0,1) + strArray[i].substring(1);
			strNew = strNew + strArray[i] + " ";
		}
		System.out.println("Capitalized version:");
		System.out.println(strNew);

	}

}
