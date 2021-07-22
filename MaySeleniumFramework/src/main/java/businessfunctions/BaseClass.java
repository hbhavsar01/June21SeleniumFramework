package businessfunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configuration.Configuration;

public class BaseClass {
	
	public static WebDriver driver = null;
	public static void openBrowser() {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shriyan\\eclipse-workspace\\MaySeleniumFramework\\Drivers\\chromedriver.exe");
	driver= new ChromeDriver();

	driver.get(Configuration.getProperty("url"));

}
	public static void CloseBrowser() {
		driver.close();
		driver.quit();
	}
}
