import java.util.Scanner;

public class Slpit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		String[] strArray = str.split(" ");
		System.out.println("The words in the string are");
		for(String str1 : strArray){
			if(str1.equals("")){
				
			}else{
				System.out.println(str1);
			}
		}

	}

}
