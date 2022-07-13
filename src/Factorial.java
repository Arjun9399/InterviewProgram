
public class Factorial {
public static void main(String[] args) {
	int number=5;
	int factorial=1;
	//Given number
	System.out.println("Given number is = "+number);
	for(int i=number;i>0;i--)
	{
	factorial=factorial*i;
	}
	//Factorial of number
	System.out.println("Factorial of "+number + " is = " +factorial);
}
}
