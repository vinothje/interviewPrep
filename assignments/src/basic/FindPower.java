package basic;

public class FindPower {
	static int prev, curr;
	static int pow2(int n) {
		if(n<1){ 
			return 0;
		} else if(n==1) {
			System.out.println(n);
			return 1;
		} else {
			prev = pow2(n/2);
			curr = prev * 2;
			System.out.println(curr);
			return curr;
		}
	}
	
	public static void main(String[] args) {
		pow2(50);
	
	}

}
