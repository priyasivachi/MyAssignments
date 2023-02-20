package week3.day1;

public class removeDuplicates {
	
	public static void main(String[] args) {
		String s="priyadharsini";
		
	char a[]=s.toCharArray();
		for(int i=0;i<s.length()-1;i++)
			
		{
			for(int j=i+1;j<s.length()-1;j++)
			{
			if(a[i]==a[j])
			{
			
				System.out.println("Duplicates found" + a[j]);
				break;
			}
		}
		}
	
}
}


