package jtraining;

public class JenkinsCalculator {
	public static void main(String args[]) {
		JenkinsCalculator obj = new JenkinsCalculator();
		obj.addTwoNumbers(10, 5);
		obj.subtractTwoNumbers(10, 5);
	}
	public int addTwoNumbers(int a, int b) {		
		return a + b;
	}
	public int subtractTwoNumbers(int a, int b) {
		return a - b;
	}
}
