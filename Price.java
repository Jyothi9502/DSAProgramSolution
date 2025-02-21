package general;

import java.util.Scanner;

public class Price {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int td = sc.nextInt();
		int c = sc.nextInt();
		
		int val = price(td,c);
		System.out.println(val);
	}
	
	public static int price(int td,int c) {
		for(int i = 0; i < td; i++) {
			if(i < 3) {
				c = c+1;
			}else if( i > 2 && i < 6) {
				c= c-2;
			}
			else if( i > 5 && i < 9) {
				c = c+3;
			}else {
				c = c-4;
			}
			
		}
		return c;
	}

}
