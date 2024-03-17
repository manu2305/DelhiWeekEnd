package TestNgBasic;

import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class ChronologicalOrder {
	@BeforeSuite
public void beforeSuite() {
	System.out.println("beforeSuite");
}
    @BeforeTest
    public void beforeTest() {
    	System.out.println("beforeTest");
    }
    @AfterClass
	public void afterClass() {
		System.out.println("AfterClass");
	}
    @BeforeClass
    public void beforeClass() {
    	System.out.println("BeforeCLass");
    }
    @BeforeMethod
    public void beforeMethod() {
    	System.out.println("beforeMethod");
    }
    @Test
    public void test() {
    	System.out.println("testCase");
    }
    @AfterMethod
    public void afterMethod() {
    	System.out.println("AfterMethod");
    	}
	@AfterTest
	public void afterTest() {
		System.out.println("AfterTest");
	}
	@AfterSuite
	public void afterSuite() {
		System.out.println("AfterSuite");
	}
	
}






















