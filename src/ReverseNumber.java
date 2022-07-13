
public class ReverseNumber {
public static void main(String[] args) {
	int number=26426;
	int temp,reverse=0;
	int a=number;
	//Original number
	System.out.println("Given number is = "+a);
	while(number>0)
	{
	temp=number%10;
	reverse=reverse*10+temp;
	number=number/10;
	}
	System.out.println("The reverse of "+a+" is = "+reverse);

}
}
