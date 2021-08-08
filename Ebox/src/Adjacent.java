import java.util.Scanner;

public class Adjacent {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		char[] charArray = str.toCharArray();
		String strNew = "" + charArray[0];
for (int i = 1; i < str.length(); i++) {
if (charArray[i - 1] == charArray[i]) {
                    strNew += '*';
                    strNew += charArray[i];
              } else {
                    strNew += charArray[i];
              }
        }
        System.out.println("The processed string is " + strNew);

	}

}
