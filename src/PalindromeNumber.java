
public class PalindromeNumber {
public static void main(String[] args) {
	int number=78687;
	int temp,reverse=0;
	int original_number=number;
	//Given Number
	System.out.println("Given number is = "+number);
	while(number>0)
	{
	temp=number%10;
	reverse=reverse*10+temp;
	number=number/10;
	}
	//reverse number
	System.out.println("Reverse of number is = "+reverse);
	if(original_number==reverse)
	{
	System.out.println(original_number+" is Palindrome number");
	}
	else
	{
	System.out.println(original_number+" is not Palindrome number");
	}
}
}
