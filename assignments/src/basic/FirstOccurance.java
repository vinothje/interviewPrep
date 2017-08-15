package basic;

public class FirstOccurance {
	static int found=0;
	static int solve(int[] arr, int start, int end, int search) {
		if(start > end) {
			return found;
		}
		int mid = (start+end)/2;
		if(arr[mid] == search) {
			found = mid;
			solve(arr, start, mid-1, search);
		} else if(search < arr[mid]) {
			solve(arr, start, mid-1, search);
		} else {
			solve(arr, mid+1, end, search);
		}
		return found;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = new int[]{1,1,2,2,2,2,3,4};
		System.out.println("result of 2:" + solve(arr, 0, arr.length-1, 2));
		System.out.println("result of 1:" + solve(arr, 0, arr.length-1, 1));
		System.out.println("result of 3:" + solve(arr, 0, arr.length-1, 3));
		System.out.println();
		
		int[] arr1 = new int[]{2,3,3,3,4};
		System.out.println("result of 2:" + solve(arr1, 0, arr1.length-1, 2));
		System.out.println("result of 1:" + solve(arr1, 0, arr1.length-1, 1));
		System.out.println("result of 3:" + solve(arr1, 0, arr1.length-1, 3));
		System.out.println();

		int[] arr2 = new int[]{2,2,2,2,2,2};
		System.out.println("result of 2:" + solve(arr2, 0, arr2.length-1, 2));
		System.out.println("result of 1:" + solve(arr2, 0, arr2.length-1, 1));
		System.out.println("result of 3:" + solve(arr2, 0, arr2.length-1, 3));
	}

}
