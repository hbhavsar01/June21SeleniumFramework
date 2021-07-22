package pagereprository;

import org.openqa.selenium.By;
import businessfunctions.BaseClass;

public class MainPage extends BaseClass{

	 //static WebDriver driver= null;
		
		static By LogoutLink = By.linkText("Logout");

		static By WelcomeLink= By.xpath("//*[@id=\"welcome\"]");
		
		static public void ClickLogoutLink() {
			driver.findElement(LogoutLink).click();
		}

		static public void ClickWelcomeLink() {
			driver.findElement(WelcomeLink).click();
		}


}
