package NewPkg;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
class User {
public static ArrayList<Integer> generateOddEvenList(ArrayList<Integer> a1,
ArrayList<Integer> a2) 
{
	ArrayList<Integer> a=new ArrayList<Integer>();
	for(int i=0;i<a1.size();i++)
	{
		if(i%2==0)
		{
			a.add(a2.get(i));
		}
		else
			a.add(a1.get(i));
	}
	return a;

	
	
	
	
	
	
}
}
public class SecondWord {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		ArrayList<Integer> al1 = new ArrayList<Integer>();
		ArrayList<Integer> al2 = new ArrayList<Integer>();
		ArrayList<Integer> a = new ArrayList<Integer>();
		for (int i = 0; i < n; i++)
		al1.add(s.nextInt());
		for (int i = 0; i < n; i++)
		al2.add(s.nextInt());
		a = User.generateOddEvenList(al1, al2);
		for (int i = 0; i< a.size(); i++)
		System.out.println(a.get(i));

	}

}
