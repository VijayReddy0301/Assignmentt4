
public class CountVowelsAndCons {

	public static void main(String[] args) {
		
		String s = "The quick brown fox jumps over the lazy dog.";
		
		s= s.replace(" ", "");
		
		s = s.toLowerCase();
		
		int vowelsCount =0;
		
		int consonantCount = 0;
		
		int specialCharCount =0;
		
		for(int i=0;i<s.length();i++) {
			
			char ch = s.charAt(i);
			
			if(ch == 'a' || ch == 'e'|| ch == 'i' || ch=='o' || ch == 'u') {
				
				vowelsCount++;
				
			}else if((ch >=32 && ch<=47) || (ch>=58 && ch<=64) || (ch>=91 && ch<=96)|| (ch>=123 && ch<=126) ) {
				
				specialCharCount++;
				
			}else if(ch>='a' && ch<='z') {
				
				consonantCount++;
			}
			
		}
		
		System.out.println("The String is -"+s);
		
		System.out.println("==============================================");
		
		System.out.println("Total Vowels Present in The String is -> "+vowelsCount);
		
		System.out.println("--------------------------------------------------------------");
		
		System.out.println("Total Consonants Present In The String is -> "+consonantCount);
		
		System.out.println("--------------------------------------------------------------");
		
		
		System.out.println("Total Special Characters Present In the String is -> "+specialCharCount);
		
	}
}
