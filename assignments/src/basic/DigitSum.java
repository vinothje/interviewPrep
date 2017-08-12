package basic;

public class DigitSum {

	static int DigSum(int n) {
		if(n<=0) return 0;
		int r = n%10;
		n=n/10;
		return r+ DigSum(n);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(DigSum(5234));
	}

}
