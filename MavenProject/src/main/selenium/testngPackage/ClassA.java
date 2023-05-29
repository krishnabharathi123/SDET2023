package testngPackage;

import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class ClassA {

	@BeforeMethod
	public void beforeMethod3() {
		System.out.println("before method in ClassA");
	}
	
	@AfterMethod
	public void afterMethod3() {
		System.out.println("after method in ClassA");
	}
}
