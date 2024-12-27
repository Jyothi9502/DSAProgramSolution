package recursion;

import java.util.Scanner;

public class MultiplicationUsingRecursion {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		int multiplier = sc.nextInt();
		
		int product = multiplication(num,multiplier);
		System.out.println(product);

	}
	
	public static int multiplication(int n, int m) {
		if( m == 0 || n == 0) {
			return 0;
		}
		if( m == 1) {
			return n;
		}
		
		return n+multiplication(n, m-1);
	}

}
