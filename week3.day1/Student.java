package org.student;




import org.department.Department;


public class Student extends Department {
	public void studentName() {
		System.out.println("Student name is Priyadharsini Jothivel");
		// TODO Auto-generated method stub

	}
	public void StudentDept() {
		
		System.out.println("Student id is MCA");
		// TODO Auto-generated method stub

	}

	public void studentId() {
		System.out.println("Student id is 31");
		// TODO Auto-generated method stub

	}
	public static void main(String[] args) {
		Student stu=new Student();
	
		stu.collegeCode();
		stu.collegeName();
		stu.collegeRank();
		stu.studentName();
		stu.StudentDept();
		stu.studentId();
		
	}
}
