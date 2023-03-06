package week3.day2;

import java.util.ArrayList;
import java.util.Collections;


import java.util.List;
import java.util.TreeSet;


public class FindSecondLargest {

	public static void main(String[] args) {
		
		int[] data= {3,2,11,4,6,7,2,3,3,6,7};
		 
		TreeSet<Integer> secondLargest = new TreeSet<Integer>();
		for(int i=0;i<data.length;i++)
		{
			secondLargest.add(data[i]);
		}
		
		
		List<Integer> largest=new ArrayList<Integer>(secondLargest);
		
		int findSecondLargest=largest.size();
		
		System.out.println("Second largest array is" + " " + largest.get(findSecondLargest-2));
		
		
	}
}

