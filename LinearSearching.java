package searching;

import java.io.IOException;
import java.util.Scanner;

public class LinearSearching {

	public static void main(String[] args) {
		Scanner br = new Scanner(System.in);
		
		int size = br.nextInt();
		int[] arr = takeInput(size,br);
		printArray(arr);
		
		int searchElement = br.nextInt();
		System.out.println("Search Element"+searchElement+" Found At index :"+ linearSearch(arr,searchElement));

	}
	
	public static int[] takeInput(int size,Scanner br)  {
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
	
	public static int linearSearch(int[] arr,int s) {
		for(int i = 0; i < arr.length;i++) {
			if(arr[i] == s) {
				return i;
			}
		}
		return -1;
	}

}
