package jtraining;

import org.junit.Assert;

public class JenkinsCalculatorTest {
	public void addTwoNumbersTest() {
		JenkinsCalculator cal = new JenkinsCalculator();
		Assert.assertEquals("adding two number test", 10, cal.addTwoNumbers(5, 5));
	}
	public void subtractTwoNumbersTest(int a, int b) {
		JenkinsCalculator cal = new JenkinsCalculator();
		Assert.assertEquals("subtracting two number test", 0, cal.subtractTwoNumbers(5, 5));
	}
}
