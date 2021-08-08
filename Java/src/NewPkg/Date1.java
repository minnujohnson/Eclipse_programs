package NewPkg;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Date1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		String s1=sc.nextLine();
		if(s1.matches("[0-9]{2}[/]{1}[0-9]{2}[/]{1}[0-9]{4}"))
		{
			SimpleDateFormat sdf=new SimpleDateFormat("dd/mm/yyyy");
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
		{
			System.out.println("false");
		}
		

	}

}
