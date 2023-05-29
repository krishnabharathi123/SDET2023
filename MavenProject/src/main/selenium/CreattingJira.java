import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreattingJira {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		//options.setHeadless(true);
		//options.setAcceptInsecureCerts(true);
		//options.addArguments(null)

		//FirefoxDriver driver = new FirefoxDriver();
		
		ChromeDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2000));
		
		driver.get("https://comparecheck.atlassian.net/");
		
		//driver.get("https://start.atlassian.com/");
		
		driver.findElement(By.name("username")).sendKeys("bharathimanohar0696@gmail.com");
		
		driver.findElement(By.id("login-submit")).click();
		
		driver.findElement(By.id("password")).sendKeys("Bharathi@1996");
		
		driver.findElement(By.xpath("//span[text()='Log in']")).click();
		
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		
		driver.findElement(By.xpath("//label[@id='type-picker-uid8-label']/following::div")).click();
		
		driver.findElement(By.id("summary-field")).sendKeys("Creating test jira");
		
		driver.findElement(By.xpath("//div[contains(@class,'value-container')]")).click();
		
		List<WebElement> nameOptions=driver.findElements(By.xpath("//div[contains(@class,'fabric-user-picker__menu')]/child::div"));
		
		System.out.println(nameOptions.size());
		
		for (WebElement i : nameOptions) {
			
			System.out.println(i.getText());
		
		}
		
		//driver.executeCdpCommand(null, null)
		
	//	List<WebElement> nameOptions = driver.findElements(By.xpath("//div[contains(@class,'fabric-user-picker__menu')]/child::div//div[2]//div//span"));
		
		//System.out.println(driver.findElement(By.xpath("//div[contains(@class,'fabric-user-picker__menu')]/child::div//div[2]//div//span")).getText());
	/*	for (WebElement i : nameOptions) {
			
			System.out.println(i.getText());
		
		}*/
		//driver.findElement(By.id("react-select-3-option-2")).click();
		
		/*Thread.sleep(2000);
		
		driver.findElement(By.xpath("//button[@id='social-login-submit']//span")).click();
		
		driver.findElement(By.xpath("(//span[@jsname='V67aGc'])[2]")).click();
		
		WebElement ele=driver.findElement(By.xpath("//button[@id='social-login-submit']//span"));
		
		driver.executeScript("arguments[0].click();", ele);*/
		
		driver.findElement(By.xpath("//span[text()='Create']")).click();
		
		WebElement type=driver.findElement(By.xpath("(//span[@aria-relevant='additions text'])[3]/following::div"));

	}

}
