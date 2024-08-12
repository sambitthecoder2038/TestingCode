package selenum.programs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;

public class SuffariTest {

	public static void main(String[] args) {
		WebDriver drive = new SafariDriver();
		drive.get("https://www.google.com");
		System.out.println(drive.getTitle());
	}

}
