package basic;

import java.util.Arrays;

/*
Input : [4, 3, 9, 2, 1, 8, 8, 7, 6]
Input : []
Input : [34, 546, 23, 34, 6, 2, 6, 3, 434]
[1, 2, 3, 4, 6, 7, 8, 8, 9]
[]
[2, 3, 6, 6, 23, 34, 34, 434, 546]

 */

public class QuickSort {
	private void qsort(int[] arr, int start, int end) {
		if(start >= end) return;
		int pindex = partition(arr, start, end);
		
		qsort(arr, start, pindex-1);
		qsort(arr, pindex+1, end);
	}
	
	private int partition(int[] arr, int start, int end) {
		int pivot = arr[end];
		int pindex = start;
		int i=start;
		while(i < end) {
			if(arr[i] < pivot) {
				int temp = arr[pindex];
				arr[pindex] = arr[i];
				arr[i] = temp;
				
				pindex++;
			}
			i++;
		}
		int temp = arr[pindex];
		arr[pindex] = pivot;
		arr[end] = temp; 
		return pindex;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		QuickSort q1 = new QuickSort();
		int[] arr1 = {4,3,9,2,1,8,8,7,6};
		System.out.println("Input : " + Arrays.toString(arr1));
		int[] arr2 = {};
		System.out.println("Input : " + Arrays.toString(arr2));
		int[] arr3 = {34,546,23,34,6,2,6,3,434};
		System.out.println("Input : " + Arrays.toString(arr3));
		q1.qsort(arr1, 0, arr1.length-1);
		System.out.println(Arrays.toString(arr1));
		q1.qsort(arr2, 0, arr2.length-1);
		System.out.println(Arrays.toString(arr2));
		q1.qsort(arr3, 0, arr3.length-1);
		System.out.println(Arrays.toString(arr3));
	}

}
