package org.college;

public class AxisBank extends BankInfo {
	
	public void deposit(int depo, float interest,int year) {
		// TODO Auto-generated method stub
		
		System.out.println("deposit amount is"+ depo + "The interest rate is"+ interest + "year is" + year);
	}
	
	public static void main(String[] args) {
		AxisBank axis=new AxisBank();
		axis.deposit(50000,2.3f,6);
	}

}
