package sorting;

import java.io.IOException;
import java.util.Scanner;

public class BubbleSort {

	public static void main(String[] args) {
  Scanner br = new Scanner(System.in);
		
		int size = br.nextInt();
		int[] arr = takeInput(size,br);
		System.out.println("Before Sorting :");
		printArray(arr);
		bubblesort(arr);
		System.out.println("After Sorting :");
		printArray(arr);
		

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
	
	
	public static void bubblesort(int[] arr) {
		for(int i = 0; i < arr.length-1;i++) {
			for(int j =0; j < arr.length-1-i;j++){
				if(arr[j] > arr[j+1]) {
					int temp = arr[j];
					arr[j] = arr[j+1];
					arr[j+1]= temp;
					}
			}
		}
	}

	}


