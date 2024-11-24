package selenum.programs;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class TakingScreenShot {

	@SuppressWarnings("deprecation")
	public static void main(String[] args) {
		WebDriver driver = new ChromeDriver();//lunch chrome
		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(30,TimeUnit.SECONDS);
		driver.get("https://www.google.com/");
		
//		Take screenshot and store in file format
		File src = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
//		Now copy the file to desired location
//		FileUtils.copyFiles(src, new File("C:/Users/Sambit/Downloads/google.png"));
	}

	 

}
