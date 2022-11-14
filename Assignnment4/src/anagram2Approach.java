
public class anagram2Approach {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "Race";

		String ss = "love";

		boolean flag = false;


		String s1 ="";

		for(int i=0;i<s.length();i++) {

			char ch =s.charAt(i);

			if(ch>='A'  && ch<='Z' ) {

				ch = (char) (ch+32);

			}

			s1 = s1+ch;
		}


		String s2 ="";

		for(int i=0;i<ss.length();i++) {

			char ch1 =ss.charAt(i);

			if(ch1>='A'  && ch1<='Z' ) {

				ch1 = (char) (ch1+32);

			}

			s2 = s2+ch1;
		}


		int[] alphabet = new int[26];

		for(int i=0;i<s1.length();i++) {

			alphabet[(s1.charAt(i) -'a')]++;

		}


		for(int i=0;i<s2.length();i++) {

			alphabet[(s2.charAt(i) -'a')]--;

		}


		for(int i : alphabet) {

			if(i!=0) {
				
				System.out.println("The Given String Is Not Anagram");
				
				flag = true;
				
				break;
			}
		}

		if(flag == false) {

			System.out.println("The Given String is Anagram");

		}


	}

}
