import java.util.Scanner;

public class lastIndex {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the string");
		String str = in.nextLine();
		System.out.println("Enter the string to be searched");
		String strSearch = in.nextLine();
		int index = str.lastIndexOf(strSearch);
		System.out.println("The index of last occurence of \""+strSearch+"\" is "+index);
		System.out.println("Enter the index limit");
		int limit = in.nextInt();
		int newIndex = str.lastIndexOf(strSearch, limit);
		System.out.println("First occurence of \""+strSearch+"\" from "+limit+"th index backwards is "+newIndex);

	}

}
