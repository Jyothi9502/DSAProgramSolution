/**
 * You are given a large integer represented as an integer array digits, where each digits[i] is the ith digit of the integer. The digits are ordered from most significant to least significant in left-to-right order. The large integer does not contain any leading 0's.

Increment the large integer by one and return the resulting array of digits.

 

Example 1:

Input: digits = [1,2,3]
Output: [1,2,4]
Explanation: The array represents the integer 123.
Incrementing by one gives 123 + 1 = 124.
Thus, the result should be [1,2,4].
Example 2:

Input: digits = [4,3,2,1]
Output: [4,3,2,2]
Explanation: The array represents the integer 4321.
Incrementing by one gives 4321 + 1 = 4322.
Thus, the result should be [4,3,2,2].
Example 3:

Input: digits = [9]
Output: [1,0]
Explanation: The array represents the integer 9.
Incrementing by one gives 9 + 1 = 10.
Thus, the result should be [1,0].
 */
package basics;
import java.io.*;
import java.util.Scanner;
public class PlusOneToLast {

	public static void main(String[] args) throws IOException{
		
		Scanner br = new Scanner(System.in);
		
		int size = br.nextInt();
		int[] arr = takeInput(size,br);
		System.out.println("begore Adding :");
		printArray(arr);
		System.out.println("after Adding");
	arr =	addone(arr);
		printArray(arr);

	}
	
	public static int[] takeInput(int size,Scanner br) throws IOException {
		int[] arr = new int[size];
		for(int i = 0; i < size;i++) {
			arr[i] = br.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
		
	public static int[]  addone(int [] arr) {
		
		for(int i = arr.length -1; i >= 0; i--) {
			if(arr[i] < 9) {
				arr[i]  = arr[i] +1;
				return arr;
			}
			arr[i] = 0;
		}
		
		int[] res = new int[arr.length +1];
		res[0] = 1;
		return res;
		
	}
}
