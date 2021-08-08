import java.util.Scanner;

public class removeSpace {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		String str2 = "";
		String[] strArray = str.split(" ");
		for(String str1 : strArray){
			if(str1.equals("")){
				
			}else{
				str2 = str2 + str1 + " ";
			}
		}
		System.out.println("The processed string is "+str2);

	}

}
