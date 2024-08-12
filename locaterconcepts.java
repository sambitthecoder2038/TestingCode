package selenum.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class locaterconcepts {
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// lunch chrome
		driver.get("https://www.flipkart.com/account/login?ret=/");

//		using Xpath
		driver.findElement(By.xpath("//*[@id=\"container\"]/div/div[3]/div/div[2]/div/form/div[1]/input"))
				.sendKeys("9438146188");

		
		  // using id driver.findElement(By.id("businessName")).sendKeys("Sambit");
		  driver.findElement(By.id("")).sendKeys("9040794923");
		 

//		   using linkText
		   driver.findElement(By.linkText("New to Flipkart? Create an account")).click();
			String  title = driver.getTitle();//getting the title

			System.out.println(title);
//			driver.quit();
	}
}
