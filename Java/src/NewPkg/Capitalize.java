package NewPkg;

import java.util.Scanner;
import java.util.StringTokenizer;
class User1 {public static String printCapitalized(String s) {
	StringTokenizer st=new StringTokenizer(s," ");
	StringBuffer sb=new StringBuffer();
	
	while(st.hasMoreTokens())
	{
		String s1=st.nextToken();
		sb.append(s1.substring(0,1).toUpperCase());
		sb.append(s1.substring(1));
		sb.append(" ");
	}
	return sb.toString();
	
}
}

public class Capitalize {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String s = sc.nextLine();
		System.out.println(User1.printCapitalized(s));

	}

}
