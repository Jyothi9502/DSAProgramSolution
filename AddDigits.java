package general;

import java.util.Scanner;

public class AddDigits {
	
    public static int addDigits(int num) {
        if(num == 0){
            return 0;
        }
        else{
            while(num >= 10){
                int digitsum = sum(num);
                if(digitsum <= 9){
                    return digitsum;
                }else{
                    num = digitsum;
                }
            }
        }
        return num;
        
        
    }
    private static int sum(int n){
        int s = 0;

    while(n > 0){
        int digit = n%10;
        s= s+digit;
        n = n/10;

    }
    return s;
    
    }
    
    public static void main(String[] args) {
    	Scanner sc = new Scanner(System.in);
    	int num = sc.nextInt();
    	
    	System.out.println(addDigits(num));
    }
}