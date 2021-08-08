package NewPkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date2 {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		if(s1.matches("[0-9][2]:[0-9]{2}\\s(am|pm|AM|PM)")) 
		{
			SimpleDateFormat sdf=new SimpleDateFormat("hh:mm");
			sdf.setLenient(false);
			try {
				Date d1=sdf.parse(s1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println("valid");
			
		}
		else
			System.out.println("invalid");
	}

}
