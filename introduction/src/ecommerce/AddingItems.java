package ecommerce;

import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AddingItems {

	public static void main(String[] args) throws InterruptedException {


		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		
		//Expected items need to add on the cart
		String[] itemsNeeded = {"Cucumber", "Brocolli", "Tomato"}; 
		int count = 0; // Count number of iteration to trigger the break

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		
		List<WebElement> products = driver.findElements(By.cssSelector("h4.product-name")); // Get all the products
		
		for (int i = 0; i < products.size(); i++) {
			
			String[] name = products.get(i).getText().split("-"); // get(i) iterating on each index of the product list split() is use to split the - 1Kg to the item name
			// Format the name ^ to get the actual name
			// name[0] - Brocolli
			// name[1] - - 1 Kg
			
			String formattedName = name[0].trim(); // to trim extra spaces on the name[0] ex. "Brocolli "
			
			// Check whether name you extracted is present in array or not
			// Convert the itemNeeded array to array list (to save memory do not declare an array list from the start)
			List itemsNeededList = Arrays.asList(itemsNeeded); // Pwede din na List lang without <String>
					
			if (itemsNeededList.contains(formattedName)) 
			{
				driver.findElements(By.xpath("//div[@class='product']/div/button")).get(i).click(); // When having a dynamic locator do not use text in xpath
				//break; // to save time instead of iterating on 30 items (DO NOT DECLARE break WHEN GOING TO FIND MULTIPLE VALUE
				// 3 times
				count++;
				if (count==3) {
					break;
				}
			}
			
			
		}

	}

}
