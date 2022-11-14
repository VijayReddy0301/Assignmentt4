
public class MaxOccurCharacter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String s = "A B a T A A T   ";

		s = s.toLowerCase();
		
		s = s.replace(" ", "");

		int max =0,count =0,index =0;

		for(int i=0;i<s.length();i++) {

			for(int j=0;j<s.length();j++) {

				if(s.charAt(i)==s.charAt(j)) {

					count++;
				}
			}

			int newMax = count;
			count =0;

			if(newMax>max) {

				max = newMax;
				index =i;
			}
		}

		if(max ==1) {

			System.out.println("All Characters Are Max Occured 1 Time Each");

		}else {

			System.out.println(s);
			System.out.println("The maximum Occurance Of Character is --> "+ "'"+s.charAt(index)+"'"+ " Occurred --> "+ max +" Times");

		}
	}

}
