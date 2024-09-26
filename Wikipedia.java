package task9.GuviTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class Wikipedia {

	public static void main(String[] args) {
	
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://www.google.com/");
		driver.navigate().to("https://en.wikipedia.org/wiki/Wiki");
		driver.findElement(By.className("cdx-text-input__input")).sendKeys("Artificial intelligence");
		driver.findElement(By.xpath("//button[contains(@class,'cdx-button cdx-button--action-default cdx-button--weight-normal cdx-button--size-medium cdx-button--framed cdx-search-input__end-button')]")).click();
		driver.findElement(By.id("ca-history")).click();
		System.out.println("Title of this page is : "+driver.findElement(By.cssSelector("h1.firstHeading.mw-first-heading")).getText());
		

	}

}
