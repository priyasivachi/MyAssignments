package week3.day1;

public class reverseEvenWords {
	public static void main(String[] args) {
		
	
	String s="priyadharsini";

	char a[]=s.toCharArray();
	for(int i=1;i<s.length()-1;i+=2)
	{
		System.out.println(a[i]);
		
	}
		

for(int i=s.length()-1;i>=0;i-=2)
		
	{
	
		System.out.print(a[i]);
		
	

	}
		
	
}
}
