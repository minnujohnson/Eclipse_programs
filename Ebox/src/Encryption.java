import java.util.Scanner;

public class Encryption {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		String str = in.next();
		char[] charArray = str.toCharArray();
		char[] array1 = new char[50];
		int[] count = new int[50];
		int i = 0;
		int flag = 0;
		for(int j=0;j<str.length();j++){
			if(array1.length == 0){
				array1[i] = charArray[j];
				count[i]++;
				i++;
			}
			else{
				for(int k = 0;k<array1.length;k++){
					if(charArray[j] == array1[k]){
						count[k]++;
						flag = 1;
					}
				}
				if(flag == 0){
					array1[i] = charArray[j];
					count[i]++;
					i++;
				}
			}
			
			flag = 0;
		}
		String strEn = "";
		for(int k=0;k<i;k++){
			strEn = strEn+array1[k]+count[k];
		}
		
		System.out.println(strEn);

	}

}
