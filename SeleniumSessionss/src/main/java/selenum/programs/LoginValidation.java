package selenum.programs;

import org.openqa.selenium.By;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class LoginValidation {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.get("https://freecrm.com/");
		driver.findElement(By.xpath("/html/body/div[1]/header/div/nav/div[2]/div/div[2]/ul/a/span[2]")).click();
		driver.findElement(By.name("email")).sendKeys("bekarr69@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Test@123");
		driver.findElement(By.xpath("//*[@id=\"ui\"]/div/div/form/div/div[3]")).click();
		
//		driver.switchTo().frame("");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.xpath("//a[contains(text(),'Free account')]"))).build().perform();
		
//		driver.findElement(By.xpath("//a[contains(text(),'Free account')]")).click();

	}

}
