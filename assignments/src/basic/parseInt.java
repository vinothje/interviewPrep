package basic;

/*
 output:
 
 52323.0
52.323
-52.323
-525234.0
-0.523423
0.0

 */
public class parseInt {
	
	double parseIntImpl(String str) {
		if (str.length() == 0) return 0;
		char ch[] = str.toCharArray();
		double sum = 0;
		int i = ch.length-1;
		int j = 0, dot = 0;
		boolean minus = false;
		while( i >= 0 ) {
			if(ch[i] == '-') {
				minus = true;
			} else if(ch[i] == '.') {
				dot = j;
			} else {
				sum += (ch[i] - '0')  * Math.pow(10, j);
				j++;
			}
			i--;
		}
		if(dot > 0) {
			sum = sum / Math.pow(10, dot);
		}
		if(minus) {
			sum = sum * -1;
		}
		return sum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		parseInt p1 = new parseInt();
		System.out.println(p1.parseIntImpl("52323"));
		parseInt p2 = new parseInt();
		System.out.println(p2.parseIntImpl("52.323"));
		parseInt p3 = new parseInt();
		System.out.println(p3.parseIntImpl("-52.323"));
		parseInt p4 = new parseInt();
		System.out.println(p4.parseIntImpl("-525234"));
		parseInt p5 = new parseInt();
		System.out.println(p5.parseIntImpl("-.523423"));
		parseInt p6 = new parseInt();
		System.out.println(p6.parseIntImpl(""));
	}

}
