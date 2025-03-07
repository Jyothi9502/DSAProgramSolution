package Interview;
import java.util.Scanner;
/**
 * 1abc2
pqr3stu8vwxf
a1b2c3d4e5f
treb7uchet
12+38+15+77=142


1abc2
1 t0 5
se = s.
64 = 9
63 = 8
62
61
62

 */
public class Program1 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int size = sc.nextInt();
		String[] str = new String[size];
		for(int i = 0 ; i < size; i++) {
			str[i] = sc.next();
		}
			int sum = 0;
				for(int j =0 ;  j < str.length; j++) {
					String num = "";
					String s1 = str[j];
	for(int i = 0; i < s1.length();i++) {
		
		char c = s1.charAt(i);
		if(c ==  '1' || c ==  '2' || c ==  '3' || c ==  '4' ||c ==  '5' || c ==  '6' || c ==  '7' || c ==  '8'  || c ==  '9'  || c <= '0') {
			num =num+c;
			break;
		}
	}
	for(int i = s1.length()-1; i >= 0; i-- ) {
		char  c = s1.charAt(i);
		if( c ==  '1' ||  c ==  '2' || c ==  '3' || c ==  '4' ||c ==  '5' || c ==  '6' || c ==  '7' || c ==  '8'  || c ==  '9'  || c <= '0') {
			num = num+c;
			break;
		}
	}
	
		int temp = (int)Integer.parseInt(num);
		sum = sum+temp;
				}
				System.out.println(sum);
				
				sc.close();
		
	}

}
