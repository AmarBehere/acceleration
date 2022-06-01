package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Radiobutton {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", "resources/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/radio-button");
		
	WebElement YesRadioButton =driver.findElement(By.xpath("//label[@for='yesRadio']"));
	YesRadioButton.click();
	
	WebElement NoButton =driver.findElement(By.xpath("//input[@id = 'noRadio']"));
	
	
	//System.out.println(NoButton.isEnabled());
	}

}
