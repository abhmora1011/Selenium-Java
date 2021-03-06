package introduction;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Traversing {
	
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		// Sibling - Child - Parent Traverse
		// double slash for relative xpath - start to a specific tag
		// single slash for absolute xpath - starts from the root
		// //header/div/button[1]/following-sibling::button (finding a sibling by using following-sibling:<sibling tag>
		// //header/div/button[1]/parent::div (finding a parent by using parent:<parent tag>
		// //header/div/button[1]/parent::div/parent::header/a
		
		driver.get("https://rahulshettyacademy.com/AutomationPractice/");
		
		String sibling = driver.findElement(By.xpath("//header/div/button[1]/following-sibling::button")).getText(); // from Practice button to Login
		
		System.out.println(sibling);
		
		String loginAgain = driver.findElement(By.xpath("//header/div/button[1]/parent::div/button[2]")).getText(); // from Practice button to Parent to Login
		
		System.out.println(loginAgain);
		
	}

}
