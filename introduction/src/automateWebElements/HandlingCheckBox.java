package automateWebElements;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandlingCheckBox {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement seniorCheckBox= driver.findElement(By.cssSelector("input[id*='SeniorCitizenDiscount']"));
		
		System.out.println(seniorCheckBox.isSelected()); // Verify if checkbox is selected
		
		seniorCheckBox.click(); // Select the checkbox
		
		System.out.println(seniorCheckBox.isSelected()); // Verify if checkbox is selected
		
		// Count the checkbox
		
		List<WebElement> checkBoxes = driver.findElements(By.cssSelector("input[type='checkbox']"));
		
		System.out.println(checkBoxes.size());
		
		// Added script from DropdownDynamic Class
		
		driver.findElement(By.id("divpaxinfo")).click();
		
		Thread.sleep(2000);
		
		int i = 1;
		
		while(i<5) {
			driver.findElement(By.id("hrefIncAdt")).click();  
			i++;
		}
		
		driver.findElement(By.id("btnclosepaxoption")).click();
		
		String displayText = driver.findElement(By.id("divpaxinfo")).getText();
		
		System.out.println(displayText);

	}

}
