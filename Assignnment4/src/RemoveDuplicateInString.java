
public class RemoveDuplicateInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub


		String s = "DEEPU";

		s = s.toLowerCase();

		StringBuffer sb = new StringBuffer(s);

		for(int i=0;i<sb.length();i++) {

			for(int j=i+1;j<sb.length();j++) {

				if(sb.charAt(i)==sb.charAt(j)) {

					sb.setCharAt(j, '$');
				}
			}
		}

		s = sb.toString();

		s =s.replace("$","");

		System.out.println(s);

	}

}
