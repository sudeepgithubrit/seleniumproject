package TestNg;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class testngbasic {
	@Test
	public void teztcase1() {
		System.out.println("test");
	}
	@BeforeTest
	public void testcase2() {
		System.out.println("befortest");
	}
	@AfterTest
	public void testcase3() {
		System.out.println("Aftertest");
	}
	@BeforeClass
	public void testcase4() {
		System.out.println("beforeclass");
	}
	@AfterClass
	public void testcase5() {
		System.out.println("Afterclass");
	}
	@BeforeMethod
	public void testcase6() {
		System.out.println("beforeMethod");
	}
	@AfterMethod
	public void testcase7() {
		System.out.println("Aftermethod");
	}
}
