package selenum.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDrop {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.manage().window().maximize();//for lunch in fullscreen
		driver.manage().deleteAllCookies();//1st delete all cookies then lunch
		driver.get("https://jqueryui.com/droppable/");
		
		driver.switchTo().frame(0);//switch to frames if it is present
		
		Actions action = new Actions(driver);//for mouse movement we create action class
		action.clickAndHold(driver.findElement(By.xpath("//*[@id=\"draggable\"]")))
		.moveToElement(driver.findElement(By.xpath("//*[@id=\"droppable\"]")))
		.release()
		.build()
		.perform();
	}

}
