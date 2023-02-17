package week2.day2;

import java.util.Arrays;

public class PrintDuplicates {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int duplicates[]= {14,12,13,11,15,14,18,16,17,19,18,17,20};
		
		Arrays.sort(duplicates);
		int length=duplicates.length;
		for(int i=0;i<length-1;i++)
		{
			
			if(duplicates[i]==duplicates[i+1])
				
			{
				System.out.println("duplicates found" + duplicates[i]);
				break;
			}
				
		
		}
		

	}

}
