package week6.day1;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.github.bonigarcia.wdm.WebDriverManager;


public class JiraScenario1 {
/*
 * 1. Login to JIRA with Private/In Private mode.
2. Click on project and select your project
3. From the board move any issue from one status to other using drag and drop
4. Click on any Task
5. click on 'add a child issue' and create a sub task
6. Go to that sub task and do below actions
	a. add Description
	b. add assignee from your team
	c. add a label 
	d. add a comment
	e. click on add and validate the comment
7. Go to JIRA board and validate the sub task
8. Navigate to the Sub Task and add a attachment, and validate the same.
9. Delete the Parent task
10. Validate in JIRA board as Parent and Sub Task has been move out of board
 */
	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		options.addArguments("--incognito");
		
		//options.setAcceptInsecureCerts(true);
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://comparecheck.atlassian.net/");
		
		driver.findElement(By.name("username")).sendKeys("bharathimanohar0696@gmail.com");
		
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.id("password")).sendKeys("Bharathi@1996");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//span[text()='Projects']")).click();
		
		driver.findElement(By.xpath("//span[text()='compare_Check (CC)']")).click();
		
		Thread.sleep(2000);
		//Drag and drop not working
		/*WebElement ele=driver.findElement(By.xpath("(//div[contains(@class,'1gar2hk')])[1]"));
		
		WebElement ele1=driver.findElement(By.xpath("(//div[contains(@class,'1gar2hk')])[4]"));
		
		Actions builder = new Actions(driver);
		
		builder.moveToElement(ele).clickAndHold().moveToElement(ele1).release().perform();*/
		//builder.dragAndDrop(ele, ele1).perform();
		Thread.sleep(5000);
		driver.findElement(By.xpath("(//div[contains(@id,'card')])[2]")).click();
		
		driver.findElement(By.xpath("//button[contains(@aria-label,'Add a child')]")).click();
		
		//Date date=new Date();
		
		//String ran=(String) (date.getDay()+":"+date.getHours());
		
		String currentTimeMillis = (String)(System.currentTimeMillis()+"");
		//String value="child issue"+ran;
		driver.findElement(By.id("childIssuesPanel")).sendKeys(currentTimeMillis);
		
		driver.findElement(By.xpath("//button[contains(@data-testid,'child')]//span[text()='Create']")).click();
		Thread.sleep(2000);
		WebElement el=driver.findElement(By.xpath("//span[text()='"+currentTimeMillis+"']"));
		Actions builder1 = new Actions(driver);
		builder1.doubleClick(el).perform();
		/*WebElement el=driver.findElement(By.xpath("//span[contains(text(),'child issue1')]/../../../.."));
		Actions builder1 = new Actions(driver);
		builder1.click().perform();*/
		
		WebElement des=driver.findElement(By.xpath("//span[contains(text(),'description')]"));
		des.click();
		Thread.sleep(2000);
		//WebElement el2=	driver.findElement(By.xpath("//span[@data-testid='placeholder-test-id']")).click();
		WebElement el1=driver.findElement(By.xpath("//span[@data-testid='placeholder-test-id']"));
		
		JavascriptExecutor js = (JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click();", el1);

		driver.findElement(By.xpath("//p/br")).sendKeys("hello jira");
		
		WebElement assignee=driver.findElement(By.xpath("//span[text()='Unassigned']"));
		assignee.click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//span[text()='Hema Murugesan']")).click();
		
		driver.findElement(By.xpath("//button[@aria-label='None- edit Labels']/following::span")).click();
		
		WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		wait.until(ExpectedConditions.elementToBeClickable(driver.findElement(By.xpath("//div[text()='test']"))));
		
		driver.findElement(By.xpath("//div[text()='test']")).click();
		WebElement comment=driver.findElement(By.xpath("//input[@placeholder='Add a comment…']/.."));
		js.executeScript("arguments[0].scrollIntoView(true);", comment);
		driver.findElement(By.xpath("//input[@placeholder='Add a comment…']/following::div")).click();
		driver.findElement(By.xpath("//input[@placeholder='Add a comment…']/following::div")).sendKeys("adding jira comments123");
		
		
	}

}
