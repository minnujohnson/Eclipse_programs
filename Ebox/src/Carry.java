import java.util.Scanner;

public class Carry {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		long num1 = in.nextLong();
		long num2 = in.nextLong();
		long temp;
		long carry = 0;
		long count = 0;
		while(num1!=0 || num2!=0){
		temp = (num1%10) + (num2%10) + carry;
		if(temp>=10){
		carry = 1;
		count++;
		}
		else{
		carry = 0;
		}
		num1 = num1/10;
		num2 = num2/10;
		}

		System.out.println(count);

	}

}
