package Project;

import org.openqa.selenium.By;	
import org.openqa.selenium.WebDriver;		
import org.openqa.selenium.chrome.ChromeDriver;		

public class mylinks {				
    		
    public static void main(String[] args) {									
        String baseUrl = "http://demo.guru99.com/selenium/link.html";					
        System.setProperty("webdriver.chrome.driver","/Users/anjalimutha/Downloads/chromedriver");					
        WebDriver driver = new ChromeDriver();					
        		
        driver.get(baseUrl);					
        driver.findElement(By.partialLinkText("here")).click();					
        System.out.println("title of page is: " + driver.getTitle());							
        driver.quit();			
    }		

}		