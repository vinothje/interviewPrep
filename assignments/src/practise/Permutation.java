package practise;

public class Permutation {
	static void perm(String str) {
		char[] ch = str.toCharArray();
		int[] count = new int[ch.length];
		for(int i=0;i<ch.length;i++) {
			System.out.println(ch[i] +":"+ ch.length);
			count[i] = 1;
		}
		char[] res = new char[ch.length];
		System.out.println(res.length);
		findPerm(ch, res, count, 0);
	}
	
	static void findPerm(char[] ch, char[] res, int[] count, int level) {
		if(res.length == level) {
			printPerm(res);
		}
		for(int i=0;i<ch.length;i++) {
			if(count[i] == 0) {
				continue;
			}
			res[level] = ch[i];
			count[i]--;
			findPerm(ch, res, count, level+1);
			count[i]++;
		}
	}
	
	static void printPerm(char[] res) {
		for(int i=0;i<res.length;i++) {
			System.out.print(res[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("abc");
	}

}
