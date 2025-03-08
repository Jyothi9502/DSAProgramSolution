package searching;
import java.io.*;
import java.util.Scanner;
public class BinarySearch {

	public static void main(String[] args) throws IOException{
		
		Scanner br = new Scanner(System.in);
		
		int size = br.nextInt();
		int[] arr = takeInput(size,br);
		printArray(arr);
		
		int searchElement = br.nextInt();
		System.out.println("Binary Search :");
		System.out.println("Search Element"+searchElement+" Found At Index :"+binarySearch(arr,searchElement));
	}
	
	public static int[] takeInput(int size,Scanner br) throws IOException {
		int[] arr = new int[size];
		for(int i = 0; i < size;i++) {
			arr[i] = br.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		System.out.println();
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();
	}
	
	public static int binarySearch(int[] arr,int sE) {
		int s = 0,e = arr.length-1;
		
		
		while(s <= e) {
		int	mid = (s+e)/2;
			if(arr[mid] < sE) {
				s = mid+1;
			}else if( arr[mid] > sE) {
				e = mid-1;
			}
			else if(arr[mid] == sE) {
				return mid;
			}
		}
		
		return -1;
	}

}
