package NewPkg;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
class User4 {
	public static String extractMax(String s)
	{ 
		String s1 = null;
		if(s.matches("[0-9]{2}-[0-9]{2}-[0-9]{4}"))
		{
			SimpleDateFormat sdf=new SimpleDateFormat("MM-dd-yyyy");
			SimpleDateFormat sdf1=new SimpleDateFormat("EEEE");
			Date d1;
			try {
				d1 = sdf.parse(s);
				sdf.setLenient(false);
				s1=sdf1.format(d1);
			} catch (ParseException e) {
				// TODO Auto-generated catch block
				System.out.println("invalid");;
			}
		}
		
		return s1;
	
	}
}


public class Vow5 
{public static void main(String[] args) throws ParseException
{Scanner sc = new Scanner(System.in);

String s=sc.next();

System.out.println(User4.extractMax(s));
}}
