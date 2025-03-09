package com.jenkins.sample.jtraining;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

import org.junit.jupiter.api.Test;

/**
 * Unit test for simple App.
 */
public class AppTest {
    
    @Test
    public void addTwoNumbersTest() {
    	App app = new App();
    	assertEquals(10, app.addTwoNumbers(5, 5));
    }
    
    @Test
    public void subtractTwoNumbersTest() {
    	App app = new App();
    	assertEquals(10, app.subtractTwoNumbers(15, 5));
    }
}
