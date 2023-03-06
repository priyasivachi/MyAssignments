package week3.day2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MissingNo {

	public static void main(String[] args) {
		int data[]= {6,7,5,3,9,10,11,2,4};
		List<Integer> No= new ArrayList<Integer>();
		List<Integer> MissingNo=new ArrayList<Integer>();
		
		for(int i=0;i<data.length;i++)
		{
			No.add(data[i]);
		}
		int maxNumber = Collections.max(No);
		System.out.println(maxNumber);
		
		for(int j=1;j<maxNumber;j++)
		{
			if(!No.contains(j))
				{
				MissingNo.add(j);
			}
		}
		System.out.println(MissingNo);

	}
}

