
public class NumberOfDigit {
public static void main(String[] args) {
	int number=703832;
	int count=0;
	int temp=number;
	//Given number
	System.out.println("Given number is = "+number);
	while(number>0)
	{
	number=number/10;
	count=count+1;
	}
	//Count of Digit
	System.out.println("Number of digit present in "+temp+" is "+count);
}
}
