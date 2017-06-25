package com.sourceallies.timestwo;

import static org.hamcrest.CoreMatchers.equalTo;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TimesTwoControllerTests {

	private TimesTwoController controller;
	
	@Before
	public void setup() {
		controller = new TimesTwoController();
	}
	
	@Test
	public void calculateShouldReturnProperNumber() {
		int result = controller.DoCalculation("4");
		Assert.assertThat(result, equalTo(8));
	}
}
