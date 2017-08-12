package basic;

import java.util.Arrays;

public class SortNumbers {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {3,4,5,7,2,8,9,1};
		
		Arrays.sort(arr);
		System.out.println(Arrays.toString(arr));
				
		int k=0;
		int j;
		while(k<arr.length) {
			j=k;
			for(int i=0;i<=j;i++) {
				if(k>arr.length-1) {
					break;
				}
				System.out.print(arr[k++]);
			}
			System.out.println();
		}
	}
	
}
