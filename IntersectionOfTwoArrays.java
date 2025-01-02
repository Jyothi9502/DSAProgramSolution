package basics;
import java.io.*;
import java.util.Scanner;
public class IntersectionOfTwoArrays {

	public static void main(String[] args) throws IOException{
		
		Scanner br = new Scanner(System.in);
		
		int size1 = br.nextInt();
		int[] arr1 = takeInput(size1,br);
		int size2 = br.nextInt();
		int[] arr2 = takeInput(size2, br);
		printArray(arr1);
		printArray(arr2);
		int[] common = intersection(arr1,arr2);
		printArray(common);

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
	public static int[] intersection(int[] nums1, int[] nums2) {
        int[] arr = new int[0];
        for(int i = 0; i < nums1.length; i++){
            for(int j = 0; j < nums2.length; j++){
                if(nums1[i] == nums2[j]){
                    if(arr.length == 0){
                        arr = new int[1];
                        arr[0]  = nums1[i];
                    }else{
                        if(checkForElement(nums1[i],arr)){
                            int temp[] = arr;
                            arr = new int[temp.length+1];
                            for(int x = 0; x < temp.length; x++){
                                arr[x] = temp[x];
                            }
                            arr[temp.length] = nums1[i];
                        }
                    }
                }
            }
        }
        return arr;
    }

    private static boolean checkForElement(int num,int[] arr){
    for(int i = 0; i < arr.length; i++){
        if(arr[i] == num){
            return false;
        }
    }
    return true;
    }

}
