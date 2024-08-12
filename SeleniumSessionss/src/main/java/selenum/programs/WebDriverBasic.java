package selenum.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebDriverBasic {

	public static void main(String[] args) {
//		chrome browser validation
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.get("https://scholarship.odisha.gov.in");
		String title = driver.getTitle();//getting the title
		System.out.println(title);
		System.out.println(driver.getCurrentUrl());
		driver.quit();//close the browser automatically
	}

}
