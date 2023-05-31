package jirapackage;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Goibibo {

	public static void main(String[] args) throws InterruptedException {
		
		WebDriverManager.chromedriver().setup();
		
		ChromeOptions options = new ChromeOptions();
		
		options.addArguments("--remote-allow-origins=*");
		
		WebDriver driver = new ChromeDriver(options);
		
		driver.manage().window().maximize();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		driver.get("https://www.goibibo.com/");
		
		driver.findElement(By.cssSelector(".logSprite.icClose")).click();
		
		driver.findElement(By.xpath("//span[text()='Round-trip']")).click();
		
		driver.findElement(By.xpath("//p[contains(@class,'dRQhOp')]")).click();
		
		WebElement from=driver.findElement(By.xpath("//span[text()='From']/following::p"));
		
		from.click();
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("Chennai");
		
		driver.findElement(By.xpath("//ul[@id='autoSuggest-list']/li")).click();
		Actions builder = new Actions(driver);
		WebElement to=driver.findElement(By.xpath("//span[text()='To']/following::p"));
		builder.click(to).perform();
		
		
		builder.sendKeys("co").perform();
		
		List<WebElement> city=driver.findElements(By.xpath("//ul[@id='autoSuggest-list']/li//p[1]/span[1]"));
		for(WebElement i:city){
			if(i.getText().contains("Coimbatore")) {
				i.click();
				break;
			}
		}
	
		//calenderHandling
		
		//List<WebElement> dep=driver.findElements(By.xpath("//div[text()='June 2023']/following::div[@class='DayPicker-Day']"));
		//Thread.sleep(1000);
		/*for (WebElement j : dep) {
			WebElement date=j.findElement(By.tagName("p[1]"));
			if(date.getText().equals("1")) {
				date.click();
				break;
			}
		}*/
		driver.findElement(By.xpath("//div[text()='June 2023']/following::div[@class='DayPicker-Day'][3]")).click();
		
		driver.findElement(By.xpath("//div[text()='June 2023']/following::div[@class='DayPicker-Day'][5]")).click();
		driver.findElement(By.xpath("//span[text()='Done']")).click();
		driver.findElement(By.xpath("//a[text()='Done']")).click();
		driver.findElement(By.xpath("//span[text()='SEARCH FLIGHTS']")).click();

		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,2000000)", "");
		
		List<WebElement> onwardFlights = driver.findElements(By.xpath("//div[contains(@class,'flexRow')]/div[1]/following::span[@class='font20']"));
		System.out.println(onwardFlights.size());
		//List<WebElement> inwardFlights = driver.findElements(By.xpath("//div[contains(@class,'flexRow')]/div[2]"));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//js.executeScript("arguments[0].scrollIntoView(true);", onwardFlights.get(0));
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//JavascriptExecutor js = (JavascriptExecutor)driver;
		//WebDriverWait wait = new WebDriverWait(driver,Duration.ofSeconds(20));
		//wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy((By) onwardFlights));
		for (WebElement on : onwardFlights) {
			driver.findElement(By.tagName("html")).sendKeys(Keys.ARROW_DOWN);
			//JavascriptExecutor js = (JavascriptExecutor)driver;
			//js.executeScript("arguments[0].scrollIntoView(true);", on);
			System.out.println(on.getText());
			
		}
	}
	
	public void calenderHandling() {
		
	}

}
