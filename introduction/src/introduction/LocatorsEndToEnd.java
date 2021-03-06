package introduction;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

public class LocatorsEndToEnd {

	public static void main(String[] args) throws InterruptedException 
	{
		
		String name = "Abraham";
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
		
		String password = getPassword(driver);
		
		// driver.get("https://www.rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.id("inputUsername")).sendKeys(name);
	
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		driver.findElement(By.className("signInBtn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//p[contains(text(),'You are successfully logged in.')]")));
		
		String success = driver.findElement(By.xpath("//p[contains(text(),'You are successfully logged in.')]")).getText();
		
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		System.out.println(success);
		
		Assert.assertEquals(driver.findElement(By.cssSelector(".login-container h2")).getText(),"Hello " + name + ",");
		
		driver.findElement(By.xpath("//button[text()='Log Out']")).click();
		
		driver.quit();

	}
	
	public static String getPassword(WebDriver driver) throws InterruptedException 
	{
		driver.get("https://www.rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/h2/../p")));
		
		String txt = driver.findElement(By.xpath("//form/h2/../p")).getText();
		//Please use temporary password 'rahulshettyacademy' to Login.
		
		String[] splittedString = txt.split("'"); // String[] splittedString = txt.split("'")[0] to directly parsed the txt
		 
		// 0th index - Please use temporary password'
		// 1st index - rahulshettyacademy' to Login.
		
		String[] splittedString2 = splittedString[1].split("'");
		
		// 0th index - rahulshettyacademy
		// 1st index - to Login.
		
		String password = splittedString2[0];
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		Thread.sleep(1000);
		
		return password;
	}

}
