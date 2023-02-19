package org.college;

public class Students {

	public void getStudentInfo(int id) 
	{
		System.out.println("student id is" + id);
		// TODO Auto-generated method stub

	}
	public void getStudentInfo(int id,String Name) 
	{
		System.out.println("student id is" + id);
		System.out.println("student name is" + Name);
		// TODO Auto-generated method stub

	}
	public void getStudentInfo(String Email,Long No)
	{
		System.out.println("student email is" + Email);
		System.out.println(" Student phone no is"+ No);
		// TODO Auto-generated method stub

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Students stud=new Students();
		
		stud.getStudentInfo(271173);
		stud.getStudentInfo(271173,"Priyadharsini");
		stud.getStudentInfo("skkkk@mail.com", 12345678887L);
		
		
		

	}

}
