import java.util.Scanner;

/**
 * 
 * @author Judan Pinto
 *
 */
public class Salary {
	
	
	//creating a scanner object
	Scanner scn=new Scanner(System.in);
	
	/**
	 * this is a variable to store the salary of an employee
	 */
	private double basic_salary;
	
	
	/**
     * this is a method that will take input form the user to get the salary
     */
	
	public void getBasic() {
		basic_salary=scn.nextDouble();
	}
	
	/**
	 * this is a method to calculate dearness allowance
	 * @return it returns dearness allowance
	 */
	
	public double calcDA() {
		
		return 0.73*basic_salary;
		
	}
	
	/**
	 * this is a method to calculate house rent allowance
	 * @return it returns the basic salary
	 */

	public double calcHRA() {
		
		return 0.1*basic_salary;
		
	}
	
	/**
	 * this is a method to calculate gross salary
	 * @return it returns the gross salary of an employee
	 */

	public double calcGS() {
		
		return basic_salary+calcDA()+calcHRA() ;
		
	}
	
	/**
	 * this is a method to calculate income tax
	 * @return it returns the income tax 
	 */


	public double calcIncomeTax() {
		
		return calcGS()*0.3;
		
	}
	
	/**
	 * this is a method to calculate net salary
	 * @return it returns the net salary of an employee
	 */

	public double calcNS() {
		
		return calcGS()-calcIncomeTax();
		
	}
	
	



	
	



}
