package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Webelementoperation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
	System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");

	ChromeDriver driver = new ChromeDriver();
	
	driver.get("https://demoqa.com/text-box");
	    System.out.println(driver.getTitle());
   driver.manage().window().maximize();
	
	
WebElement Fullname = driver.findElement(By.xpath( "//input[@placeholder='Full Name']"));

	
	Fullname.sendKeys("Testing");
	
	WebElement Email = driver.findElement(By.cssSelector("input[autocomplete='off'][placeholder='name@example.com']"));
	
	Email.sendKeys ("test@test.com");
	Fullname.clear();
	Fullname.sendKeys("mynewvalue");
	System.out.println(Fullname.getTagName());
		
	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.scrollBy(0,350)","");
	
	WebElement submit=driver.findElement(By.id("submit"));
	submit.click();
	
	
	//System.out.println(submit.getText());
	
	
	//System.out.println(Fullname.getAttribute("id"));
	
	
	
	//tagname[@attribute="attributevalue"]
	
	//input[@placeholder="Full Name"]
	
	tagname[attribute="attributevalue"]
	
	}

	private static By BycssSelector(String string) {
		// TODO Auto-generated method stub
		return null;
	}
}

