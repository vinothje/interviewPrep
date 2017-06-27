package basic;

// reversing the sentence with "in place" algorithm
public class ReverseSentence {
	
	static void reverseSent(String str) {
		char ch[] = new char[str.length()+1];
		for(int i=0;i<str.length();i++) {
			ch[i] = str.charAt(i);
		}
		reverse(ch, 0, ch.length-1);
		int i, j=0;
		for(i=0;i <ch.length;i++) {
			if(ch[i] == ' ') {
				reverse(ch, j, i-1);
				j=i+1;
			}
		}
		reverse(ch, j, i-1);
		System.out.println(ch);
	}
	
	// abcde => 
	static void reverse(char[] ch, int start, int end) {
		char tmp;
		for(int i=start, j=end; i<= (Math.ceil((start+end)/2)); i++, j--) {
			tmp = ch[i];
			ch[i] = ch[j];
			ch[j] = tmp;
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the is why";
		reverseSent(str);
	}
}
