import java.util.Scanner;

public class Lowercase {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		char[] charArray = str.toCharArray();
		String strNew = "";
		int count = 0;
		for(char character : charArray){
			if(character != 'x'){
				strNew = strNew + character;
				count++;
			}
		}
		for(int i = 0;i<str.length()-count;i++){
			strNew = strNew + 'x';
		}
		System.out.println("The processed string is "+strNew);

	}

}
