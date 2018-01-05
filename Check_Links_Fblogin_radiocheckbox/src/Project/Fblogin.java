package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class Fblogin {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/anjalimutha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://www.facebook.com");
		
		WebElement email = driver.findElement(By.id("email"));
		WebElement password = driver.findElement(By.name("pass"));
		email.sendKeys("abc@gmail.com");
		password.sendKeys("abc123");
		email.clear();
		password.clear();
		WebElement login = driver.findElement(By.id("loginbutton"));
		login.click();
		password.submit();
		
		
		
	}
	

}
