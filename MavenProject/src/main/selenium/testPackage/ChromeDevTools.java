package testPackage;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.devtools.DevTools;
import io.github.bonigarcia.wdm.WebDriverManager;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ChromeDevTools {

	public static void main(String[] args) {
		
	WebDriverManager.chromedriver().setup();
	
	ChromeOptions options = new ChromeOptions();
	options.addArguments("--remote-allow-origins=*");
	ChromeDriver driver = new ChromeDriver(options);
	driver.get("https://comparecheck.atlassian.net/");
	DevTools devTools = driver.getDevTools();
	devTools.createSession();
	
	}
}
