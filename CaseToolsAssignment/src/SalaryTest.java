import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



class SalaryTest {
	
	
	Salary s1=new Salary();
	
	@Test
	public void testCalcDA() {
		s1.getBasic();
		assertEquals(7300,s1.calcDA());
	}

	@Test
	public void testCalcHRA() {
		s1.getBasic();
		assertEquals(1000,s1.calcHRA());
	}

	@Test
	public void testCalcGS() {
		s1.getBasic();
		assertEquals(18300,s1.calcGS());
	}

	@Test
	public void testCalcIncomeTax() {
		s1.getBasic();
		assertEquals(5490,s1.calcIncomeTax());
	}

	@Test
	public void testCalcNS() {
		s1.getBasic();
		assertEquals(12810,s1.calcNS());
	}

}
