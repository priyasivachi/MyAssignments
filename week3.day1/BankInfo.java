package org.college;

public class BankInfo {
	public void saving(int save) {
		System.out.println("The saving account"+ save);
		
		
		// TODO Auto-generated method stub

	}
public void fixed(int fixed,int year) {
	// TODO Auto-generated method stub
	System.out.println("Fixed account" + fixed + "No of Yerars" + year);

}
public void deposit(int depo,float interest) {
	// TODO Austo-generated method stub
System.out.println("The amount is"+ depo + "interest rate is"+ interest);
}
 public static void main(String[] args) {
	
	 BankInfo bank=new BankInfo();
	 bank.saving(10000);
	 bank.fixed(50000,3);
	 bank.deposit(60000, 1.5f);
}
}
