public class AlphabetDigitSpecial {

	public static void main(String[] args) {
		char c='*';
		if((c>='a' && c<='z') || (c>='A' && c<='Z')) 
			System.out.println(c+" is an alphabet.");
		
		else if(c>='0' && c<='9')
		
			System.out.println(c+" is a digit.");
		
		else
			System.out.println(c+" is a special character.");

	}

}
