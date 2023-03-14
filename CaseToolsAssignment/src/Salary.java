import java.util.Scanner;

public class Salary {
	
	
	//creating a scanner object
	Scanner scn=new Scanner(System.in);
	
	//variable to store salary 
	private double basic_salary;
	
	
    //method to get salary from user
	
	public void getBasic() {
		basic_salary=scn.nextDouble();
	}
	
	//method to calculate dearness allowance
	
	public double calcDA() {
		
		return 0.73*basic_salary;
		
	}
	
	//method to calculate house rent allowance

	public double calcHRA() {
		
		return 0.1*basic_salary;
		
	}
	
	//method to calculate gross salary

	public double calcGS() {
		
		return basic_salary+calcDA()+calcHRA() ;
		
	}
	
	//method to calculate income tax


	public double calcIncomeTax() {
		
		return calcGS()*0.3;
		
	}
	
	//method to calculate net salary

	public double calcNS() {
		
		return calcGS()-calcIncomeTax();
		
	}
	
	



	
	



}
