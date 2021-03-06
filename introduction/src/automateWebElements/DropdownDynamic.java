package automateWebElements;


import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DropdownDynamic {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Abraham Ora\\Desktop\\Selenium\\driver\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
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
