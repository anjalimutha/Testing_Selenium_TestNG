package Project;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;


public class radiocheckbox {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","/Users/anjalimutha/Downloads/chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get(" http://demo.guru99.com/selenium/webform/radio.html");
		
		//WebElement radio1 = driver.findElement(By.id("vfb-7-1"));
		//WebElement radio2 = driver.findElement(By.id("vfb-7-2"));
		
		//radio1.click();
		//radio2.click();
		
		WebElement check1 = driver.findElement(By.id("vfb-6-0"));
		check1.click();
		
		if(check1.isSelected()) {
			System.out.println("Checkbox is toggled On");
		
		}else {
			System.out.println("Checkbox is toggled Off");
		}
			
		check1.click();
		
		if(!check1.isSelected()) {
			System.out.println("Checkbox is now toggled Off");
		}
		
		
		driver.close();
		
	}
	

}
