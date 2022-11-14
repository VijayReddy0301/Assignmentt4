import java.util.Arrays;

public class UniqueCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Hyder Nitin";
		
		s = s.replace(" ", "");

		String s1 ="";

		for(int i=0;i<s.length();i++) {

			char ch =s.charAt(i);

			if(ch>='A'  && ch<='Z' ) {

				ch = (char) (ch+32);

			}

			s1 = s1+ch;
		}

		boolean flag = false;

		char [] ch = s1.toCharArray();

		Arrays.sort(ch);

		for(int i =1 ;i<ch.length;i++) {

			if(ch[i] == ch[i-1]) {
				
				System.out.println(s);
				
				System.out.println("The String Contain Duplicate Characters");
				
				flag = true;
				
				break;
			}
		}

		if(flag == false) {

			System.out.println(s);
			
			System.out.println("String Contains Unique Characters");
		}

	}

}
