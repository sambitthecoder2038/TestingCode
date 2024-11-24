package selenum.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Nevigation {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		
		driver.get("https://www.google.com/");	
		
		driver.navigate().to("https://www.amazon.com/");
		
//		Back and forward simulation
		
		driver.navigate().back();
		
		Thread.sleep(2000);
		
		driver.navigate().forward();
		
		Thread.sleep(2000);
		
		driver.navigate().back();
		
//		Refresh the browser
		
		driver.navigate().refresh();

	}

}
