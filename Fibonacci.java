package week1.day2;

public class Fibonacci {
	public static void main(String[] args) {
		int num1=0, num2=1,i;
		System.out.print(num1);
		System.out.print(" " +num2);
		for(i=0;i<20;i++)
		{
		int num3=num1+num2;
		
		System.out.print(" " +num3);
		
		num1=num2;
		num2=num3;
		
		
		
		}
			
	}
}





