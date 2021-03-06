package automateWebElements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownStatic {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		WebElement staticDropdown = driver.findElement(By.id("ctl00_mainContent_DropDownListCurrency"));
		
		Select dropdown = new Select(staticDropdown);
		
		dropdown.selectByIndex(3);
		
		String selectedOption = dropdown.getFirstSelectedOption().getText();
		
		System.out.println(selectedOption); // USD
		
		dropdown.selectByVisibleText("AED");
		
		String selectedOption2 = dropdown.getFirstSelectedOption().getText();
		
		System.out.println(selectedOption2); // AED
		
		dropdown.selectByValue("INR"); // Selected based on the value on html
		
		
		String selectedOption3 = dropdown.getFirstSelectedOption().getText();
		
		System.out.println(selectedOption3); // INR
		

	}

}
