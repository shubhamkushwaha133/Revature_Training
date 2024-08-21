package com.revature;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import com.revature.calculator;

public class calculatorTest {
	
	@Test
	//@DisplayName("postive test case to add two numbers.")
	public void testSumPositive() {
		calculator cal=new calculator();
		int input1=10;
		int input2=10;
		int result=0;

		result=cal.sum(input1, input2);
		Assertions.assertEquals(20,result);

}
	
	@Test
	//@Disabled
	public void testSumNegative() {
		calculator cal=new calculator();
		int input1=10;
		int input2=10;
		int result=0;

		result=cal.sum(input1, input2);
		Assertions.assertEquals(10,result);

}
	@BeforeEach
	public void beforeEachMethod() {
		System.out.println("Before each..");
	}
	@AfterEach
	public void afterEachMethod() {
		System.out.println("After each..");
	}
	@BeforeAll
	public static void beforeAll() {
		System.out.println("Before All ..");
	}
	@AfterAll
	public static void AfterAll() {
		System.out.println("After All ..");
	}
}