
public class Palindrome {

	public static void main(String[] args) {

		String s ="2552";

		int low = 0;

		int high = s.length()-1;

		boolean flag = false;

		while(low < high) {

			if(flag == false) {

				if(s.charAt(low)!=s.charAt(high)) {

					System.out.println("2552 is not Palindrome" );

					flag = true;

				}
			}

			low++;
			high--;

		}

		if(flag == false) {

			System.out.println("2552 is Palindrome String");
		}
	}

}
