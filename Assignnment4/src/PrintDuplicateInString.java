import java.util.Arrays;

public class PrintDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		String s = "Vijay Reddy";
		
		s = s.replace(" ", "");
		
		s = s.toLowerCase();
		
		char[] ch = s.toCharArray();
		
		char[] duplicates = new char[ch.length];
		int j=0;
		
		Arrays.sort(ch);
		
		for(int i =1;i<ch.length;i++) {
			
			if(ch[i] == ch[i-1]) {
				
				duplicates[j]=ch[i];
				j++;
			}
			
		}
		
		for(char i:duplicates) {
			
			System.out.println(i);
		}

	}

}
