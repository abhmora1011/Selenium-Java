package assignments;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class sample {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();


		driver.manage().window().maximize();

		driver.get("https://demoblaze.com/index.html");
		
		driver.findElement(By.id("login2")).click();
		
		Thread.sleep(3000);
		
		driver.findElement(By.id("loginusername")).sendKeys("abethegreat");
		
		driver.findElement(By.id("loginpassword")).sendKeys("abe123");
		
		Thread.sleep(2000);
		
		driver.findElement(By.xpath("//*[@id=\"logInModal\"]/div/div/div[3]/button[2]")).click();

	}

}
