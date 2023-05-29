package testngPackage;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class ClassB extends ClassA{

	@BeforeMethod
	public void beforeMethod2() {
		System.out.println("before method in ClassB");
	}
	
	@AfterMethod
	public void afterMethod2() {
		System.out.println("after method in ClassB");
	}
	
	@Test
	public void testCase1() {
		System.out.println("test case1");
	}
}
