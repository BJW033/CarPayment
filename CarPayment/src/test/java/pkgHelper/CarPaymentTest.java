package pkgHelper;

import static org.junit.Assert.*;

import org.junit.Test;
public class CarPaymentTest {
	private CarPayment test = new CarPayment(35000,0,60,0.1);
	@Test
	public void MonthlyPaymentTest() {
		assertEquals(743.65,test.monthlyPayment(),0.05);
	}
	@Test
	public void TotalIntrest() {
		assertEquals(9618.79,test.totalIntrest(),0.05);
	}
}