package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().maximize();

		driver.get("https://rahulshettyacademy.com/angularpractice/");
		
		
		driver.findElement(By.name("name")).sendKeys("Abraham Ora");
		
		driver.findElement(By.name("email")).sendKeys("abe@gmail.com");
		
		driver.findElement(By.id("exampleInputPassword1")).sendKeys("1234");
		
		driver.findElement(By.id("exampleCheck1")).click();
		
		WebElement dropdownGender =  driver.findElement(By.id("exampleFormControlSelect1"));
		
		Select gender = new Select(dropdownGender);
		
		gender.selectByIndex(1);
		
		driver.findElement(By.id("inlineRadio2")).click();
		
		driver.findElement(By.name("bday")).sendKeys("06111988");
		
		driver.findElement(By.cssSelector("input[type='submit']")).click();
		
		String alertText = driver.findElement(By.cssSelector(".alert-success")).getText();
		
		System.out.println(alertText.split("x"));
		
	}

}