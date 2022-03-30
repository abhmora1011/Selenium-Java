package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class AlertHandling {

	public static void main(String[] args) throws InterruptedException {
		
		String textAlert = "Abe";
	
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		driver.findElement(By.id("name")).sendKeys(textAlert);
		
		driver.findElement(By.cssSelector("[id='alertbtn']")).click();
		
		String alertContent = driver.switchTo().alert().getText();
		
		Assert.assertEquals(alertContent, "Hello Abe, share this practice page and share your knowledge");
		
		Thread.sleep(2000);
		
		driver.switchTo().alert().accept();
		

	}

}
