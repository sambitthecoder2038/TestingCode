package selenum.programs;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PopOfAlert {

	public static void main(String[] args) throws InterruptedException {
		WebDriver driver = new ChromeDriver();// lunch chrome
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		Thread.sleep(5000);
		Alert al = driver.switchTo().alert();
		
		System.out.println(al.getText());//get the text of alert pop of
		al.accept();
		al.dismiss();
	}

}
