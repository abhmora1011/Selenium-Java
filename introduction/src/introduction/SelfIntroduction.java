package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SelfIntroduction{

	public static void main(String[] args) {
		
		// Invoking the browser
		// Chrome -> ChromeDriver -> Methods close get
		// FireFox -> FireFox -> Methods close get
		// Safari -> Safari -> Methods close get
		// WebDriver = Interface ( close get)
		// WebDriver methods + class methods
		
		// to invoke the chromedriver.exe -> Chrome browser
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
	
		WebDriver driver = new ChromeDriver(); // to implement the interface of the WebDriver to all the classes associated to it
		
		driver.get("https://www.rahulshettyacademy.com");
		
		System.out.println(driver.getTitle()); // get the title of the site
		
		System.out.println(driver.getCurrentUrl()); // get the URL
		
		driver.close(); // close the current window and still open the associated window
		// driver.quit(); // all the window will close since the driver is terminated

	}

}
