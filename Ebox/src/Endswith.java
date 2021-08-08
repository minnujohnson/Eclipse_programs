import java.util.Scanner;

public class Endswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		System.out.println("Enter the end string");
		String startStr = in.nextLine();
		boolean flag = str.endsWith(startStr);
		if(flag){
			System.out.println("\""+str+"\""+" ends with \""+startStr+"\"");
		}
		else{
			System.out.println("\""+str+"\""+" does not end with \""+startStr+"\"");
		}

	}

}
