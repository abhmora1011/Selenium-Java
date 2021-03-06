package automateWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownAutoSuggestives {
	
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("autosuggest")).sendKeys("INDI");
		
		//WebElement option = driver.findElement(By.id("autosuggest"));
		
		//option.sendKeys("IND");
		
		Thread.sleep(2000);
		
		//Select india =  new Select(option);
		
		List<WebElement> options = driver.findElements(By.cssSelector("li[class='ui-menu-item'] a"));
		
		for (WebElement option : options) {
			
			if (option.getText().equalsIgnoreCase("India")) {
				
				option.click();
				break; // to stop the execution immediately
				
			}
			
			// System.out.println(option.getText()); to print all the element on the list
		}
		
		
		
		
		
	}

}
