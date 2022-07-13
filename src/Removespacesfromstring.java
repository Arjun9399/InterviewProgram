
public class Removespacesfromstring {
public static void main(String[] args) {
	String str="The Sun is the brightest star";
	System.out.println("Given string is "+str);
	//to remove all spaces
	String newstr=str.replaceAll("\\s", "");
	//result without spaces
	System.out.println("The String with out spaces is \n"+newstr);
}
}
