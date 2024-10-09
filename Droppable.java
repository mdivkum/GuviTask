package task10.GuviTask10.GuviTask;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class Droppable {

	public static void main(String[] args) {

		WebDriver driver=new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(2));
		driver.get("https://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement element=driver.findElement(By.id("draggable"));
		WebElement element1=driver.findElement(By.id("droppable"));
		Actions obj=new Actions(driver);
		obj.dragAndDrop(element, element1).build().perform(); 
	    String x=element1.getText();
		
		if(x.equalsIgnoreCase("Dropped!"))
		{
			System.out.println("Drag and Drop successful");
		}else {
			System.out.println("Dragging is not successful");
		}

	}

}
