package introduction;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Locators {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5)); // (3, TimeUnit) is deprecated  // Wait objects to show implemented to all the element
		
		driver.get("https://www.rahulshettyacademy.com/locatorspractice");
		
		driver.findElement(By.id("inputUsername")).sendKeys("Hello");
	
		driver.findElement(By.name("inputPassword")).sendKeys("12345");
		
		driver.findElement(By.className("signInBtn")).click();
		
		System.out.println(driver.findElement(By.cssSelector("p.error")).getText());
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000); // pause for 2 seconds // wait for an element to be on a stable state
		
		driver.findElement(By.xpath("//input[@placeholder='Name']")).sendKeys("Sample");
		
		driver.findElement(By.cssSelector("input[placeholder='Email']")).sendKeys("sample@gmail.com");
		
		driver.findElement(By.xpath("//input[@type='text'][2]")).clear(); // indexing in Xpath
		
		driver.findElement(By.cssSelector("input[type='text']:nth-child(3)")).sendKeys("Abe@gmail.com"); // indexing in CSS Selector
		
		driver.findElement(By.xpath("//form/input[3]")).sendKeys("91234432536");
		
		driver.findElement(By.cssSelector(".reset-pwd-btn")).click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//form/h2/../p")));
		
		System.out.println(driver.findElement(By.xpath("//form/h2/../p")).getText());
		
		Thread.sleep(2000);
		
		driver.findElement(By.cssSelector(".go-to-login-btn")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.id("inputUsername")).sendKeys("Abe");
		
		driver.findElement(By.cssSelector("[type*='pass']")).sendKeys("rahulshettyacademy"); // REGEX CSS SELECTOR
		
		driver.findElement(By.xpath("//button[contains(@class,'submit')]")).click(); // REGEX Xpath
		
		driver.quit();
		
//		''' Xpath -> REGEX //*[contains(@attribute,'value')], 
//        //tagname[@attribute="value"]  *** tag name is optional *** '''
//
//		''' Generating XPATH based on text
//		       //*[contains(text(),'xxx')] (Can cover any tag) 
//		       //tagname[text()='<text here>']           '''
//		
//		''' Creating Xpath and CSS by Traversing Tags
//		 xpath: ParentTag/ChildTag
//		 CSS: ParentTag ChildTag '''
//		
//		''' CSS -> REGEX: [attribute*='value']
//		tagname[attribute='value'] *** tag name is optional ***'''
//		
//		''' Generating CSS from ID
//		tagname#ID || tagname.CLASSNAME'''
//		
//		# $("[class*='alert-success']") CSS REGEX Console Checking
//		# $("[class='alert-success'") CSS Console Checking
//		# $x("//*[contains(@class,'alert-success')]") XPATH REGEX Console Checking
//		# $x("//div[@class='alert-success']") XPATH Console Checking

	}

	
}
