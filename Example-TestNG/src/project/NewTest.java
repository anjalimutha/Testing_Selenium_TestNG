package project;
import java.io.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class NewTest {
	@Test
	public void MyTestCase() {
	System.setProperty("webdriver.chrome.driver","//Users//anjalimutha//Downloads//chromedriver");
	WebDriver driver = new ChromeDriver();
	String baseUrl = "http://www.facebook.com";
	String tagName = "";
	
	
	driver.get(baseUrl);
	tagName = driver.findElement(By.id("email")).getTagName();
	System.out.println(tagName);
	driver.close();
}
}
