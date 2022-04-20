package ecommerce;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class WaitDemo {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		String[] itemsNeeded = { "Cucumber", "Brocolli", "Tomato", "Beetroot" };

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		addItems(driver, itemsNeeded);
		
		driver.findElement(By.cssSelector("img[alt='Cart']")).click();
		
		driver.findElement(By.xpath("//div[@class='action-block']/button[text()='PROCEED TO CHECKOUT']")).click();
		
		WebDriverWait wait  = new WebDriverWait(driver, Duration.ofSeconds(3));
		
		wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("promoCode"))).sendKeys("rahulshettyacademy");
		
		
	}

	public static void addItems(WebDriver driver, String[] itemsNeeded) {

		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name"));

		int count = 0;

		for (int i = 0; i < products.size(); i++) {

			String[] name = products.get(i).getText().split("-");

			String formattedName = name[0].trim(); 

			List<String> itemsNeededList = Arrays.asList(itemsNeeded); 

			if (itemsNeededList.contains(formattedName)) {
				driver.findElements(By.xpath("//div[@class='product']/div/button")).get(i).click(); 
				count++;
				if (count == itemsNeeded.length) { 
					break;
				}
			}
		}

	}
}
