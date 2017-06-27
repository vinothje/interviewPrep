package basic;

//reversing the sentence without "in place" algorithm

public class ReverseSentence_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "the sky is blue";
		String[] strsplit = str.split(" ");
		StringBuffer res = new StringBuffer();
		for(int i=strsplit.length-1; i>=0;i--) {
			res.append(strsplit[i] + " ");
		}
		System.out.println(res);
	}
}
