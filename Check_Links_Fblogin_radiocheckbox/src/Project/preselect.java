package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;


public class preselect {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/anjalimutha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("http://demo.guru99.com/selenium/newtours/register.php");
		
		Select drpcountry = new Select(driver.findElement(By.name("country")));
		drpcountry.selectByVisibleText("FIJI");
		drpcountry.selectByIndex(0);
		
}
}
