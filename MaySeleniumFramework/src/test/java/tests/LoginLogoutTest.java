package tests;

import java.util.concurrent.TimeUnit;

import businessfunctions.BaseClass;
import pagereprository.LoginPage;
import pagereprository.MainPage;
import utilityfunctions.ExcelUtil;

public class LoginLogoutTest extends BaseClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//static WebDriver driver= null;
		
		BaseClass.openBrowser();

		/*	System.setProperty("webdriver.chrome.driver","C:\\Users\\Shriyan\\eclipse-workspace\\MaySeleniumFramework\\Drivers\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();

		driver.get("https://opensource-demo.orangehrmlive.com/\r\n");
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		//driver.findElement(By.id("btnLogin")).click();
		 * 
		 */
	int rCount=	ExcelUtil.getRowCount();
	//int cCount= ExcelUtil.getColumnCount();
	
	for(int i=1; i<rCount; i++) {
		
		String username = ExcelUtil.getStringCellValue(i,0);
		String password = ExcelUtil.getStringCellValue(i,1);
		
	
		LoginPage.enterUserName(username);
		LoginPage.enterPassword(password);
		LoginPage.ClickLoginButton();
		MainPage.ClickWelcomeLink();
		driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		MainPage.ClickLogoutLink();


	}



		//	driver.findElement(By.xpath("//*[@id=\"welcome\"]")).click();

		//driver.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
		//driver.findElement(By.linkText("Logout")).click();

		BaseClass.CloseBrowser();


		//driver.close();
		//driver.quit();
	}

}
