package selenum.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class MouseMovementConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.manage().window().maximize();//for lunch in fullscreen
		driver.manage().deleteAllCookies();//1st delete all cookies then lunch
		driver.get("https://www.spicejet.com/");
		Actions act = new Actions(driver);
		act.moveToElement(driver.findElement(By.linkText("SpiceClub "))).build().perform();
		driver.findElement(By.linkText("Tiers")).click();
	}

}
