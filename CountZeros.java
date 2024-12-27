package recursion;

import java.util.Scanner;

public class CountZeros {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		System.out.println(zeroCount(num));

	}
	
	public static int zeroCount(int num) {
		return zeroCount(num,0);
	}
	
	public static int zeroCount(int num, int count) {
		if(num <= 0) {
			return count;
		}
		
		
		int res =  zeroCount(num/10,count);
		int digit = num%10;
		if(digit == 0) {
			count++;
		}
		return count + res;
		
	}

}
