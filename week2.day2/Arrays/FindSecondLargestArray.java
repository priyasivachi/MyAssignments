package week2.day2;

import java.util.Arrays;

public class FindSecondLargestArray {

	public static void main(String[] args) {
		int largearray[]= {3,2,11,4,6,7};
		int length=largearray.length;
		
		Arrays.sort(largearray);
		
		
			System.out.println("The second Largest Array is" + largearray[length-2]);
			
			
		
		// TODO Auto-generated method stub)

	}
}



