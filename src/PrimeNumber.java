
public class PrimeNumber {
public static void main(String[] args) {
	int number=17;
	int count=0;
	//divide number with all number from 2
	for (int i=2;i<number;i++)
	{
	if(number%i==0)
	{
	count=count+1;
	}
	}
	if(count==0)
	{
	System.out.println("Number is Prime");
	}
	else
	{
	System.out.println("Number is not prime");
	}
}
}
