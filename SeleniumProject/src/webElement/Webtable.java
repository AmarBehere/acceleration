package webElement;

import java.awt.List;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webtable {

	public static <WebElement> void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/webtables");
		List<WebElement> columnname=driver.findElements(By.xpath("//div[@role='columnheader']"));
	
	
	
	
	}

}
