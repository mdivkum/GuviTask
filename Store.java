
package task9.GuviTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Store {

	public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://www.google.com/");
        driver.navigate().to("https://www.demoblaze.com/");
       // WebElement s=driver.findElement(By.id("nava"));
       // System.out.println(s);
        if(driver.findElement(By.id("nava")).getText()=="STORE") {
        	
        	System.out.println("Page Landed on correct Website");
        
        	
        }
        	else
        	{
        		String s=driver.findElement(By.id("nava")).getText();
        		
        		System.out.println("Page Landed on incorrect Website");
        		
        		System.out.println("Title for the given URL is : " +s);
        	}
        	
        }
      

	}

