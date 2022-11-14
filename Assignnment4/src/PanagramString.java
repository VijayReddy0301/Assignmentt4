
public class PanagramString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s ="Pack my box with five dozen liquor jugs";

		s =s.replace(" ","");


		String s1 ="";

		for(int i=0;i<s.length();i++) {

			char ch =s.charAt(i);

			if(ch>='A'  && ch<='Z' ) {

				ch = (char) (ch+32);

			}

			s1 = s1+ch;
		}

		boolean flag = false;


		for(char c ='a';c<='z';c++) {

			if(s1.indexOf(c) == -1) {

				System.out.println("Given String Is Not Panagram");

				flag = true;
				break;
			}
		}

		if(flag == false) {

			System.out.println("Given String Is  Panagram");
		}


	}

}
