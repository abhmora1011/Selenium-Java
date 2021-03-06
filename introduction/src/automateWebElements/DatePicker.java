package automateWebElements;

import java.time.Duration;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;

public class DatePicker {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // Check if the return date is enabled
		
		//System.out.println(driver.findElement(By.id("Div1")).getAttribute("style"));
		
		if (driver.findElement(By.id("Div1")).getAttribute("style").contains("opacity: 0.5")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}
		
		driver.findElement(By.id("ctl00_mainContent_rbtnl_Trip_1")).click();
		
		//System.out.println(driver.findElement(By.name("ctl00$mainContent$view_date2")).isEnabled()); // Check if the return date is enabled
		
		// From and To
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
			
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click(); // two xpath combination
		
		Thread.sleep(1000);
		
		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		// Calendar section
		
		driver.findElement(By.cssSelector(".ui-state-default.ui-state-hover")).click();
		
		

	}

}
