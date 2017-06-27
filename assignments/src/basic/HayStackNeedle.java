package basic;

public class HayStackNeedle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String hay = "heththe";
		String needle = "the";
		
		if(hay.length() < needle.length()) {
			System.out.println("not found");
			return;
		}
		
		int k=0;
		for(int i=0; i< hay.length()-needle.length() +1;i++) {
			k = i;
			for(int j=0; j< needle.length();j++) {
				if(hay.charAt(k) != needle.charAt(j)) {
					break;
				} else {
					if(j == needle.length()-1) {
						System.out.println("found at " + i);
						return;
					}
					k++;
				}
			}
		}
		System.out.println("not found");
	}
}
