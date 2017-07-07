package basic;

import java.util.Arrays;

/*
Input : [4, 3, 9, 2, 1, 8, 8, 7, 6]
Output : [1, 2, 3, 4, 6, 7, 8, 8, 9]
Input : []
Output : []
Input : [34, 546, 23, 34, 6, 2, 6, 3, 434]
Output : [2, 3, 6, 6, 23, 34, 34, 434, 546]
*/
/**
 * Created by vinothjeevanandam on 6/29/17.
 */
public class MergeSort {
    MergeSort() {}

    private void doSort(int[] arr) {
    	if(arr.length <= 1) return;
        int mid = arr.length/2;
        int[] larr = new int[mid];
        for(int i=0;i<mid;i++) {
            larr[i] = arr[i];
        }
        int[] rarr = new int[arr.length-mid];
        for(int i=mid, j=0;i<arr.length;i++, j++) {
        	rarr[j] = arr[i];
        }
        doSort(larr);
        doSort(rarr);
        merge(arr, larr, rarr);
    }
    
    private void merge(int[] arr, int[] larr, int[] rarr) {
    	int i=0,j=0,k=0;
    	while(i < larr.length && j < rarr.length) {
    		if(larr[i] < rarr[j]) {
    			arr[k] = larr[i];
    			i++;
    			k++;
    		} else {
    			arr[k] = rarr[j];
    			j++;
    			k++;
    		}
    	}
    	
    	while(i < larr.length) {
    		arr[k] = larr[i];
    		i++;
    		k++;
    	}
    	
    	while(j < rarr.length) {
    		arr[k] = rarr[j];
    		j++;
    		k++;
    	}
    }

    public static void main(String[] args) {
        int[] arr1 = new int[] {4,3,9,2,1,8,8,7,6};
        System.out.println("Input : " + Arrays.toString(arr1));
        MergeSort m1 = new MergeSort();
        m1.doSort(arr1);
        System.out.println("Output : " + Arrays.toString(arr1));

        int[] arr2 = new int[] {};
        System.out.println("Input : " + Arrays.toString(arr2));
        MergeSort m2 = new MergeSort();
        m2.doSort(arr2);
        System.out.println("Output : " + Arrays.toString(arr2));

        int[] arr3 = new int[] {34,546,23,34,6,2,6,3,434};
        System.out.println("Input : " + Arrays.toString(arr3));
        MergeSort m3 = new MergeSort();
        m3.doSort(arr3);
        System.out.println("Output : " + Arrays.toString(arr3));
    }
}
