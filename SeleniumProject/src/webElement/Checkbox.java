package webElement;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Checkbox {

	private static String id;

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	
		System.setProperty("webdriver.chrome.driver", "Resources/chromedriver.exe");

		ChromeDriver driver = new ChromeDriver();
		
		driver.get("https://demoqa.com/checkbox");
		    System.out.println(driver.getTitle());
	  // driver.manage().window().maximize();
	WebElement hometoggle = driver.findElement(By.xpath("//button[@aria-label=\"Toggle\"]"));
	hometoggle.click();
	
	WebElement desktoptoggle = driver.findElement(By.xpath("//span[text()='Desktop'] //parent::label//preceding-sibling::button"));
	
	desktoptoggle.click();

	   WebElement desktopcheckbox = driver.findElement(By.xpath("//label[@for=\"tree-node-desktop\"]//span[@class=\"rct-checkbox\"]"));
		 
	   desktopcheckbox.click();

	   WebElement text = driver.findElement(By.id("result"));
	  
	   System.out.println(text.getText());
	  
	   WebElement documenttoggle = driver.findElement(By.xpath("//label[@for=\"tree-node-documents\"]// preceding-sibling::button"));
	   
	   documenttoggle.click();
	   
	   WebElement officelabel = driver.findElement(By.xpath("//span[text()='Office']"));
	
			   System.out.println(officelabel.getText());
			   
			   
			 
			   
			   
	   
}}