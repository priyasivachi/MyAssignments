package week1.day2;


public class IsPrime {
	
	public static void main(String[] args) {
		boolean flag=false;
		int n=17,i;
		
		for(i=2;i<n;i++)
		
		{	
		
		if(n%i==0) 
		{
			flag=true;
		
			break;
		}
		}
		
		if(flag==true )
			{
				
				System.out.println(n+ "the no is  not  prime");
				}
			else {
				System.out.println(n+"the no is prime");
		}
		
	
			}
		}




	
	


	
	
	


	
	
	
	


	
	

