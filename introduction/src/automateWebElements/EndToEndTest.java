package automateWebElements;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

public class EndToEndTest {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		// Auto suggest
		
		driver.findElement(By.xpath("//input[@id='autosuggest']")).sendKeys("IND");
		
		Thread.sleep(2000);
		
		List<WebElement> autoSuggest = driver.findElements(By.xpath("//li/a[@class='ui-corner-all']"));
		
		for (WebElement option : autoSuggest) {
			
			if (option.getText().equalsIgnoreCase("India")) {
				option.click();
				break;
			}
			
		}
		
	
		// Radio button
		
		driver.findElement(By.xpath("//input[@id='ctl00_mainContent_rbtnl_Trip_0']")).click();
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		// From and To
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='DEL']")).click(); // two xpath combination
		
		Thread.sleep(1000);
		
		WebElement chennai = driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']"));

		chennai.click();
		
		// Date Picker
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
		
		// Passengers
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int i = 1;
		
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();  
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		// Currency
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		
		// Check-box
		
		WebElement seniorCheckBox= driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		
		Assert.assertFalse(seniorCheckBox.isSelected());
		
		seniorCheckBox.click();
		
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		Thread.sleep(2000);
		
		driver.quit();
		
	}

}
