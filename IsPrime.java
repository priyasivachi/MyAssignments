public class IsPrime {
	
	public static void main(String[] args) {
		boolean flag=false;
		int n=17,i,k;
		
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
		
		for(k=2;k<100;k++)
		{
			boolean flagg=false;
			
			for(int j=2;j<k;j++) {
			
				if(k%j==0)
				{
					flagg=true;
					break;
				}
				}
		
		if(flagg==false)
		{
			System.out.println(k+ "the no is  prime");
		}
	}
}
			}
		

		

	
	


	
	
	


	
	
	
	


	
	

