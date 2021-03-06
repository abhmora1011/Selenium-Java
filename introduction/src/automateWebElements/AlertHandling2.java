package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertHandling2 {

	public static void main(String[] args) throws InterruptedException {

		String textAlert = "Abe";

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		driver.findElement(By.id("name")).sendKeys(textAlert);

		driver.findElement(By.cssSelector("[id='confirmbtn']")).click();

		// driver.switchTo().alert().dismiss(); // to click the cancel

		Thread.sleep(2000);

		driver.switchTo().alert().accept();

	}

}
