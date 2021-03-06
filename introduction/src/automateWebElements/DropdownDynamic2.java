package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDynamic2 {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();		
		// driver.findElement(By.xpath("//a[@value='BLR']")).click();
		
		driver.findElement(By.xpath("//div[@id='ctl00_mainContent_ddl_originStation1_CTNR'] //a[@value='BLR']")).click(); // two xpath combination
		
		Thread.sleep(1000);
		
		//driver.findElement(By.xpath("(//a[@value='MAA'])[2]")).click(); 
		// This xpath use indexing since there are 2 MAA present and we cannot select the second one since it also present on the first dropdown

		driver.findElement(By.xpath("//div[@id='glsctl00_mainContent_ddl_destinationStation1_CTNR'] //a[@value='MAA']")).click();
		
		/**
		 * To Avoid indexing you can use the parent and child combination for xpath just like the example above.
		 * This is called Parent Child relationship xpath
		 * 
		 * Note: If you remove the parent it will scan the whole page and get the 2 Chennai element from the 'from Destionation' to 'Arrival City'
		 */
		
	}

}
