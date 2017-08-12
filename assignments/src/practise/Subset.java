package practise;

public class Subset {
	static void perm(String str) {
		char[] ch = str.toCharArray();
		int[] count = new int[ch.length];
		for (int i = 0; i < ch.length; i++) {
			count[i] = 1;
		}
		char[] res = new char[ch.length];
		findPerm(ch, res, count, 0, 0);
	}

	static void findPerm(char[] ch, char[] res, int[] count, int level, int index) {
		printPerm(res, level);
		
		for (int i = index; i < ch.length; i++) {
			if (count[i] == 0) {
				continue;
			}
			res[level] = ch[i];
			count[i]--;
			findPerm(ch, res, count, level + 1, i);
			count[i]++;
		}
	}

	static void printPerm(char[] res, int len) {
		for (int i = 0; i < len; i++) {
			System.out.print(res[i]);
		}
		System.out.println();
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		perm("abc");
	}
}
