
public class ReverseString {
public static void main(String[] args) {
	String str="The Sun is brightest star in universe";
	String reverse="";
	//String to array conversion
	char[] a = str.toCharArray();//String to array conversion
	System.out.println("Given String is = "+str);
	//length of string
	int length=str.length();
	for(int i=length-1;i>=0;i--)
	{
	reverse=reverse+a[i];
	}
	//reverse string
	System.out.println("The reverse is = "+reverse);
}
}
