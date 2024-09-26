package task9.GuviTask;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
public class Firefox {

	public static void main(String[] args) {

		WebDriver driver=new FirefoxDriver();	
		driver.manage().window().maximize();
		
	    driver.get("https://www.google.com/");
	    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	    String URL=driver.getCurrentUrl();	
		System.out.println(URL);
		driver.navigate().refresh();
		driver.close();
	
	
	}

}
