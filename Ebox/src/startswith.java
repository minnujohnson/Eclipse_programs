import java.util.Scanner;

public class startswith {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		System.out.println("Enter the start string");
		String startStr = in.nextLine();
		boolean flag = str.startsWith(startStr);
		if(flag){
			System.out.println("\""+str+"\""+" starts with \""+startStr+"\"");
		}
		else{
			System.out.println("\""+str+"\""+" does not start with \""+startStr+"\"");
		}

	}

}
