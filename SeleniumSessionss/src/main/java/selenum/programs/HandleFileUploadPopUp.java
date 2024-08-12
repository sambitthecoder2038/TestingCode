package selenum.programs;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HandleFileUploadPopUp {

	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();// lunch chrome
		driver.get("https://developer.mozilla.org/en-US/docs/Web/HTML/Element/input/file");
		driver.findElement(By.xpath("//*[@id=\"avatar\"]")).sendKeys("F:\\Web development\form.html");
	}

}
