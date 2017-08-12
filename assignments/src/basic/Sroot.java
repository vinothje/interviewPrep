package basic;

public class Sroot {
	static void sqroot(int n) {
		sqhelper(n, 1, n);
	}
	
	static void sqhelper(int n, int min, int max) {
		if(max < min) System.out.println(-1);
		int guess = (min+max)/2;
		if(guess * guess == n) {
			System.out.println(guess);
		}
		if(guess * guess <n) {
			System.out.println("less:"+guess);
			sqhelper(n, guess+1, max);
		}
		if(guess * guess > n) {
			System.out.println("more:"+guess);
			sqhelper(n, min, guess-1);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		sqroot(100);
	}

}
