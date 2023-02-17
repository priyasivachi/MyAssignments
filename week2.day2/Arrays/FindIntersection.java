package week2.day2;

public class FindIntersection {

	public static void main(String[] args) {
		
	
		int intersection1[]= {1,2,3,4,5};
		int intersection2[]= {6,6,7,8,0,4,1};
		int length= intersection1.length;
		int length1= intersection2.length;
		
		
		
      for(int i=0;i<length;i++)
      {
    	  for(int j=0;j<length1;j++)
    	  {
    		  if(intersection1[i]==intersection2[j])
    		  {
    			  System.out.println("the intersection found" + intersection1[i]);
    			  break;
    		  }
    	  }
      }
	
		
		
		// TODO Auto-generated method stub

	}

}
