package synchronization;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class ImplicitWait {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		
		// This will ask the driver to wait for a certain of time before throwing an exception
		// If the elements are loaded before the set time it will not wait to finish the duration of time and proceed to the action
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		

	}
	
	public void addItems(WebDriver driver) {
		
	}

}
