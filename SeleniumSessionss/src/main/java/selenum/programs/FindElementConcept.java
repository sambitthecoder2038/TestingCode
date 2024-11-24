package selenum.programs;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FindElementConcept {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.get("https://www.ebay.com/");
		
//		1)Get total count of links on the page
//		2)Get the text of each link on the page
		
		List<WebElement> listOfLink = driver.findElements(By.tagName("a"));
		
//		size of listoflink
		System.out.println(listOfLink.size());
		
		
		for(int i = 0;i<listOfLink.size();i++) {
			String linkText = listOfLink.get(i).getText();
			System.out.println(linkText);
		}

	}

}
