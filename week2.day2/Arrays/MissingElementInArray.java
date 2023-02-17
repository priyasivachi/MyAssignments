package week2.day2;

import java.util.Arrays;

public class MissingElementInArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] missing= {1,2,3,4,7,6,8};;
		Arrays.sort(missing);
		int length=missing.length;
		for(int i=0;i<length;i++)
		{
			if(missing[i]==6)
			{
				System.out.println("The Missing no id found" + missing[i]);
				break;
				
			}
		}
		

	}

}
