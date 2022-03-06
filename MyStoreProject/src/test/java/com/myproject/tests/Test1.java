package com.myproject.tests;

import org.testng.annotations.Test;

import com.myproject.baseclass.BaseClass;

public class Test1 extends BaseClass {
	
	
	@Test
	public void testCase1() {
		System.out.println("This is test case1");
	}
	@Test
	public void testCase2() {
		System.out.println("This is test case2");
	}
	@Test
	public void testCase3() {
		System.out.println("This is test case3");
	}

}
