package introduction;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class NavigationAndWindowsProperties {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://www.rahulshettyacademy.com/#/index"); // pause until fully loaded
		
		driver.navigate().to("https://rahulshettyacademy.com/AutomationPractice/"); // continue ever the page is not fully loaded
		
		driver.navigate().back(); // Navigate back to the previous page
		
		driver.navigate().forward(); // Navigate forward to the previous page
				
	}

}
