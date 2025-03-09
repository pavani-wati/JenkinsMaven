package jtraining;

import org.junit.Assert;
import org.junit.Test;

public class JenkinsCalculatorTest {
	@Test
	public void addTwoNumbersTest() {
		JenkinsCalculator obj = new JenkinsCalculator();
		Assert.assertEquals("adding two number test", 10, obj.addTwoNumbers(5, 5));
	}
	@Test
	public void subtractTwoNumbersTest() {
		JenkinsCalculator obj = new JenkinsCalculator();
		Assert.assertEquals("subtracting two number test", 0, obj.subtractTwoNumbers(5, 5));
	}
}
