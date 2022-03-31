package assignments;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Assignment1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		WebElement checkbox1 = driver.findElement(By.cssSelector("input[name='checkBoxOption1']"));
		
		checkbox1.click();
		
		System.out.println(checkbox1.isSelected());
		
		checkbox1.click();
		
		System.out.println(checkbox1.isSelected());
		
		List<WebElement> checkboxes = driver.findElements(By.cssSelector("div label input[type='checkbox']"));
		
		System.out.println(checkboxes.size());
		

	}

}
