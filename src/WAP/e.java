package WAP;

public class e {
	
	//9. WAP to remove the alphabets from the String
	//Ans
	
	public static void main(String[] args) {
		String s = "d5de5dd56d5dd";
		int digit = 0;
		String numericstring = "";
	for (int i = 0; i < s.length(); i++) {
		if (Character.isDigit(s.charAt(i))) {
			numericstring = numericstring + s.charAt(i);
		}
		}
		System.out.println("The numeric string is :" + numericstring);
	}

}
