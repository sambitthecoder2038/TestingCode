package selenum.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class CustomXpath {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.get("https://www.ebay.com/");
		
		driver.findElement(By.xpath("//input[@class='gh-tb ui-autocomplete-input']")).sendKeys("shoes");
		
//		driver.findElement(By.xpath("//input[contains(@class='gh-tb ui-autocomplete-input')]")).sendKeys("shoes");
		
//		/html/body/div[3]/div/header/div[1]/ul[1]/li[1]/span/span/a   -->absolute xpath
		
//		dynamic id:input
//		id = test_123
//		By.id("test_123")
		
//		stsrts-with
		
//		driver.findElement(By.xpath("//input[contains(@class='gh-tb ui-autocomplete-input')]")).sendKeys("shoes");
//		driver.findElement(By.xpath("//input[starts-with(@class='gh-tb ui-autocomplete-input')]")).sendKeys("shoes");
//		driver.findElement(By.xpath("//input[ends-with(@class='gh-tb ui-autocomplete-input')]")).sendKeys("shoes");
		
//		for link : custom xpath
		driver.findElement(By.xpath("//a[contains(text(),'register')]")).click();
	}

}
